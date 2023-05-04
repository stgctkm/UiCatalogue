package ui.catalogue.domain.model.sales.order.item;

import java.util.List;

/**
 * 受注明細のリスト
 */
public class SalesOrderItems {
    List<SalesOrderItem> list;

    public SalesOrderItems(List<SalesOrderItem> list) {
        this.list = list;
    }

    public List<SalesOrderItem> list() {
        return list;
    }
}
