
public class CodingBatRecursionMethods {
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

   /*
    * We have a number of bunnies and each bunny has two big floppy ears.
    * We want to compute the total number of ears across all the bunnies
    * recursively (without loops or multiplication).
    */
    public static int bunnyEars(int bunnies) {
      if (bunnies == 0) {
        return 0;
      } else if (bunnies == 1) {
        return 2;
      } else {
        return 2 + bunnyEars(bunnies - 1);
      }
    }

    /*
     * The fibonacci sequence is a famous bit of mathematics, and it happens
     * to have a recursive definition. The first two values in the sequence
     * are 0 and 1 (essentially the two base cases). Each subsequent value
     * is the sym of the previous two values, so the whole sequence is: 0,
     * 1, 1, 2, 3, 5, 8, 13, 21, and so on. Define a recursive fibonacci(n)
     * method that returns the nth fibonacci number, with n = 0 representing
     * the start of the sequence.
     */
     public static int fibonacci(int n) {
       if (n == 0 || n == 1) {
         return n;
       } else {
         return fibonacci(n - 1) + fibonacci(n - 2);
       }
     } 


}