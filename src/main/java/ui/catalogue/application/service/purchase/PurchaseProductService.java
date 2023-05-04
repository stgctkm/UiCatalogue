package ui.catalogue.application.service.purchase;

import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.purchase.product.PurchaseProduct;
import ui.catalogue.domain.model.purchase.product.identifier.PurchaseProductCode;

/**
 * 仕入商品サービス
 */
@Service
public class PurchaseProductService {

    PurchaseProductRepository purchaseProductRepository;

    PurchaseProductService(PurchaseProductRepository purchaseProductRepository) {
        this.purchaseProductRepository = purchaseProductRepository;
    }

    /**
     * 仕入商品を取得する
     */
    public PurchaseProduct purchaseProductOf(PurchaseProductCode purchaseProductCode) {
        return purchaseProductRepository.purchaseProductOf(purchaseProductCode);
    }
}
