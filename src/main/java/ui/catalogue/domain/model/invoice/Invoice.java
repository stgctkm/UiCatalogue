package ui.catalogue.domain.model.invoice;

import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.invoice.content.InvoiceDate;
import ui.catalogue.domain.model.invoice.content.InvoicedSalesOrders;
import ui.catalogue.domain.model.invoice.identifier.InvoiceNumber;
import ui.catalogue.domain.primitive.amount.TotalAmount;

/**
 * 請求
 */
public class Invoice {
    InvoiceNumber invoiceNumber;
    InvoiceDate invoiceDate;
    Customer customer;

    InvoicedSalesOrders invoicedSalesOrders;

    @Deprecated
    Invoice() {
    }

    public Invoice(InvoiceNumber invoiceNumber, InvoiceDate invoiceDate, Customer customer, InvoicedSalesOrders invoicedSalesOrders) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
        this.invoicedSalesOrders = invoicedSalesOrders;
    }

    public TotalAmount totalAmount() {
        return invoicedSalesOrders.totalAmount();
    }

    public InvoiceNumber invoiceNumber() {
        return invoiceNumber;
    }

    public InvoiceDate invoiceDate() {
        return invoiceDate;
    }

    public Customer customer() {
        return customer;
    }

    public InvoicedSalesOrders invoicedSalesOrders() {
        return invoicedSalesOrders;
    }

    public Invoice withSalesOrder(InvoicedSalesOrders invoicedSalesOrders) {
        return new Invoice(invoiceNumber, invoiceDate, customer, invoicedSalesOrders);
    }
}
