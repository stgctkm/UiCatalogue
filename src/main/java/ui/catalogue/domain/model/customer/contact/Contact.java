package ui.catalogue.domain.model.customer.contact;

import ui.catalogue.domain.model.customer.contact.address.Address;
import ui.catalogue.domain.model.customer.contact.phone.PhoneNumber;

/**
 * 連絡先
 */
public class Contact {
    Email email;
    Address address;
    PhoneNumber phoneNumber;
    String personInCharge;
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
