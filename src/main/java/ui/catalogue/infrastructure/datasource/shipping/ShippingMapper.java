package ui.catalogue.infrastructure.datasource.shipping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.shipping.criteria.ShippingCriteria;
import ui.catalogue.domain.model.shipping.summary.ShippingSummary;

import java.util.List;

@Mapper
interface ShippingMapper {

    List<ShippingSummary> summariesOfAllInstructed(
            @Param("criteria") ShippingCriteria criteria);

    List<ShippingSummary> summariesOfNotAllInstructed(
            @Param("criteria") ShippingCriteria criteria);
}
