package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ui.catalogue.application.service.sales.jewelry.JewelryService;
import ui.catalogue.domain.model.sales.jewelry.Jewelry;
import ui.catalogue.domain.model.sales.jewelry.criteria.JewelryCriteria;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryId;
import ui.catalogue.domain.model.sales.jewelry.summary.JewelrySummaries;

/**
 * 検索 → 検索 → 一覧操作
 */
@Controller
@RequestMapping("jewelries")
class JewelryController {

    JewelryService jewelryService;

    JewelryController(JewelryService jewelryService) {
        this.jewelryService = jewelryService;
    }

    @GetMapping
    String list(
            @ModelAttribute JewelryCriteria criteria,
            Model model) {
        JewelrySummaries summaries = jewelryService.summaries(criteria);
        model.addAttribute("summaries", summaries);
        return "jewelry/list";
    }

    @GetMapping("{jewelryId}")
    String detail(@PathVariable JewelryId jewelryId,
                  Model model) {
        Jewelry jewelry = jewelryService.jewelryOf(jewelryId);
        model.addAttribute("jewelry", jewelry);
        return "jewelry/detail";
    }

    @GetMapping("{jewelryId}/edit")
    String edit(@PathVariable JewelryId jewelryId,
                Model model) {
        Jewelry jewelry = jewelryService.jewelryOf(jewelryId);
        model.addAttribute("jewelry", jewelry);
        return "jewelry/editor";
    }

    @PutMapping("{jewelryId}")
    String update(@ModelAttribute("jewelry") Jewelry jewelry,
                  @PathVariable("jewelryId") JewelryId jewelryId) {
        jewelryService.update(jewelry, jewelryId);
        return "redirect:/jewelries/{jewelryId}";
    }

    @InitBinder("jewelry")
    void bindJewelry(WebDataBinder binder) {
        binder.setAllowedFields(
                "salesProductName.name",
                "salesProductName.abbreviation",
                "salesPeriod.from",
                "salesPeriod.to",
                "price.retailPrice",
                "price.listPrice",
                "color",
                "size",
                "description",
                "remark"
        );
    }
}
