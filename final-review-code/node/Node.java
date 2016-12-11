
public class Node {
  private Node next;
  private int data;

  public Node(int data) {
    this.next = null;
    this.data = data;
  }

  public Node getNext() {
    return this.next;
  }

  public int getData() {
    return this.data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setData(int data) {
    this.data = data;
  }

  public boolean hasNext() {
    if (this.next == null) {
      return false;
    }
    return true;
  }
}