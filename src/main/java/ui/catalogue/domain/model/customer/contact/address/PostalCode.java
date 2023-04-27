package ui.catalogue.domain.model.customer.contact.address;

/**
 * 郵便番号
 */
public final class PostalCode {
    private final String value;

    public PostalCode() {
        this("");
    }

    public PostalCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
