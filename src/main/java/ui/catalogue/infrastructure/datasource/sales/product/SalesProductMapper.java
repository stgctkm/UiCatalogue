package ui.catalogue.infrastructure.datasource.sales.product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.sales.product.SalesProduct;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.identifier.SalesProductId;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummary;

import java.util.List;
import java.util.UUID;

@Mapper
interface SalesProductMapper {
    List<SalesProductSummary> summariesOf(
            @Param("criteria") SalesProductSearchCriteria criteria);

    SalesProduct salesProductOf(
            @Param("salesProductId") SalesProductId salesProductId);

    void registerRevision(
            @Param("salesProductId") SalesProductId salesProductId,
            @Param("revision") UUID revision);

    void registerSalesProductContent(
            @Param("salesProductId") SalesProductId salesProductId,
            @Param("revision") UUID revision,
            @Param("salesProduct") SalesProduct salesProduct);

    void deleteActive(
            @Param("salesProductId") SalesProductId salesProductId);

    void registerActive(
            @Param("salesProductId") SalesProductId salesProductId,
            @Param("revision") UUID revision);
}
