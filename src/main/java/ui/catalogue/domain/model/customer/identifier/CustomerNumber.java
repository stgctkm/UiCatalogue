package ui.catalogue.domain.model.customer.identifier;

/**
 * 顧客番号
 */
public record CustomerNumber(String value) {
    @Override
    public String toString() {
        return value;
    }
}
