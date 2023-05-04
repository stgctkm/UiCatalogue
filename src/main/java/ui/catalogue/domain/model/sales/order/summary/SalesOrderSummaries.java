package ui.catalogue.domain.model.sales.order.summary;

import java.util.List;

/**
 * 受注サマリー一覧
 */
public class SalesOrderSummaries {
    List<SalesOrderSummary> list;

    public SalesOrderSummaries(List<SalesOrderSummary> list) {
        this.list = list;
    }

    public List<SalesOrderSummary> list() {
        return list;
    }
}
