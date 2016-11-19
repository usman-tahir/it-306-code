
public class Node<AnyType> {
  public AnyType data;
  public Node<AnyType> next;

  public Node(AnyType data) {
    this.data = data;
    this.next = null;
  }

  public AnyType getData() {
    return this.data;
  }

  public Node getNext() {
    return this.next;
  }

  public void setData(AnyType data) {
    this.data = data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public boolean hasNext() {
    return this.next != null;
  }
}