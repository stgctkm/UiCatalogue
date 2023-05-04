package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ui.catalogue.application.service.purchase.PurchaseProductService;
import ui.catalogue.domain.model.purchase.product.PurchaseProduct;
import ui.catalogue.domain.model.purchase.product.identifier.PurchaseProductCode;

/**
 * 検索 & 詳細
 */
@Controller
@RequestMapping("products")
class ProductController {

    PurchaseProductService purchaseProductService;

    ProductController(PurchaseProductService purchaseProductService) {
        this.purchaseProductService = purchaseProductService;
    }

    @GetMapping
    String start() {
        return "product/search-and-detail";
    }

    @GetMapping(params = "purchaseProductCode")
    String search(@RequestParam PurchaseProductCode purchaseProductCode,
                  Model model) {
        PurchaseProduct purchaseProduct = purchaseProductService.purchaseProductOf(purchaseProductCode);
        model.addAttribute("purchaseProduct", purchaseProduct);
        return "product/search-and-detail";
    }

}
