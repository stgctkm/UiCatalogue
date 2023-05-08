package ui.catalogue.domain.model.sales.jewelry.summary;

import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryCode;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryId;
import ui.catalogue.domain.model.sales.product.content.SalesPeriod;
import ui.catalogue.domain.model.sales.product.content.SalesProductName;

/**
 * ジュエリーサマリー
 */
public class JewelrySummary {

    JewelryId jewelryId;
    JewelryCode jewelryCode;
    SalesProductName salesProductName;
    SalesPeriod salesPeriod;

    public JewelryId jewelryId() {
        return jewelryId;
    }

    public JewelryCode jewelryCode() {
        return jewelryCode;
    }

    public SalesProductName salesProductName() {
        return salesProductName;
    }

    public SalesPeriod salesPeriod() {
        return salesPeriod;
    }
}
