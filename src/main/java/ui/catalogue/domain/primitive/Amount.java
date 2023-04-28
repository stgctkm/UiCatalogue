package ui.catalogue.domain.primitive;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 金額
 */
public class Amount {
   BigDecimal value;

   public Amount() {
      this(BigDecimal.ZERO);
   }

   public Amount(String value) {
      this(new BigDecimal(value.replaceAll(",", "")));
   }

   public Amount(BigDecimal value) {
      this.value = value;
   }

   @Override
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,###");
      return decimalFormat.format(value);
   }
}
