package ui.catalogue.domain.model.shipping.summary;

import java.util.Comparator;
import java.util.List;

/**
 * 出荷サマリー一覧
 */
public class ShippingSummaries {
    List<ShippingSummary> list;

    public ShippingSummaries(List<ShippingSummary> list) {
        this.list = list.stream().sorted(Comparator.comparing(ShippingSummary::salesOrderNumber)).toList();
    }

    public List<ShippingSummary> list() {
        return list;
    }
}
