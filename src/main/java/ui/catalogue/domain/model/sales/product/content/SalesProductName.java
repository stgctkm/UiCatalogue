package ui.catalogue.domain.model.sales.product.content;

import jakarta.validation.constraints.NotBlank;

/**
 * 商品名
 */
public class SalesProductName {
    @NotBlank(message = "商品名称を入力して下さい")
    String name;
    @NotBlank(message = "商品略称を入力して下さい")
    String abbreviation;

    public String name() {
        return name;
    }

    public String abbreviation() {
        return abbreviation;
    }
}

