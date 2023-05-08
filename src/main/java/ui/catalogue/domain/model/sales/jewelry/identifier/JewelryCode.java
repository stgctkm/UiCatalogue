package ui.catalogue.domain.model.sales.jewelry.identifier;

public class JewelryCode {

    String value;

    JewelryCode() {
        this("");
    }

    public JewelryCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
