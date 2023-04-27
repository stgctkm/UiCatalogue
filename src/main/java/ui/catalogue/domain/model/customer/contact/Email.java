package ui.catalogue.domain.model.customer.contact;

/**
 * Emailアドレス
 */
public final class Email {
    private final String value;

    public Email() {
        this("");
    }

    public Email(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
