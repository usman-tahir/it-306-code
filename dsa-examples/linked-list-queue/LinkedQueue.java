
public class LinkedQueue {
  private Node first, last;
  private int size;

  public LinkedQueue() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }

  public Node getFirst() {
    return this.first;
  }

  public Node getLast() {
    return this.last;
  }

  public int getSize() {
    return this.size;
  }

  public void setFirst(Node first) {
    this.first = first;
  }

  public void setLast(Node last) {
    this.size = size;
  }

  public void insert(int data) {
    Node n = new Node(data, null);
    if (this.last == null) {
      this.setFirst(n);
      this.setLast(n);
    } else {
      this.last.setNext(n);
      this.last = this.last.getNext();
    }
    this.size++;
  }

  public Node remove() {
    if (this.isEmpty()) {
      throw new NoSuchElementException("Undeflow exception");
    } else {
      Node n = this.first;
      this.first = n.getNext();
      if (this.first == null) {
        this.last = null;
      }
      this.size--;
      return n;
    }
  }

  public Node peek() {
    if (this.isEmpty()) {
      throw new NoSuchElementException("Underflow exception");
    }
    return this.getFirst();
  }

  public boolean isEmpty() {
    return (this.getFirst() == null) ? (true) : (false);
  }

  public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(String message) {
      super(message);
    }
  }
}