
public class StackTest {
  public static void main(String[] args) {
    Stack s = new Stack(10);
    printStack(s);
    s.push(10);
    s.push(20);
    printStack(s);
  }

  public static void printStack(Stack s) {
    if (s.isEmpty()) {
      System.out.println("This Stack is empty.");
    } else {
      System.out.println("This Stack has the following elements: ");
      while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
      }
    }
  }
}