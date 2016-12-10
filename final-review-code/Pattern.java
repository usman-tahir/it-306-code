
public class Pattern {
  public static void main(String[] args) {
    // Example output with n = 840
    // pattern(840);

    // Example output with n = 16
    pattern(16);
  }
  /**
    * Precondition: n > 0
    * Postcondition: The output consists of lines of integers. The first line
    * is the number n; The next line is the number 2n. The next line is the
    * number 4n, and so on until you reach a number that is larger than 4242.
    * This list of numbers is then repeated backwards until you get back to n.
  */
  public static void pattern(int n) {
    System.out.println(n);
    if (n < 4242) {
      pattern(2 * n);
    }
    System.out.println(n);
  }
}