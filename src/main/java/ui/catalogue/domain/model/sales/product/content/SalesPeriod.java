package ui.catalogue.domain.model.sales.product.content;

import ui.catalogue.domain.primitive.Date;

/**
 * 販売期間
 */
public class SalesPeriod {
    Date from;
    Date to;

    public Date from() {
        return from;
    }

    public Date to() {
        return to;
    }

    @Override
    public String toString() {
        return "%s 〜 %s".formatted(from, to);
    }

    public boolean isValid() {
        return from.isBefore(to);
    }
}
