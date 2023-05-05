package ui.catalogue.domain.primitive;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

   public boolean isGreaterThan(Amount other) {
      return value.compareTo(other.value) > 0;
   }

   @Override
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,###");
      return decimalFormat.format(value);
   }

   public Amount add(Amount other) {
      return new Amount(value.add(other.value));
   }

   /**
    * 率を乗算した金額を計算する
    * 金額 x 税率
    * 1円未満は切り捨て
    */
   public Amount multiply(Rate rate) {
      return new Amount(value.multiply(rate.value).setScale(0, RoundingMode.DOWN));
   }
}
