package ui.catalogue.infrastructure.datasource.sales.order;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.sales.order.SalesOrderRepository;
import ui.catalogue.domain.model.sales.order.SalesOrder;
import ui.catalogue.domain.model.sales.order.criteria.SalesOrderCriteria;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.summary.SalesOrderSummaries;
import ui.catalogue.domain.model.sales.order.summary.SalesOrderSummary;

import java.util.List;

@Repository
public class SalesOrderDataSource implements SalesOrderRepository {

    SalesOrderMapper salesOrderMapper;

    SalesOrderDataSource(SalesOrderMapper salesOrderMapper) {
        this.salesOrderMapper = salesOrderMapper;
    }

    @Override
    public SalesOrderSummaries summaries(SalesOrderCriteria criteria) {
        List<SalesOrderSummary> list = salesOrderMapper.summaries(criteria);
        return new SalesOrderSummaries(list);
    }

    @Override
    public SalesOrder salesOrderOf(SalesOrderId salesOrderId) {
        return salesOrderMapper.salesOrderOf(salesOrderId);
    }
}
