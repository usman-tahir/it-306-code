
public class Stack {
  private int top;
  private int[] storage;

  public Stack(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("A Stacks's capacity must be positive.");
    } else {
      this.storage = new int[capacity];
      this.top = -1; // Last element of the array
    }
  }

  public void push(int value) {
    if (this.top == this.storage.length) {
      throw new StackException("The Stack's underlying storage will be overflowed.");
    } else {
      this.top++;
      this.storage[this.top] = value;
    }
  }

  public int peek() {
    if (this.top == -1) {
      throw new StackException("This Stack is empty.");
    } else {
      return this.storage[this.top];
    }
  }

  public void pop() {
    if (this.top == -1) {
      throw new StackException("This Stack is empty.");
    } else {
      this.top--;
    }
  }

  public boolean isEmpty() {
    return (this.top == -1);
  }

  public class StackException extends RuntimeException {
    public StackException(String message) {
      super(message);
    }
  }
}