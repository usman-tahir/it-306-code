
public class Node {
  private int value;
  private Node next;

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public Node(int value) {
    this.value = value;
    this.next = null;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public boolean hasNext() {
    if (this.next == null) {
      return false;
    }
    return true;
  }

}