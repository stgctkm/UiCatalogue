package ui.catalogue.domain.model.customer.identifier;

/**
 * 顧客名称
 */
public final class CustomerName {
    final String name;
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
