package ui.catalogue.domain.model.purchase.content;

import ui.catalogue.domain.primitive.contact.phone.PhoneNumber;

/**
 * 仕入先
 */
public class Supplier {
    String name;
    String personInCharge;
    PhoneNumber phoneNumber;

    public String name() {
        return name;
    }

    public String personInCharge() {
        return personInCharge;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }
}
