package ui.catalogue.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 検索 → 検索 → 一覧操作
 */
@Controller
@RequestMapping("jewelries")
class JewelryController {

    @GetMapping
    String list() {
        return "jewelry/list";
    }

    @GetMapping("{salesProductNumber}")
    String detail(@PathVariable String salesProductNumber) {
        return "jewelry/detail";
    }

    @GetMapping("{salesProductNumber}/edit")
    String edit(@PathVariable String salesProductNumber) {
        return "jewelry/editor";
    }
}
