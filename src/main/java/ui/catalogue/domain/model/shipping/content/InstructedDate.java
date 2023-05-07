package ui.catalogue.domain.model.shipping.content;

import ui.catalogue.domain.primitive.Date;

/**
 * 出荷指示日
 */
public class InstructedDate {
    Date date;

    @Override
    public String toString() {
        return date.toString();
    }
}
