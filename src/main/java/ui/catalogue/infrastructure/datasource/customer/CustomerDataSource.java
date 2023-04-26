package ui.catalogue.infrastructure.datasource.customer;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.customer.CustomerRepository;
import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.summary.CustomerSummaries;

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


}
