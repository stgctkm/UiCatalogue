package ui.catalogue.infrastructure.datasource.sales.jewelry;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.sales.jewelry.Jewelry;
import ui.catalogue.domain.model.sales.jewelry.criteria.JewelryCriteria;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryId;
import ui.catalogue.domain.model.sales.jewelry.summary.JewelrySummary;

import java.util.List;
import java.util.UUID;

@Mapper
interface JewelryMapper {

    List<JewelrySummary> summaries(
            @Param("criteria") JewelryCriteria criteria);

    Jewelry jewelryOf(
            @Param("jewelryId") JewelryId jewelryId);

    void registerRevision(
            @Param("jewelryId") JewelryId jewelryId,
            @Param("revision") UUID revision);

    void registerJewelryContent(
            @Param("jewelryId") JewelryId jewelryId,
            @Param("revision") UUID revision,
            @Param("jewelry") Jewelry jewelry);

    void deleteActive(
            @Param("jewelryId") JewelryId jewelryId);

    void registerActive(
            @Param("jewelryId") JewelryId jewelryId,
            @Param("revision") UUID revision);
}
