package ui.catalogue.domain.model.sales.product.criteria;

import ui.catalogue.domain.model.sales.product.content.SalesPeriod;

/**
 * 販売商品検索条件
 */
public class SalesProductSearchCriteria {
    SalesPeriod salesPeriod;
    String name;

    public SalesPeriod salesPeriod() {
        return salesPeriod;
    }

    public String name() {
        return name;
    }
}
