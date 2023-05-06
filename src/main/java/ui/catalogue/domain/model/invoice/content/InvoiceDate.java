package ui.catalogue.domain.model.invoice.content;

import ui.catalogue.domain.primitive.Date;

/**
 * 請求日
 */
public class InvoiceDate {
    Date value;

    @Override
    public String toString() {
        return value.toString();
    }
}
