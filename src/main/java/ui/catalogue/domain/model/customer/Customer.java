package ui.catalogue.domain.model.customer;

import ui.catalogue.domain.model.customer.contact.Contact;
import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.customer.identifier.CustomerNumber;

/**
 * 顧客
 */
public final class Customer {
    private final CustomerNumber customerNumber;
    private final CustomerName customerName;
    private final Contact contact;

    public Customer() {
        this(new CustomerNumber(), new CustomerName(), new Contact());
    }

    public Customer(CustomerNumber customerNumber, CustomerName customerName, Contact contact) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contact = contact;
    }

    public CustomerNumber customerNumber() {
        return customerNumber;
    }

    public CustomerName customerName() {
        return customerName;
    }

    public Contact contact() {
        return contact;
    }

}
