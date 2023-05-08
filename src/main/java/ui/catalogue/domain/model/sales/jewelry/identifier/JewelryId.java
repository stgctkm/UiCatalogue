package ui.catalogue.domain.model.sales.jewelry.identifier;

public class JewelryId {
    String value;

    JewelryId() {
        this("");
    }

    public JewelryId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
