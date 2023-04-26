package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sales-products")
public class SalesProductController {

    @GetMapping
    String start() {
        return "sales-product/search";
    }

    @GetMapping(params = "q")
    String search() {
        return "sales-product/search-and-list";
    }

    @GetMapping("new")
    String newSalesProduct() {
        return "sales-product/new";
    }

    @GetMapping("{salesProductNumber}")
    String salesProduct(@PathVariable String salesProductNumber) {
        return "sales-product/editor";
    }
}
