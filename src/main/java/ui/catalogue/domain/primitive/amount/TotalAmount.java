package ui.catalogue.domain.primitive.amount;

import java.util.Set;

/**
 * 合計金額
 */
public class TotalAmount {
    Set<Amount> set;

    public TotalAmount(Set<Amount> set) {
        this.set = set;
    }

    /**
     * 合計金額
     */
    public Amount total() {
        return set.stream().reduce(Amount::add).orElse(new Amount());
    }

}
