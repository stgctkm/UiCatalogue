package ui.catalogue.domain.model.shipping.summary;

import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.sales.order.content.SalesOrderDate;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderNumber;
import ui.catalogue.domain.model.shipping.content.InstructedDate;
import ui.catalogue.domain.model.shipping.content.ShippingDate;
import ui.catalogue.domain.model.shipping.content.ShippingStatus;

/**
 * 出荷サマリー
 */
public class ShippingSummary {
    ShippingDate shippingDate;
    InstructedDate instructedDate;
    SalesOrderId salesOrderId;
    SalesOrderNumber salesOrderNumber;
    SalesOrderDate salesOrderDate;
    CustomerName customerName;
    ShippingStatus shippingStatus;

    public ShippingDate shippingDate() {
        return shippingDate;
    }

    public InstructedDate instructedDate() {
        return instructedDate;
    }

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

    public ShippingStatus shippingStatus() {
        return shippingStatus;
    }
}
