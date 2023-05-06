package ui.catalogue.domain.model.invoice.content;

import ui.catalogue.domain.model.sales.order.content.SalesOrderDate;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderNumber;
import ui.catalogue.domain.primitive.amount.Amount;

public class InvoicedSalesOrder {

    SalesOrderId salesOrderId;
    SalesOrderNumber salesOrderNumber;
    SalesOrderDate salesOrderDate;
    Amount orderedAmount;

    public SalesOrderId salesOrderId() {
        return salesOrderId;
    }

    public SalesOrderNumber salesOrderNumber() {
        return salesOrderNumber;
    }

    public SalesOrderDate salesOrderDate() {
        return salesOrderDate;
    }

    public Amount orderedAmount() {
        return orderedAmount;
    }
}
