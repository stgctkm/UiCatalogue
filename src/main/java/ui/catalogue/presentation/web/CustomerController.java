package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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

    @ModelAttribute("customer")
    Customer customer() {
        return new Customer();
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

    @PostMapping
    String register(@ModelAttribute Customer customer,
                    RedirectAttributes redirectAttributes) {
        customerService.register(customer);
        redirectAttributes.addFlashAttribute("message", "顧客登録しました");
        return "redirect:/customers";
    }

    @PutMapping("{customerId}")
    String update(
            @PathVariable CustomerId customerId,
            @ModelAttribute Customer customer,
            RedirectAttributes redirectAttributes) {
        customerService.update(customerId, customer);
        redirectAttributes.addFlashAttribute("message", "顧客更新しました");
        return "redirect:/customers";
    }

    @DeleteMapping("{customerId}")
    String delete(
            @PathVariable CustomerId customerId,
            RedirectAttributes redirectAttributes) {
        customerService.delete(customerId);
        redirectAttributes.addFlashAttribute("message", "顧客削除しました");
        return "redirect:/customers";
    }

    @InitBinder("customer")
    void bindCustomer(WebDataBinder binder) {
        binder.setAllowedFields(
                "customerName.name",
                "customerName.nameKana",
                "contact.email",
                "contact.address.postalCode",
                "contact.address.addressLine",
                "contact.address.building",
                "contact.phoneNumber",
                "contact.personInCharge",
                "contact.division"
        );
    }

}
