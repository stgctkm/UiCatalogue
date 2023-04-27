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


    /**
     * 顧客サマリーのリストを取得する
     */
    public CustomerSummaries customerSummaries() {
        return customerRepository.customerSummaries();
    }

    /**
     * 顧客を登録する
     */
    public CustomerId register(Customer customer) {
        return customerRepository.register(customer);
    }

    /**
     * 顧客を更新する
     */
    public void update(CustomerId customerId, Customer customer) {
        customerRepository.update(customerId, customer);
    }
}
