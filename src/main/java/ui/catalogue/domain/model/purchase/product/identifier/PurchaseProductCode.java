package ui.catalogue.domain.model.purchase.product.identifier;

/**
 * 仕入商品コード
 */
public class PurchaseProductCode {
    String value;

    @Deprecated
    PurchaseProductCode() {
        this("");
    }

    public PurchaseProductCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

