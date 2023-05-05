package ui.catalogue.infrastructure.datasource.sales.order;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.sales.order.SalesOrder;
import ui.catalogue.domain.model.sales.order.criteria.SalesOrderCriteria;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.item.SalesOrderItem;
import ui.catalogue.domain.model.sales.order.summary.SalesOrderSummary;

import java.util.List;

@Mapper
interface SalesOrderMapper {

    List<SalesOrderSummary> summaries(
            @Param("criteria") SalesOrderCriteria criteria);

    SalesOrder salesOrderOf(
            @Param("salesOrderId") SalesOrderId salesOrderId);

    List<SalesOrderItem> salesOrderItemsOf(
            @Param("salesOrderId") SalesOrderId salesOrderId);
}
