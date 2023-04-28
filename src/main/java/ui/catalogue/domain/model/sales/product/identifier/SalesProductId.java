package ui.catalogue.domain.model.sales.product.identifier;

import java.util.UUID;

public class SalesProductId {
    String value;

    SalesProductId() {
        this("");
    }

    public SalesProductId(String value) {
        this.value = value;
    }

    public static SalesProductId newSalesProductId() {
        return new SalesProductId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return value;
    }
}
