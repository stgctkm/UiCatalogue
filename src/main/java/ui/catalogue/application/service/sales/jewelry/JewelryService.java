package ui.catalogue.application.service.sales.jewelry;


import org.springframework.stereotype.Service;
import ui.catalogue.domain.model.sales.jewelry.Jewelry;
import ui.catalogue.domain.model.sales.jewelry.criteria.JewelryCriteria;
import ui.catalogue.domain.model.sales.jewelry.identifier.JewelryId;
import ui.catalogue.domain.model.sales.jewelry.summary.JewelrySummaries;

/**
 * ジュエリーサービス
 */
@Service
public class JewelryService {

    JewelryRepository jewelryRepository;

    JewelryService(JewelryRepository jewelryRepository) {
        this.jewelryRepository = jewelryRepository;
    }

    public JewelrySummaries summaries(JewelryCriteria criteria) {
        return jewelryRepository.summaries(criteria);
    }

    public Jewelry jewelryOf(JewelryId jewelryId) {
        return jewelryRepository.jewelryOf(jewelryId);
    }

    public void update(Jewelry jewelry, JewelryId jewelryId) {
        jewelryRepository.update(jewelry, jewelryId);
    }
}
