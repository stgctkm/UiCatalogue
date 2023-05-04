package ui.catalogue.application.service.sales.order;

import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.sales.order.SalesOrder;
import ui.catalogue.domain.model.sales.order.criteria.SalesOrderCriteria;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.summary.SalesOrderSummaries;

@Service
public class SalesOrderService {
    SalesOrderRepository salesOrderRepository;

    SalesOrderService(SalesOrderRepository salesOrderRepository) {
        this.salesOrderRepository = salesOrderRepository;
    }

    /**
     * 受注を検索する
     */
    public SalesOrderSummaries summaries(SalesOrderCriteria criteria) {
        return salesOrderRepository.summaries(criteria);
    }

    /**
     * 受注を取得する
     */
    public SalesOrder salesOrderOf(SalesOrderId salesOrderId) {
        return salesOrderRepository.salesOrderOf(salesOrderId);
    }


}
