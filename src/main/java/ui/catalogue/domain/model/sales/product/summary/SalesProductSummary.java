package ui.catalogue.domain.model.sales.product.summary;

import ui.catalogue.domain.model.sales.product.content.SalesPeriod;
import ui.catalogue.domain.model.sales.product.content.SalesProductName;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductCode;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductId;

/**
 * 販売商品サマリー
 */
public class SalesProductSummary {
    SalesProductId salesProductId;
    SalesProductCode salesProductCode;
    SalesProductName salesProductName;
    SalesPeriod salesPeriod;

    public SalesProductId id() {
        return salesProductId;
    }

    public SalesProductCode salesProductCode() {
        return salesProductCode;
    }

    public SalesProductName salesProductName() {
        return salesProductName;
    }

    public SalesPeriod salesPeriod() {
        return salesPeriod;
    }
}
