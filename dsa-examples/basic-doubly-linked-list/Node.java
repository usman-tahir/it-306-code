
public class Node {
  private int data;
  private Node next, previous;

  public Node() {
    this.next = null;
    this.previous = null;
    this.data = 0;
  }

  public Node(int data, Node next, Node previous) {
    this.data = data;
    this.next = next;
    this.previous = previous;
  }

  public int getData() {
    return this.data;
  }

  public Node getNext() {
    return this.next;
  }

  public Node getPrevious() {
    return this.previous;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setPrevious(Node previous) {
    this.previous = previous;
  }

  public void setData(int data) {
    this.data = data;
  }
}