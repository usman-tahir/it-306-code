
public class Queue {
  private Node head;
  private Node tail;

  public void enqueue(Node n) {
    if (this.head == null) {
      this.head = n;
      this.tail = n;
    } else {
      this.tail.setNext(n);
      this.tail = n;
    }
  }

  public int dequeue() {
    if (this.head == null) {
      return -1;
    } else if (this.head == this.tail) {
      int value = head.getValue();
      this.head = null;
      this.tail = null;
      return value;
    } else {
      int value = this.head.getValue();
      Node oldHead = this.head;
      head = head.getNext();
      oldHead.setNext(null);
      oldHead = null;
      return value;
    }
  }

}