package ui.catalogue.domain.model.sales.product.summary;

import java.util.List;

/**
 * 販売商品サマリーのリスト
 */
public class SalesProductSummaries {
    List<SalesProductSummary> list;

    public SalesProductSummaries(List<SalesProductSummary> list) {
        this.list = list;
    }

    public List<SalesProductSummary> list() {
        return list;
    }
}
