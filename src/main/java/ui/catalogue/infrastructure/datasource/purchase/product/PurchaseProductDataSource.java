package ui.catalogue.infrastructure.datasource.purchase.product;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.purchase.PurchaseProductRepository;
import ui.catalogue.domain.model.purchase.product.PurchaseProduct;
import ui.catalogue.domain.model.purchase.product.identifier.PurchaseProductCode;

@Repository
public class PurchaseProductDataSource implements PurchaseProductRepository {

    PurchaseProductMapper purchaseProductMapper;

    PurchaseProductDataSource(PurchaseProductMapper purchaseProductMapper) {
        this.purchaseProductMapper = purchaseProductMapper;
    }

    @Override
    public PurchaseProduct purchaseProductOf(PurchaseProductCode purchaseProductCode) {
        return purchaseProductMapper.purchaseProductOf(purchaseProductCode);
    }
}
