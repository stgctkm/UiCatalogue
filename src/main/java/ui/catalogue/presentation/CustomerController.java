package ui.catalogue.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 一覧 -> 編集
 */
@Controller
@RequestMapping("customers")
public class CustomerController {


    @GetMapping
    String list() {
        return "customer/list";
    }

    @GetMapping("new")
    String newCustomer() {
        return "customer/new";
    }

    @GetMapping("{customerNumber}")
    String edit(@PathVariable String customerNumber) {
        return "customer/editor";
    }
}
