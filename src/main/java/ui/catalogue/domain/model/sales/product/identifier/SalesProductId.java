package ui.catalogue.domain.model.sales.product.identifier;

public class SalesProductId {
    String value;

    SalesProductId() {
        this("");
    }

    public SalesProductId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
