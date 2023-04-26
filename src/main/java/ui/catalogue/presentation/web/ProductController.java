package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 検索 & 詳細
 */
@Controller
@RequestMapping("products")
public class ProductController {

    @GetMapping
    String start() {
        return "product/search";
    }

    @GetMapping("{productCode}")
    String search(@PathVariable String productCode) {
        return "product/search-and-detail";
    }

}
