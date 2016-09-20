
public class partialSum {
  public static void main(String[] args) {
    int testSum = sum(5);
    System.out.println("The value of sum(5) is " + testSum);
  }

  // Calculates a summation from i = 1 to i = n of i^3
  public static int sum(int n) {
    int result = 0; // Counts for one unit of time (assignment)

    for (int i = 0; i <= n; i += 1) { // Counts for 2n + 2 units of time (iniitalize i, test i <= n, increment i)
      result += (i * i * i); // Counts for four units of time (assignment, two multiplications, and one addition)
    }
    return result; // Counts for one unit of time (return)
    // Total computing time: (2n + 2) + (4n) + (2) = 6n + 4
    // Ignore the compute times for the initial assignment and return to get 6n + 2
    // This method tuns in O(n) time
  }
}