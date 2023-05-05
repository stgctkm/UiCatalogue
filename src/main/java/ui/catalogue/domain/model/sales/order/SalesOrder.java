package ui.catalogue.domain.model.sales.order;

import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.sales.order.content.SalesOrderDate;
import ui.catalogue.domain.model.sales.order.content.ShippingFee;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderNumber;
import ui.catalogue.domain.model.sales.order.item.SalesOrderItems;
import ui.catalogue.domain.primitive.amount.Amount;
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

    @Deprecated
    SalesOrder() {
    }

    public SalesOrder(SalesOrder salesOrder, SalesOrderItems salesOrderItems) {
        this.salesOrderNumber = salesOrder.salesOrderNumber;
        this.salesOrderDate = salesOrder.salesOrderDate;
        this.customer = salesOrder.customer;
        this.shippingAddress = salesOrder.shippingAddress;
        this.salesOrderItems = salesOrderItems;
    }

    /**
     * 税抜き金額
     */
    public Amount amountExcludingTax() {
        return salesOrderItems.amountExcludingTax();
    }

    /**
     * 税込金額
     */
    public Amount amountIncludingTax() {
        return salesOrderItems.amountIncludingTax();
    }

    /**
     * 税額
     */
    public Amount tax() {
        return salesOrderItems.tax();
    }

    /**
     * 送料
     */
    public ShippingFee shippingFee() {
        return new ShippingFee(amountExcludingTax());
    }

    /**
     * 合計金額
     */
    public Amount totalAmount() {
        return amountIncludingTax().add(shippingFee().amount());
    }


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
