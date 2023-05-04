package ui.catalogue.application.service.sales.order;

import ui.catalogue.domain.model.sales.order.SalesOrder;
import ui.catalogue.domain.model.sales.order.criteria.SalesOrderCriteria;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.summary.SalesOrderSummaries;

public interface SalesOrderRepository {

    SalesOrderSummaries summaries(SalesOrderCriteria criteria);

    SalesOrder salesOrderOf(SalesOrderId salesOrderId);
}
