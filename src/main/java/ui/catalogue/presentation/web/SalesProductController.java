package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
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

    @InitBinder("salesProductSearchCriteria")
    void bindCriteria(WebDataBinder binder) {
        binder.setAllowedFields(
                "salesPeriod.from",
                "salesPeriod.to",
                "name"
        );
    }
}
