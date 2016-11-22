
public class Node {
  private int data;
  private Node next;

  public Node() {
    this.data = 0;
    this.link = null;
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return this.data;
  }

  public Node getNext() {
    return this.next;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public boolean hasNext() {
    if (this.next != null) {
      return true;
    }
    return false;
  }
}