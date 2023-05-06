package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ui.catalogue.application.service.invoice.InvoiceService;
import ui.catalogue.domain.model.invoice.Invoice;
import ui.catalogue.domain.model.invoice.identifier.InvoiceId;
import ui.catalogue.domain.model.invoice.summary.InvoiceSummaries;

/**
 * 一覧操作 & 詳細
 */
@Controller
@RequestMapping("invoices")
class InvoiceController {
    InvoiceService invoiceService;

    InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    String list(Model model) {
        InvoiceSummaries summaries = invoiceService.summaries();
        model.addAttribute("summaries", summaries);
        return "invoice/list";
    }

    @GetMapping("{invoiceId}")
    String detail(@PathVariable("invoiceId") InvoiceId invoiceId,
                  Model model) {
        InvoiceSummaries summaries = invoiceService.summaries();
        model.addAttribute("summaries", summaries);

        Invoice invoice = invoiceService.invoiceOf(invoiceId);
        model.addAttribute("invoice", invoice);

        return "invoice/list-and-detail";
    }
}
