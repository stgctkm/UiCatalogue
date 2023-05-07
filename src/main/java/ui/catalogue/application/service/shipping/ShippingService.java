package ui.catalogue.application.service.shipping;

import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.shipping.criteria.ShippingCriteria;
import ui.catalogue.domain.model.shipping.summary.ShippingSummaries;

/**
 * 出荷サービス
 */
@Service
public class ShippingService {

    ShippingRepository shippingRepository;

    ShippingService(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;
    }

    /**
     * 出荷一覧の検索
     */
    public ShippingSummaries summaries(ShippingCriteria criteria) {
        return shippingRepository.summaries(criteria);
    }


}
