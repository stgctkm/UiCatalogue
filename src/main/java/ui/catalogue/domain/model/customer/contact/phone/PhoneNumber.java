package ui.catalogue.domain.model.customer.contact.phone;

/**
 * 電話番号
 */
public record PhoneNumber(String value) {
    @Override
    public String toString() {
        return value;
    }
}
