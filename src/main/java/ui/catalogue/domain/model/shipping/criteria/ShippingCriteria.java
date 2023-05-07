package ui.catalogue.domain.model.shipping.criteria;

import ui.catalogue.domain.primitive.Date;

/**
 * 出荷検索条件
 */
public class ShippingCriteria {
    Date instructedFrom;
    Date instructedTo;
    String shippingRegion;

    Date shippedFrom;
    Date shippedTo;
    String wareHouse;
}
