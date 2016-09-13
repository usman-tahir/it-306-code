
public class Recursion {
  public static void main(String[] args) {

    int factorialOfFive = factorial(5);
    System.out.printf("5 factorial is %d\n", factorialOfFive);
  }

  // Factorial with Recursion
  public static int factorial(int number) {
    if (number == 0) {
      return 1;
    } else {
      return number * factorial(number - 1);
    }
  }

}