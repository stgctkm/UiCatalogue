package ui.catalogue.domain.primitive.contact.address;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * 住所
 */
public class Address {
    @Valid
    private final PostalCode postalCode;
    @NotBlank(message = "住所を入力してください")
    @Length(max = 40, message = "40字以内で入力してください")
    private final String addressLine;
    @Length(max = 40, message = "40字以内で入力してください")
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

    @Override
    public String toString() {
        return "%s %s %s".formatted(postalCode, addressLine, building);
    }
}

