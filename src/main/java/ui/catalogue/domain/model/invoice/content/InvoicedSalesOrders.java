package ui.catalogue.domain.model.invoice.content;

import ui.catalogue.domain.primitive.amount.TotalAmount;

import java.util.List;
import java.util.stream.Collectors;

public class InvoicedSalesOrders {
    List<InvoicedSalesOrder> list;

    public InvoicedSalesOrders(List<InvoicedSalesOrder> list) {
        this.list = list;
    }

    public List<InvoicedSalesOrder> list() {
        return list;
    }

    public TotalAmount totalAmount() {
        return new TotalAmount(list.stream()
                .map(InvoicedSalesOrder::orderedAmount)
                .collect(Collectors.toUnmodifiableSet()));
    }
}
