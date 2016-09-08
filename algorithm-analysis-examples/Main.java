
public class Main {
  public static void main(String[] args) {

    // sum
    int sumOfFive = sum(5);
    System.out.println("sum(5) returns " + sumOfFive);

    // horner
    int[] numbers = {1, 2, 3};
    int polynomialWithHorner = horner(numbers, 2, 2);
    System.out.println("polynomialWithHorner({1, 2, 3}, 2, 4) returns " + polynomialWithHorner);

    // factorial
    int factorialOfFour = factorial(4);
    System.out.println("factorial(4) returns " + factorialOfFour);

    int[] findMaxInArray = {34, 54, 44, 93, 67, 45, 75, 90, 202, 101};
    int maximum = findMaximum(findMaxInArray);
    System.out.println("findMaximum(numbers) returns " + maximum);
  }

  // Sums the numbers from 1 to n and returns the result
  public static int sum(int n) {
    int result = 0;
    for (int i = 1; i <= n; ++i) {
      result += i;
    }
    return result;
  }

  // Computes the polynomial of an array of numbers 
  public static int horner(int[] a, int n, int x) {
    int result = a[n];
    for (int i = n - 1; i >= 0; --i) {
      result = result * x + a[i];
    }
    return result;
  }

  // Factorial implementation: computes the factorial of n
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  // Maximum of an array implementation: returns the max value from an array
  public static int findMaximum(int[] a) {
    int result = a[0];
    for (int i = 0; i < a.length; ++i) {
      if (a[i] > result) {
        result = a[i];
      }
    }
    return result;
  } 

}