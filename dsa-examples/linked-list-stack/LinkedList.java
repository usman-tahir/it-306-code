
public class LinkedList {
  private Node first;

  public LinkedList() {
    this.first = null;
  }

  public LinkedList(Node first) {
    this.first = first;
  }

  public Node getFirst() {
    return this.first;
  }

  public void insertFirst(int data) {
    Node n = new Node(data);
    n.setNext(this.first);
    this.first = n;
  }

  public Node deleteFirst() {
    Node temp = this.first;
    this.first = first.getNext();
    return temp;
  }

  public boolean isEmpty() {
    return (this.first == null) ? (true) : (false);
  }
}