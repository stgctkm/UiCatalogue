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
}
