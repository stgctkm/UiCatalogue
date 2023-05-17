package ui.catalogue.domain.model.sales.jewelry.content;

import ui.catalogue.domain.primitive.Date;

/**
 * 販売期間
 */
public class SalesPeriod {
    Date from;
    Date to;

    public SalesPeriod() {
        this(new Date(), new Date());
    }

    public SalesPeriod(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

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

    public boolean isValidOrder() {
        return from.isBefore(to);
    }
}
