package ui.catalogue.infrastructure.datasource.customer;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.customer.CustomerRepository;
import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.identifier.CustomerNumber;
import ui.catalogue.domain.model.customer.summary.CustomerSummaries;

import java.util.UUID;

@Repository
public class CustomerDataSource implements CustomerRepository {

    CustomerMapper customerMapper;

    CustomerDataSource(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }


    @Override
    public Customer customerOf(CustomerId customerId) {
        return customerMapper.customerOf(customerId);
    }

    @Override
    public CustomerSummaries customerSummaries() {
        return new CustomerSummaries(customerMapper.customerSummaries());
    }

    @Override
    public CustomerId register(Customer customer) {
        CustomerId customerId = CustomerId.newSCustomerId();
        CustomerNumber customerNumber = new CustomerNumber(String.valueOf(customerMapper.newCustomerNumber()));
        UUID revision = UUID.randomUUID();
        customerMapper.register(customerId, customerNumber);
        customerMapper.registerRevision(customerId, revision);
        customerMapper.registerCustomerName(customerId, revision, customer.customerName());
        customerMapper.registerContact(customerId, revision, customer.contact());
        customerMapper.registerActive(customerId, revision);
        return customerId;
    }

    @Override
    public void update(CustomerId customerId, Customer customer) {
        UUID revision = UUID.randomUUID();
        customerMapper.registerRevision(customerId, revision);
        customerMapper.registerCustomerName(customerId, revision, customer.customerName());
        customerMapper.registerContact(customerId, revision, customer.contact());
        customerMapper.deleteActive(customerId);
        customerMapper.registerActive(customerId, revision);
    }

    @Override
    public void delete(CustomerId customerId) {
        customerMapper.deleteActive(customerId);
    }
}
