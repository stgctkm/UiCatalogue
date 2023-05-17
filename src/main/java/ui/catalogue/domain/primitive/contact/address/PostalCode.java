package ui.catalogue.domain.primitive.contact.address;

import jakarta.validation.constraints.NotBlank;

/**
 * 郵便番号
 */
public final class PostalCode {

    @NotBlank(message = "郵便番号を入力してください")
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
