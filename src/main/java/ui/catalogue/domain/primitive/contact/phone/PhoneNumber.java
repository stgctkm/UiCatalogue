package ui.catalogue.domain.primitive.contact.phone;

/**
 * 電話番号
 */
public final class PhoneNumber {
    private final String value;

    public PhoneNumber() {
        this("");
    }

    public PhoneNumber(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
