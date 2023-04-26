package ui.catalogue.domain.model.customer.contact;

import ui.catalogue.domain.model.customer.contact.address.PostalCode;
import ui.catalogue.domain.model.customer.contact.phone.PhoneNumber;

/**
 * 連絡先
 */
public record Contact(
        Email email,
        PostalCode postalCode,
        String addressLine,
        String building,
        PhoneNumber phoneNumber,
        String personInCharge,
        String division
) {
}
