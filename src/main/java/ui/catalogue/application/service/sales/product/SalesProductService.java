package ui.catalogue.application.service.sales.product;

import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummaries;

/**
 * 販売商品サービス
 */
@Service
public class SalesProductService {
    SalesProductRepository salesProductRepository;

    SalesProductService(SalesProductRepository salesProductRepository) {
        this.salesProductRepository = salesProductRepository;
    }

    /**
     * 販売商品サマリーのリストを検索する
     */
    public SalesProductSummaries summariesOf(SalesProductSearchCriteria criteria) {
        return salesProductRepository.summariesOf(criteria);
    }
}
