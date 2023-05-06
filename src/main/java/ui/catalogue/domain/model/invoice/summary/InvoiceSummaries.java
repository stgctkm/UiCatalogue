package ui.catalogue.domain.model.invoice.summary;

import java.util.List;

/**
 * 請求サマリーリスト
 */
public class InvoiceSummaries {
    List<InvoiceSummary> list;

    public InvoiceSummaries(List<InvoiceSummary> list) {
        this.list = list;
    }

    public List<InvoiceSummary> list() {
        return list;
    }

}
