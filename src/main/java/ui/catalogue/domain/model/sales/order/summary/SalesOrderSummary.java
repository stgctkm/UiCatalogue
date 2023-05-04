package ui.catalogue.domain.model.sales.order.summary;

import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.sales.order.content.SalesOrderDate;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderNumber;

/**
 * 受注サマリー
 */
public class SalesOrderSummary {
    SalesOrderId salesOrderId;
    SalesOrderNumber salesOrderNumber;

    SalesOrderDate salesOrderDate;

    CustomerName customerName;

    public SalesOrderId salesOrderId() {
        return salesOrderId;
    }

    public SalesOrderNumber salesOrderNumber() {
        return salesOrderNumber;
    }

    public SalesOrderDate salesOrderDate() {
        return salesOrderDate;
    }

    public CustomerName customerName() {
        return customerName;
    }
}
