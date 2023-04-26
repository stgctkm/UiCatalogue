package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ui.catalogue.application.service.customer.CustomerService;
import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.summary.CustomerSummaries;

/**
 * 一覧 -> 編集
 */
@Controller
@RequestMapping("customers")
class CustomerController {

    CustomerService customerService;

    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    String list(Model model) {
        CustomerSummaries customerSummaries = customerService.customerSummaries();
        model.addAttribute("customerSummaries", customerSummaries);
        return "customer/list";
    }

    @GetMapping("new")
    String newCustomer() {
        return "customer/new";
    }

    @GetMapping("{customerId}")
    String edit(@PathVariable CustomerId customerId,
                Model model) {
        Customer customer = customerService.customerOf(customerId);
        model.addAttribute("customer", customer);
        return "customer/editor";
    }
}
