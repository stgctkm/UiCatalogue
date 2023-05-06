package ui.catalogue.domain.model.invoice.summary;

import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.invoice.content.InvoiceDate;
import ui.catalogue.domain.model.invoice.content.OrderedYearMonth;
import ui.catalogue.domain.model.invoice.identifier.InvoiceId;
import ui.catalogue.domain.model.invoice.identifier.InvoiceNumber;

/**
 * 請求サマリー
 */
public class InvoiceSummary {
    InvoiceId invoiceId;
    InvoiceNumber invoiceNumber;
    InvoiceDate invoiceDate;
    CustomerName customerName;
    OrderedYearMonth orderedYearMonth;

    public InvoiceId invoiceId() {
        return invoiceId;
    }

    public InvoiceNumber invoiceNumber() {
        return invoiceNumber;
    }

    public InvoiceDate invoiceDate() {
        return invoiceDate;
    }

    public CustomerName customerName() {
        return customerName;
    }

    public OrderedYearMonth orderedYearMonth() {
        return orderedYearMonth;
    }
}
