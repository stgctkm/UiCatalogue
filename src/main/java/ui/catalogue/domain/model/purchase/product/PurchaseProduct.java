package ui.catalogue.domain.model.purchase.product;

import ui.catalogue.domain.model.purchase.content.PurchasePrice;
import ui.catalogue.domain.model.purchase.content.PurchaseProductName;
import ui.catalogue.domain.model.purchase.content.Supplier;
import ui.catalogue.domain.model.purchase.product.identifier.PurchaseProductCode;

/**
 * 仕入商品
 */
public class PurchaseProduct {

    PurchaseProductCode purchaseProductCode;
    PurchaseProductName purchaseProductName;
    PurchasePrice purchasePrice;
    Supplier supplier;

    public PurchaseProductCode purchaseProductCode() {
        return purchaseProductCode;
    }

    public PurchaseProductName purchaseProductName() {
        return purchaseProductName;
    }

    public PurchasePrice purchasePrice() {
        return purchasePrice;
    }

    public Supplier supplier() {
        return supplier;
    }
}
