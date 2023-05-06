package ui.catalogue.domain.model.invoice.content;

import java.time.YearMonth;

/**
 * 受注年月
 */
public class OrderedYearMonth {
    YearMonth value;

    @Deprecated
    OrderedYearMonth() {
    }

    public OrderedYearMonth(String value) {
//        this.value = LocalDate.parse(value + "-01");
        this.value = YearMonth.parse(value);
    }

    YearMonth yearMonth() {
        return YearMonth.from(value);
    }

    @Override
    public String toString() {
//        return yearMonth().toString();
        return value.toString();
    }
}
