package expression.pazzless;

import java.math.BigDecimal;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class TimeChanges {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    System.out.println(2.00 - 1.10);
    System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.1")));

  }

}
