package ui.catalogue.domain.model.sales.order.item;

import ui.catalogue.domain.model.sales.product.SalesProduct;
import ui.catalogue.domain.primitive.Amount;
import ui.catalogue.domain.primitive.Quantity;

/**
 * 受注明細
 */
public class SalesOrderItem {
    SalesProduct salesProduct;
    Quantity quantity;

    public SalesProduct salesProduct() {
        return salesProduct;
    }

    public Quantity quantity() {
        return quantity;
    }

    public Amount retailPrice() {
        return salesProduct.price().retailPrice();
    }
}
