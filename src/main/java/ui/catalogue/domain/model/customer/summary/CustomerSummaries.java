package ui.catalogue.domain.model.customer.summary;

import java.util.List;

/**
 * 顧客サマリー一覧
 */
public record CustomerSummaries(
        List<CustomerSummary> list
) {
}
