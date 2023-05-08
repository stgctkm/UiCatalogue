package ui.catalogue.domain.model.sales.jewelry.criteria;

import ui.catalogue.domain.model.sales.jewelry.content.SalesPeriod;

/**
 * ジュエリー検索条件
 */
public class JewelryCriteria {
    SalesPeriod salesPeriod;
    String name;

    public JewelryCriteria() {
        this(new SalesPeriod(), "");
    }

    public JewelryCriteria(SalesPeriod salesPeriod, String name) {
        this.salesPeriod = salesPeriod;
        this.name = name;
    }

    public SalesPeriod salesPeriod() {
        return salesPeriod;
    }

    public String name() {
        return name;
    }
}
