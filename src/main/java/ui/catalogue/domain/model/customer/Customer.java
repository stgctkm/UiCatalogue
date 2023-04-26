package ui.catalogue.domain.model.customer;

import ui.catalogue.domain.model.customer.contact.Contact;
import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.customer.identifier.CustomerNumber;

/**
 * 顧客
 */
public record Customer(
    CustomerNumber customerNumber,
    CustomerName customerName,
    Contact contact
) {
}
