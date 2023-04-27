package ui.catalogue.domain.model.customer.identifier;

/**
 * 顧客番号
 */
public final class CustomerNumber {
    private final String value;

    public CustomerNumber() {
        this("");
    }

    public CustomerNumber(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
