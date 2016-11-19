
public class LinkedListStack {
  private int count;
  private LinkedList list;

  public LinkedListStack() {
    this.list = new LinkedList();
    this.count = 0;
  }

  public void push(int data) {
    this.list.insertFirst(data);
    this.count++;
  }

  public Node pop() {
    if (!this.list.isEmpty()) {
      Node d = this.list.deleteFirst();
      this.count--;
      return d;
    } else {
      throw new LinkedListStackException("There are no elements left in this stack.");
    }
  }

  public int getCount() {
    return this.count;
  }

  public class LinkedListStackException extends RuntimeException {
    public LinkedListStackException(String message) {
      super(message);
    }
  }
}