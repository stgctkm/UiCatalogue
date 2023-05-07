package ui.catalogue.domain.model.shipping.criteria;

import ui.catalogue.domain.primitive.Date;

/**
 * 出荷指示検索条件
 */
public class InstructionCriteria {
    Date from;
    Date to;
    String shippingRegion;

    public String instructedDate() {
        return "%s 〜 %s".formatted(from, to);
    }

    public Date from() {
        return from;
    }

    public Date to() {
        return to;
    }

    public String shippingRegion() {
        return shippingRegion;
    }
}
