package ui.catalogue.domain.model.shipping.content;

/**
 * 出荷指示の状態
 */
public enum ShippingStatus {
    出荷指示済,
    出荷指示残あり,
    ;

    public boolean isInstructed() {
        return this == 出荷指示済;
    }
}
