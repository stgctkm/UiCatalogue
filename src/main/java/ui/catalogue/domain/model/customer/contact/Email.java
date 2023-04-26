package ui.catalogue.domain.model.customer.contact;

/**
 * Emailアドレス
 */
public record Email(String value) {
    @Override
    public String toString() {
        return value;
    }
}
