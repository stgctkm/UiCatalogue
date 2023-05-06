package ui.catalogue.application.service.invoice;

import ui.catalogue.domain.model.invoice.Invoice;
import ui.catalogue.domain.model.invoice.identifier.InvoiceId;
import ui.catalogue.domain.model.invoice.summary.InvoiceSummaries;

public interface InvoiceRepository {
    InvoiceSummaries summaries();

    Invoice invoiceOf(InvoiceId invoiceId);
}
