
public class Main {
  public static void main(String[] args) {

    // sum
    int sumOfFive = sum(5);
    System.out.println("sum(5) returns " + sumOfFive);

    // horner
    int[] numbers = {1, 2, 3};
    int polynomialWithHorner = horner(numbers, 2, 2);
    System.out.println("polynomialWithHorner({1, 2, 3}, 2, 4) returns " + polynomialWithHorner);
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

}