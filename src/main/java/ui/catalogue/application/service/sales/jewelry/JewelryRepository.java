package ui.catalogue.application.service.sales.jewelry;

import ui.catalogue.domain.model.sales.jewelry.Jewelry;
import ui.catalogue.domain.model.sales.jewelry.criteria.JewelryCriteria;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryId;
import ui.catalogue.domain.model.sales.jewelry.summary.JewelrySummaries;

public interface JewelryRepository {
    JewelrySummaries summaries(JewelryCriteria criteria);

    Jewelry jewelryOf(JewelryId jewelryId);

    void update(Jewelry jewelry, JewelryId jewelryId);
}
