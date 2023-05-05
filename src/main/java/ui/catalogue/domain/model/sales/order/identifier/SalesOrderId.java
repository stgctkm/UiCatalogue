package ui.catalogue.domain.model.sales.order.identifier;

/**
 * 受注ID
 */
public class SalesOrderId {
    String value;

    @Deprecated
    SalesOrderId() {
        this("");
    }

    public SalesOrderId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
