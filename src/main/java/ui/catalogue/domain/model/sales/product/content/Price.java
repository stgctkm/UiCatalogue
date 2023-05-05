package ui.catalogue.domain.model.sales.product.content;

import ui.catalogue.domain.primitive.amount.Amount;

/**
 * 価格
 */
public class Price {
    Amount retailPrice;
    Amount listPrice;

    public Amount retailPrice() {
        return retailPrice;
    }

    public Amount listPrice() {
        return listPrice;
    }
}
