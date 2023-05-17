package ui.catalogue.domain.model.sales.product;

import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import ui.catalogue.domain.model.sales.product.content.Price;
import ui.catalogue.domain.model.sales.product.content.SalesPeriod;
import ui.catalogue.domain.model.sales.product.content.SalesProductName;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductCode;

/**
 * 販売商品
 */
public class SalesProduct {
    @Valid
    SalesProductCode salesProductCode;
    @Valid
    SalesProductName salesProductName;
    SalesPeriod salesPeriod;
    @Valid
    Price price;
    @NotBlank(message = "色を入力してください")
    String color;
    @NotBlank(message = "サイズを入力してください")
    String size;
    @NotBlank(message = "説明を入力してください")
    String description;
    @NotBlank(message = "備考を入力してください")
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


    boolean validSalesPeriod;
    @AssertTrue(message = "販売期間を正しく入力してください")
    boolean isValidSalesPeriod() {
        return salesPeriod.isValid();
    }
}
