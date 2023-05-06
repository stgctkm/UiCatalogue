package ui.catalogue.domain.model.invoice.identifier;

/**
 * 請求ID
 */
public class InvoiceId {
    String value;

    @Deprecated
    InvoiceId() {
        this("");
    }

    public InvoiceId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
