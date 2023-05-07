package ui.catalogue.application.service.shipping;

import ui.catalogue.domain.model.shipping.criteria.ShippingCriteria;
import ui.catalogue.domain.model.shipping.summary.ShippingSummaries;

public interface ShippingRepository {
    ShippingSummaries summaries(ShippingCriteria criteria);
}
