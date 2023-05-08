package ui.catalogue.infrastructure.datasource.sales.jewelry;

import org.springframework.stereotype.Repository;
import ui.catalogue.application.service.sales.jewelry.JewelryRepository;
import ui.catalogue.domain.model.sales.jewelry.Jewelry;
import ui.catalogue.domain.model.sales.jewelry.criteria.JewelryCriteria;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryId;
import ui.catalogue.domain.model.sales.jewelry.summary.JewelrySummaries;
import ui.catalogue.domain.model.sales.jewelry.summary.JewelrySummary;

import java.util.List;
import java.util.UUID;

@Repository
public class JewelryDataSource implements JewelryRepository {

    JewelryMapper jewelryMapper;

    JewelryDataSource(JewelryMapper jewelryMapper) {
        this.jewelryMapper = jewelryMapper;
    }

    @Override
    public JewelrySummaries summaries(JewelryCriteria criteria) {
        List<JewelrySummary> list = jewelryMapper.summaries(criteria);
        return new JewelrySummaries(list);
    }

    @Override
    public Jewelry jewelryOf(JewelryId jewelryId) {
        return jewelryMapper.jewelryOf(jewelryId);
    }

    @Override
    public void update(Jewelry jewelry, JewelryId jewelryId) {
        UUID revision = UUID.randomUUID();
        jewelryMapper.registerRevision(jewelryId, revision);
        jewelryMapper.registerJewelryContent(jewelryId, revision, jewelry);
        jewelryMapper.deleteActive(jewelryId);
        jewelryMapper.registerActive(jewelryId, revision);
    }
}
