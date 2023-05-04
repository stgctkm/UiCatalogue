package ui.catalogue.domain.model.sales.order;

import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.sales.order.content.SalesOrderDate;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderNumber;
import ui.catalogue.domain.model.sales.order.item.SalesOrderItems;
import ui.catalogue.domain.primitive.contact.address.Address;

/**
 * 受注
 */
public class SalesOrder {
    SalesOrderNumber salesOrderNumber;

    SalesOrderDate salesOrderDate;

    Customer customer;

    Address shippingAddress;

    SalesOrderItems salesOrderItems;

    public SalesOrderNumber salesOrderNumber() {
        return salesOrderNumber;
    }

    public SalesOrderDate salesOrderDate() {
        return salesOrderDate;
    }

    public Customer customer() {
        return customer;
    }

    public Address shippingAddress() {
        return shippingAddress;
    }

    public SalesOrderItems salesOrderItems() {
        return salesOrderItems;
    }
}
