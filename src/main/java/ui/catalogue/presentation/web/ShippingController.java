package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ui.catalogue.application.service.shipping.ShippingService;
import ui.catalogue.domain.model.shipping.criteria.InstructionCriteria;
import ui.catalogue.domain.model.shipping.criteria.ShippingCriteria;
import ui.catalogue.domain.model.shipping.summary.ShippingSummaries;

@Controller
@RequestMapping("shipping")
class ShippingController {

    ShippingService shippingService;

    ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping("search1")
    String search1() {
        return "shipping/search1";
    }

    @GetMapping("search2")
    String search2(@ModelAttribute("instructionCriteria") InstructionCriteria instructionCriteria) {
        return "shipping/search2";
    }

    @GetMapping
    String list(@ModelAttribute("shippingCriteria") ShippingCriteria shippingCriteria,
                Model model) {
        ShippingSummaries summaries = shippingService.summaries(shippingCriteria);
        model.addAttribute("summaries", summaries);
        return "shipping/list";
    }

    @InitBinder("instructionCriteria")
    void bindInstructionCriteria(WebDataBinder binder) {
        binder.setAllowedFields(
                "from",
                "to",
                "shippingRegion"
        );
    }

    @InitBinder("instructionCriteria")
    void bindShippingCriteria(WebDataBinder binder) {
        binder.setAllowedFields(
                "instructedFrom",
                "instructedTo",
                "shippingRegion",
                "shippedFrom",
                "shippedTo",
                "wareHouse"
        );
    }
}
