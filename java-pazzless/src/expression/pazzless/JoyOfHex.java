package expression.pazzless;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class JoyOfHex {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    System.out.println(Long.toHexString(0xcafebabe));
    System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
    System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    
 //     1111111
 //   0xffffffffcafebabeL
 // + 0x0000000100000000L
 // ---------------------  
 //   0x00000000cafebabeL



  }

}
