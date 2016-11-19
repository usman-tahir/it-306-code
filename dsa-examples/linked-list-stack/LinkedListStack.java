
public class LinkedListStack {
  private LinkedList list;

  public LinkedListStack() {
    this.list = new LinkedList();
  }

  public void push(int data) {
    this.list.insertFirst(data);
  }

  public Node pop() {
    if (!this.list.isEmpty()) {
      Node d = this.list.deleteFirst();
      return d;
    } else {
      throw new LinkedListStackException("There are no elements left in this stack.");
    }
  }

  public class LinkedListStackException extends RuntimeException {
    public LinkedListStackException(String message) {
      super(message);
    }
  }
}