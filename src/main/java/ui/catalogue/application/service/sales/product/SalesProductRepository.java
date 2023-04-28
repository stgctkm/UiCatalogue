package ui.catalogue.application.service.sales.product;

import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummaries;

public interface SalesProductRepository {

    SalesProductSummaries summariesOf(SalesProductSearchCriteria criteria);
}
