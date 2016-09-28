
public class Implementation {
  public static void main(String[] args) {
    String s = "(2 + 3) * [ (4 / 4 )]";
    System.out.println(validate(s));
  }

  public static boolean validate(String s) {
    final char LEFT_P = "(";
    final char RIGHT_P = ")";
    final char LEFT_B = "[";
    final char RIGHT_B = "]";
    boolean failed = false;
    Stack stack = new Stack();
    // TODO
  }

}