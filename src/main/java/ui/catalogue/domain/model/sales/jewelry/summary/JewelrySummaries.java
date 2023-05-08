package ui.catalogue.domain.model.sales.jewelry.summary;

import java.util.List;

public class JewelrySummaries {
    List<JewelrySummary> list;

    public JewelrySummaries(List<JewelrySummary> list) {
        this.list = list;
    }

    public List<JewelrySummary> list() {
        return list;
    }
}
