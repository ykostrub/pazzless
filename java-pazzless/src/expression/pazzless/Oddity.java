package expression.pazzless;

/**
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class Oddity {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    int n = -5;
    System.out.println(isOdd(n));

    System.out.println(isOdd2(n));

    System.out.println(isOdd3(n));
    System.out.println(Integer.toBinaryString(-5));

  }

  public static boolean isOdd(
      int i) {
    return i % 2 == 1;
  }

  public static boolean isOdd2(
      int i) {
    return i % 2 != 0;
  }

  public static boolean isOdd3(
      int i) {
    return (i & 1) != 0;
  }

  public static void binar(
      int a) {
    int b;
    String temp = "";
    while (a != 0) {
      b = a % 2;
      temp = b + temp;
      a = a / 2;
    }
    System.out.print(temp);
  }

}
