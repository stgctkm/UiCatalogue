package ui.catalogue.domain.model.sales.order.content;

import ui.catalogue.domain.primitive.Date;

/**
 * 受注日
 */
public class SalesOrderDate {
    Date date;

    @Override
    public String toString() {
        return date.toString();
    }
}
