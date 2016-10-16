
public class RecursionExamples {
  public static void main(String[] args) {
    // System.out.println(factorial(4));
    System.out.println(tailFactorial(4));
  }

  // Simple recursion example that counts down from a number
  public static void counter(int begin) {
    if (begin == 0 || begin < 0) {
      return;
    } else {
      System.out.println("" + begin);
      counter(--begin);
      return;
    }
  }

  // Factorial of a number
  public static int factorial(int number) {
    if (number <= 0) {
      return -1;
    } else if (number == 1) {
      return 1;
    } else {
      return number * factorial(number - 1);
    }
  }

  // Tail recursion example
  public static int tailFactorial(int number) {
    if (number == 0) {
      return 1;
    } else {
      return factorial_i(number, 1);
    }
  }

  public static int factorial_i(int currentNumber, int sum) {
    if (currentNumber == 1) {
      return sum;
    } else {
      return factorial_i(currentNumber - 1, sum * currentNumber);
    }
  }

}