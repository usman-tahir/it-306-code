
public class Counter {
  public static void main(String[] args) {
    counter(10);
    counter(-10);
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

}