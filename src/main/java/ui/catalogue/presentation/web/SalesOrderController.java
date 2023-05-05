package ui.catalogue.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ui.catalogue.application.service.sales.order.SalesOrderService;
import ui.catalogue.domain.model.sales.order.SalesOrder;
import ui.catalogue.domain.model.sales.order.criteria.SalesOrderCriteria;
import ui.catalogue.domain.model.sales.order.identifier.SalesOrderId;
import ui.catalogue.domain.model.sales.order.summary.SalesOrderSummaries;

/**
 * 検索 & 一覧操作 → 詳細
 */
@Controller
@RequestMapping("sales-orders")
public class SalesOrderController {

    SalesOrderService salesOrderService;

    SalesOrderController(SalesOrderService salesOrderService) {
        this.salesOrderService = salesOrderService;
    }

    @GetMapping
    String start(@ModelAttribute("salesOrderCriteria") SalesOrderCriteria criteria) {
        return "sales-orders/search-and-list";
    }

    @GetMapping(params = "q=")
    String search(@ModelAttribute("salesOrderCriteria") SalesOrderCriteria criteria,
                  Model model) {
        SalesOrderSummaries summaries = salesOrderService.summaries(criteria);
        model.addAttribute("summaries", summaries);
        return "sales-orders/search-and-list";
    }

    @GetMapping("{salesOrderId}")
    String detail(@PathVariable SalesOrderId salesOrderId,
                  Model model) {
        SalesOrder salesOrder = salesOrderService.salesOrderOf(salesOrderId);
        model.addAttribute("salesOrder", salesOrder);
        return "sales-orders/detail";
    }

    @InitBinder("salesOrderCriteria")
    void bindSalesOrderCriteria(WebDataBinder binder) {
        binder.setAllowedFields(
                "from",
                "to",
                "customerName"
        );
    }
}
