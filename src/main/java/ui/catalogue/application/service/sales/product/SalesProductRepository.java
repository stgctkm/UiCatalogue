package ui.catalogue.application.service.sales.product;

import ui.catalogue.domain.model.sales.product.SalesProduct;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductId;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummaries;

public interface SalesProductRepository {

    SalesProductSummaries summariesOf(SalesProductSearchCriteria criteria);

    SalesProduct salesProductOf(SalesProductId salesProductId);

    void register(SalesProduct salesProduct);

    void update(SalesProductId salesProductId, SalesProduct salesProduct);
}
