package ui.catalogue.domain.model.sales.jewelry;

import ui.catalogue.domain.model.sales.jewelry.content.Price;
import ui.catalogue.domain.model.sales.jewelry.content.SalesPeriod;
import ui.catalogue.domain.model.sales.jewelry.content.SalesProductName;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryCode;

public class Jewelry {
    JewelryCode jewelryCode;
    SalesProductName salesProductName;
    SalesPeriod salesPeriod;
    Price price;
    String color;
    String size;
    String description;
    String remark;

    public JewelryCode jewelryCode() {
        return jewelryCode;
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
