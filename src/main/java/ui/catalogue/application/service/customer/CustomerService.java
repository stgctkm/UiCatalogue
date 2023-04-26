package ui.catalogue.application.service.customer;

import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.summary.CustomerSummaries;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * 顧客を取得する
     */
    public Customer customerOf(CustomerId customerId) {
        return customerRepository.customerOf(customerId);
    }


    public CustomerSummaries customerSummaries() {
        return customerRepository.customerSummaries();
    }

}
