package ui.catalogue.domain.model.sales.product;

import ui.catalogue.domain.model.sales.product.content.Price;
import ui.catalogue.domain.model.sales.product.content.SalesPeriod;
import ui.catalogue.domain.model.sales.product.content.SalesProductName;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductCode;

/**
 * 販売商品
 */
public class SalesProduct {
    SalesProductCode salesProductCode;
    SalesProductName salesProductName;
    SalesPeriod salesPeriod;
    Price price;
    String color;
    String size;
    String description;
    String remark;

    public SalesProductCode salesProductCode() {
        return salesProductCode;
    }

    public SalesProductName salesProductName() {
        return salesProductName;
    }

    public SalesPeriod salesPeriod() {
        return salesPeriod;
    }

    public Price price() {
        return price;
    }

    public String color() {
        return color;
    }

    public String size() {
        return size;
    }

    public String description() {
        return description;
    }

    public String remark() {
        return remark;
    }
}
