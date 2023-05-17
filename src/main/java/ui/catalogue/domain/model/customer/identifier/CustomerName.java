package ui.catalogue.domain.model.customer.identifier;

import jakarta.validation.constraints.NotBlank;

/**
 * 顧客名称
 */
public final class CustomerName {
    @NotBlank(message = "顧客名称を入力して下さい")
    final String name;
    @NotBlank(message = "顧客名称カナを入力して下さい")
    final String nameKana;

    public CustomerName() {
        this("", "");
    }

    public CustomerName(
            String name,
            String nameKana
    ) {
        this.name = name;
        this.nameKana = nameKana;
    }

    public String name() {
        return name;
    }

    public String nameKana() {
        return nameKana;
    }

}
