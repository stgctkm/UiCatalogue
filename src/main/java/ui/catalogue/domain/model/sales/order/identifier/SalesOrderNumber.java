package ui.catalogue.domain.model.sales.order.identifier;

/**
 * 受注番号
 */
public class SalesOrderNumber {
    String value;

    public SalesOrderNumber() {
        this("");
    }

    public SalesOrderNumber(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
