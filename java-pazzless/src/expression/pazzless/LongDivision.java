package expression.pazzless;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class LongDivision {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
    final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
    System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

    
    final long MICROS_PER_DAY_2 = 24l * 60 * 60 * 1000 * 1000;
    final long MILLIS_PER_DAY_2 = 24l * 60 * 60 * 1000;
    System.out.println(MICROS_PER_DAY_2 / MILLIS_PER_DAY_2);

  }

}
