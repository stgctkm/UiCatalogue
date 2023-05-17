package ui.catalogue.domain.primitive.contact.phone;

import jakarta.validation.constraints.NotBlank;

/**
 * 電話番号
 */
public final class PhoneNumber {
    @NotBlank(message = "電話番号を入力してください")
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
