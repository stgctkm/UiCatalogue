package ui.catalogue.domain.model.sales.product.identifier;

/**
 * 販売商品コード
 */
public class SalesProductCode {
    String value;

    SalesProductCode() {
        this("");
    }

    public SalesProductCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
