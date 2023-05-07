package ui.catalogue.infrastructure.datasource.shipping;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.shipping.ShippingRepository;
import ui.catalogue.domain.model.shipping.criteria.ShippingCriteria;
import ui.catalogue.domain.model.shipping.summary.ShippingSummaries;
import ui.catalogue.domain.model.shipping.summary.ShippingSummary;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShippingDataSource implements ShippingRepository {

    ShippingMapper shippingMapper;

    ShippingDataSource(ShippingMapper shippingMapper) {
        this.shippingMapper = shippingMapper;
    }

    @Override
    public ShippingSummaries summaries(ShippingCriteria criteria) {
        List<ShippingSummary> instructed = shippingMapper.summariesOfAllInstructed(criteria);
        List<ShippingSummary> notAllInstructed = shippingMapper.summariesOfNotAllInstructed(criteria);
        List<ShippingSummary> list = new ArrayList<>();
        list.addAll(instructed);
        list.addAll(notAllInstructed);
        return new ShippingSummaries(list);
    }
}
