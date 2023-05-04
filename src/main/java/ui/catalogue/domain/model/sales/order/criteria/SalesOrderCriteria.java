package ui.catalogue.domain.model.sales.order.criteria;

import ui.catalogue.domain.primitive.Date;

/**
 * 受注検索条件
 */
public class SalesOrderCriteria {
    Date from;
    Date to;
    String customerName;

    SalesOrderCriteria() {
        this(new Date(), new Date(), "");
    }

    SalesOrderCriteria(Date from, Date to, String customerName) {
        this.from = from;
        this.to = to;
        this.customerName = customerName;
    }

    public Date from() {
        return from;
    }

    public Date to() {
        return to;
    }

    public String customerName() {
        return customerName;
    }
}
