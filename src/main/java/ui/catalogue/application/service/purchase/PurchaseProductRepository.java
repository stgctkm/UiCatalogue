package ui.catalogue.application.service.purchase;

import ui.catalogue.domain.model.purchase.product.PurchaseProduct;
import ui.catalogue.domain.model.purchase.product.identifier.PurchaseProductCode;

public interface PurchaseProductRepository {
    PurchaseProduct purchaseProductOf(PurchaseProductCode purchaseProductCode);
}
