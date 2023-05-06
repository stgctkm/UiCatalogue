package ui.catalogue.application.service.invoice;

import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.invoice.Invoice;
import ui.catalogue.domain.model.invoice.identifier.InvoiceId;
import ui.catalogue.domain.model.invoice.summary.InvoiceSummaries;

/**
 * 請求サービス
 */
@Service
public class InvoiceService {
    InvoiceRepository invoiceRepository;

    InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public InvoiceSummaries summaries() {
        return invoiceRepository.summaries();
    }

    public Invoice invoiceOf(InvoiceId invoiceId) {
        return invoiceRepository.invoiceOf(invoiceId);
    }
}
