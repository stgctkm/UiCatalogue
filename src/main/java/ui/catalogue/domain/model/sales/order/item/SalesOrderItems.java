package ui.catalogue.domain.model.sales.order.item;

import ui.catalogue.domain.primitive.amount.Amount;
import ui.catalogue.domain.primitive.amount.Rate;
import ui.catalogue.domain.primitive.amount.TotalAmount;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 受注明細のリスト
 */
public class SalesOrderItems {
    List<SalesOrderItem> list;

    public SalesOrderItems(List<SalesOrderItem> list) {
        this.list = list;
    }

    public List<SalesOrderItem> list() {
        return list;
    }

    /**
     * 税抜き金額
     */
    public Amount amountExcludingTax() {
        return totalAmountExcludingTax().total();
    }

    /**
     * 税込金額
     */
    public Amount amountIncludingTax() {
        return amountExcludingTax().add(tax());
    }

    /**
     * 税額
     */
    public Amount tax() {
        return totalAmountExcludingTax().total().multiply(new Rate(new BigDecimal("0.1")));
    }


    TotalAmount totalAmountExcludingTax() {
        return new TotalAmount(list.stream()
                .map(SalesOrderItem::retailPrice)
                .collect(Collectors.toUnmodifiableSet()));
    }

}
