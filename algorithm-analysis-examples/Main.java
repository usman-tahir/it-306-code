
public class Main {
  public static void main(String[] args) {

    // sum
    int x = sum(5);
    System.out.println("sum(5) returns " + x);
  }

  public static int sum(int n) {
    int result = 0;
    for (int i = 1; i <= n; ++i) {
      result += i;
    }
    return result;
  }

}