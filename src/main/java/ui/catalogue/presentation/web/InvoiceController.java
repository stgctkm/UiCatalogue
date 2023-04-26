package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 一覧操作 & 詳細
 */
@Controller
@RequestMapping("invoices")
class InvoiceController {

    @GetMapping
    String list() {
        return "invoice/list";
    }

    @GetMapping("detail")
    String detail() {
        return "invoice/list-and-detail";
    }
}
