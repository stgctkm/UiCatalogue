package ui.catalogue.infrastructure.datasource.sales.product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.sales.product.criteria.SalesProductSearchCriteria;
import ui.catalogue.domain.model.sales.product.summary.SalesProductSummary;

import java.util.List;

@Mapper
interface SalesProductMapper {
    List<SalesProductSummary> summariesOf(
            @Param("criteria") SalesProductSearchCriteria criteria);


}
