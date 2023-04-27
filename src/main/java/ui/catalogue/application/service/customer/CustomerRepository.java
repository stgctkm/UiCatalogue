package ui.catalogue.application.service.customer;

import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.summary.CustomerSummaries;

public interface CustomerRepository {
    Customer customerOf(CustomerId customerId);

    CustomerSummaries customerSummaries();

    CustomerId register(Customer customer);

    void update(CustomerId customerId, Customer customer);

    void delete(CustomerId customerId);
}
