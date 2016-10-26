
public class StackTest {
  public static void main(String[] args) {
    Stack s = new Stack(10);
    printStack(s);

    // Push the numbers 1-10 into the Stack (last in, first out)
    for (int i = 1; i <= 10; i += 1) {
      s.push(i);
    }
    printStack(s);
  }

  public static void printStack(Stack s) {
    if (s.isEmpty()) {
      System.out.println("This Stack is empty.");
    } else {
      System.out.println("This Stack has the following elements: ");
      while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop(); // Take elements out of the array as you view them
      }
    }
  }
}