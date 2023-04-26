package ui.catalogue.domain.model.customer.contact.address;

/**
 * 郵便番号
 */
public record PostalCode(String value) {
    @Override
    public String toString() {
        return value;
    }
}
