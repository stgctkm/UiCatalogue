package ui.catalogue.infrastructure.datasource.invoice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.invoice.Invoice;
import ui.catalogue.domain.model.invoice.content.InvoicedSalesOrder;
import ui.catalogue.domain.model.invoice.identifier.InvoiceId;
import ui.catalogue.domain.model.invoice.summary.InvoiceSummary;

import java.util.List;

@Mapper
interface InvoiceMapper {

    List<InvoiceSummary> summaries();

    Invoice invoiceOf(
            @Param("invoiceId") InvoiceId invoiceId);

    List<InvoicedSalesOrder> invoicedSalesOrder(@Param("invoiceId") InvoiceId invoiceId);
}
