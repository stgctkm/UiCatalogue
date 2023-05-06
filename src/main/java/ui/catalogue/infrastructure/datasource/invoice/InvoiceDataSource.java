package ui.catalogue.infrastructure.datasource.invoice;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.invoice.InvoiceRepository;
import ui.catalogue.domain.model.invoice.Invoice;
import ui.catalogue.domain.model.invoice.content.InvoicedSalesOrder;
import ui.catalogue.domain.model.invoice.content.InvoicedSalesOrders;
import ui.catalogue.domain.model.invoice.identifier.InvoiceId;
import ui.catalogue.domain.model.invoice.summary.InvoiceSummaries;
import ui.catalogue.domain.model.invoice.summary.InvoiceSummary;

import java.util.List;

@Repository
public class InvoiceDataSource implements InvoiceRepository {

    InvoiceMapper invoiceMapper;

    InvoiceDataSource(InvoiceMapper invoiceMapper) {
        this.invoiceMapper = invoiceMapper;
    }

    @Override
    public InvoiceSummaries summaries() {
        List<InvoiceSummary> list = invoiceMapper.summaries();
        return new InvoiceSummaries(list);
    }

    @Override
    public Invoice invoiceOf(InvoiceId invoiceId) {
        Invoice invoice = invoiceMapper.invoiceOf(invoiceId);
        List<InvoicedSalesOrder> list = invoiceMapper.invoicedSalesOrder(invoiceId);
        return invoice.withSalesOrder(new InvoicedSalesOrders(list));
    }
}
