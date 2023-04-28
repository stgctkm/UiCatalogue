package ui.catalogue.infrastructure.datasource.sales.product;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.sales.product.SalesProductRepository;
import ui.catalogue.domain.model.sales.product.SalesProduct;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductId;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummaries;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummary;

import java.util.List;

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
}
