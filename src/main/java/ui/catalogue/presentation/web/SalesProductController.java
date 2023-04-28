package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ui.catalogue.application.service.sales.product.SalesProductService;
import ui.catalogue.domain.model.sales.product.SalesProduct;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductId;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummaries;

@Controller
@RequestMapping("sales-products")
public class SalesProductController {

    SalesProductService salesProductService;

    SalesProductController(SalesProductService salesProductService) {
        this.salesProductService = salesProductService;
    }

    @GetMapping
    String start(@ModelAttribute("salesProductSearchCriteria") SalesProductSearchCriteria criteria) {
        return "sales-product/search";
    }

    @GetMapping(params = "q")
    String search(
            @ModelAttribute("salesProductSearchCriteria") SalesProductSearchCriteria criteria,
            Model model) {
        SalesProductSummaries summaries = salesProductService.summariesOf(criteria);
        model.addAttribute("summaries", summaries);
        return "sales-product/search";
    }

    @GetMapping("new")
    String newSalesProduct() {
        return "sales-product/new";
    }

    @GetMapping("{salesProductId}")
    String salesProduct(
            @PathVariable SalesProductId salesProductId,
            Model model) {
        SalesProduct salesProduct = salesProductService.salesProductOf(salesProductId);
        model.addAttribute("salesProduct", salesProduct);
        return "sales-product/editor";
    }

    @PutMapping("{salesProductId}")
    String update(
            @PathVariable("salesProductId") SalesProductId salesProductId,
            @ModelAttribute("salesProduct") SalesProduct salesProduct,
            RedirectAttributes redirectAttributes) {
        salesProductService.update(salesProductId, salesProduct);
        redirectAttributes.addFlashAttribute("message", "販売商品を更新しました");
        return "redirect:/sales-products";
    }

    @InitBinder("salesProductSearchCriteria")
    void bindCriteria(WebDataBinder binder) {
        binder.setAllowedFields(
                "salesPeriod.from",
                "salesPeriod.to",
                "name"
        );
    }

    @InitBinder("salesProduct")
    void bindSalesProduct(WebDataBinder binder) {
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
