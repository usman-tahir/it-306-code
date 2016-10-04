
/*
  Reads in n, k and p as command line arguments, and executes the following formula:
  (n choose k) -> p^k (1 - p)^(n - k)
*/
public class Binomial {

  // Uses memoization
  public static double binomial(int n, int k, double p) {

    double[][] b = new double[n + 1][k + 1];

    // Base case
    for (int i = 0; i <= n; i++) {
      b[i][0] = Math.pow(1.0 - p, i);
    }
    b[0][0] = 1.0;

    // Recursive formula
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= k; j++) {
        b[i][j] = p * b[i - 1][j - 1] + (1.0 - p) * b[i - 1][j];
      }
    }
    return b[n][k];

  }

  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int k = Integer.parseInt(args[1]);
    double p = Double.parseDouble(args[2]);

    System.out.println(binomial(n, k, p));

  }

}