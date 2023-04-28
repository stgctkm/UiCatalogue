package ui.catalogue.infrastructure.datasource.sales.product;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.sales.product.SalesProductRepository;
import ui.catalogue.domain.model.sales.product.SalesProduct;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductId;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummaries;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummary;

import java.util.List;
import java.util.UUID;

@Repository
public class SalesProductDataSource implements SalesProductRepository {

    SalesProductMapper salesProductMapper;

    SalesProductDataSource(SalesProductMapper salesProductMapper) {
        this.salesProductMapper = salesProductMapper;
    }

    @Override
    public SalesProductSummaries summariesOf(SalesProductSearchCriteria criteria) {
        List<SalesProductSummary> summaries = salesProductMapper.summariesOf(criteria);
        return new SalesProductSummaries(summaries);
    }

    @Override
    public SalesProduct salesProductOf(SalesProductId salesProductId) {
        return salesProductMapper.salesProductOf(salesProductId);
    }

    @Override
    public void update(SalesProductId salesProductId, SalesProduct salesProduct) {
        UUID revision = UUID.randomUUID();
        salesProductMapper.registerRevision(salesProductId, revision);
        salesProductMapper.registerSalesProductContent(salesProductId, revision, salesProduct);
        salesProductMapper.deleteActive(salesProductId);
        salesProductMapper.registerActive(salesProductId, revision);
    }
}
