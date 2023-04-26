package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shipping")
class ShippingController {

    @GetMapping("search1")
    String search1() {
       return "shipping/search1";
    }

    @GetMapping("search2")
    String search2() {
        return "shipping/search2";
    }

    @GetMapping
    String list() {
        return "shipping/list";
    }
}
