package ui.catalogue.domain.model.customer.contact;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import ui.catalogue.domain.primitive.contact.address.Address;
import ui.catalogue.domain.primitive.contact.phone.PhoneNumber;

/**
 * 連絡先
 */
public class Contact {
    @Valid
    Email email;
    @Valid
    Address address;
    @Valid
    PhoneNumber phoneNumber;
    @NotBlank(message = "担当者名を入力してください")
    String personInCharge;
    @NotBlank(message = "担当者部署を入力してください")
    String division;

    public Contact() {
        this(new Email(),
                new Address(),
                new PhoneNumber(),
                "",
                ""
        );
    }

    public Contact(Email email, Address address, PhoneNumber phoneNumber, String personInCharge, String division) {
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.personInCharge = personInCharge;
        this.division = division;
    }

    public Email email() {
        return email;
    }

    public Address address() {
        return address;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    public String personInCharge() {
        return personInCharge;
    }

    public String division() {
        return division;
    }


}
