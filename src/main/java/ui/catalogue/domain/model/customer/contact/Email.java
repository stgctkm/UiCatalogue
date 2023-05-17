package ui.catalogue.domain.model.customer.contact;

import jakarta.validation.constraints.NotBlank;

/**
 * Emailアドレス
 */
public final class Email {
    @jakarta.validation.constraints.Email(message = "Eメールの形式で入力してください")
    @NotBlank(message = "メールアドレスを入力してください")
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
