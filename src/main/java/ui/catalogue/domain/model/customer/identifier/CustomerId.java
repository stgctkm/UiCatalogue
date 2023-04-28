package ui.catalogue.domain.model.customer.identifier;

import java.util.UUID;

/**
 * 顧客ID
 */
public final class CustomerId {
    private final String value;

    public CustomerId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static CustomerId newCustomerId() {
        return new CustomerId(UUID.randomUUID().toString());
    }

    public String value() {
        return value;
    }

}
