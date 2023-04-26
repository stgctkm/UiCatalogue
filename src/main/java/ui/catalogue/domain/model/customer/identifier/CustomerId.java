package ui.catalogue.domain.model.customer.identifier;

/**
 * 顧客ID
 */
public record CustomerId(String value) {
    @Override
    public String toString() {
        return value;
    }
}
