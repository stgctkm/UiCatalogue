package ui.catalogue.domain.model.customer.contact.address;

/**
 * 住所
 */
public class Address {
    private final PostalCode postalCode;
    private final String addressLine;
    private final String building;

    public Address() {
        this(new PostalCode(), "", "");
    }

    public Address(PostalCode postalCode, String addressLine, String building) {
        this.postalCode = postalCode;
        this.addressLine = addressLine;
        this.building = building;
    }

    public PostalCode postalCode() {
        return postalCode;
    }

    public String addressLine() {
        return addressLine;
    }

    public String building() {
        return building;
    }
}

