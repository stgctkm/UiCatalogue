package ui.catalogue.domain.model.sales.product.content;

import jakarta.validation.constraints.AssertTrue;
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

    Price() {
        this(new Amount(), new Amount());
    }

    public Price(Amount retailPrice, Amount listPrice) {
        this.retailPrice = retailPrice;
        this.listPrice = listPrice;
    }

    boolean retailPricePositive;
    @AssertTrue(message = "販売価格を入力してください")
    boolean isRetailPricePositive() {
        return retailPrice.isGreaterThan(new Amount("0"));
    }

    boolean listPricePositive;
    @AssertTrue(message = "通常価格を入力してください")
    boolean isListPricePositive() {
        return listPrice.isGreaterThan(new Amount("0"));
    }

    boolean validRetailPrice;
    @AssertTrue(message = "販売価格は通常価格以下の価格を入力してください")
    boolean isValidRetailPrice() {
        return listPrice.isGreaterThan(retailPrice);
    }

}
