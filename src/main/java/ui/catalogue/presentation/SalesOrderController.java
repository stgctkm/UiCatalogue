package ui.catalogue.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 検索 & 一覧操作 → 詳細
 */
@Controller
@RequestMapping("sales-orders")
public class SalesOrderController {

    @GetMapping
    String start() {
        return "sales-orders/search";
    }

    @GetMapping(params = "q=")
    String search() {
        return "sales-orders/search-and-list";
    }

    @GetMapping("{salesOrderId}")
    String detail(@PathVariable String salesOrderId) {
        return "sales-orders/detail";
    }

}
