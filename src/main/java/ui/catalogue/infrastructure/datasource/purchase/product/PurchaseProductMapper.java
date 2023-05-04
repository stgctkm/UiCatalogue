package ui.catalogue.infrastructure.datasource.purchase.product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.purchase.product.PurchaseProduct;
import ui.catalogue.domain.model.purchase.product.identifier.PurchaseProductCode;

@Mapper
public interface PurchaseProductMapper {

    PurchaseProduct purchaseProductOf(
            @Param("purchaseProductCode") PurchaseProductCode purchaseProductCode);
}
