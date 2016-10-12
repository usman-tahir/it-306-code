
public class CodingBatRecursion {
  public static void main(String[] args) {

  }

  /*
   * Given n with a value of one or more, return the factorial of n,
   * which is n * (n - 1) * (n - 2) ... 1
   */
   public static int factorial(int n) {
     if (n == 0) {
       return 1;
     } else if (n < 0) {
       return 0;
     } else {
       return n * factorial(n - 1);
     }
   }

}