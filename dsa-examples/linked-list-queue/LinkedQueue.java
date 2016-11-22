
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
    Node pointer = new Node(data, null);
    if (this.last == null) {
      this.first = pointer;
      this.last = pointer;
    } else {
      this.last.setNext(pointer);
      this.last = this.last.getNext();
    }
    this.size++;
  }

  public Node remove() {
    if (this.isEmpty()) {
      throw new NoSuchElementException("Error: Underflow exception");
    } else {
      Node pointer = this.first;
      this.first = pointer.getNext();
      if (this.first == null) {
        this.last = null;
      }
      this.size--;
      return pointer;
    }
  }

  public Node peek() {
    if (this.isEmpty()) {
      throw new NoSuchElementException("Error: Underflow exception");
    }
    return this.getFirst();
  }

  public boolean isEmpty() {
    return (this.getFirst() == null) ? (true) : (false);
  }

  public void display() {
    System.out.print("LinkedQueue: ");
    if (this.getSize() == 0) {
      System.out.println("Empty.\n");
      return;
    } else {
      Node index = this.getFirst();
      while (index != this.getLast().getNext()) {
        System.out.print(index.getData() + " ");
        index = index.getNext();
      }
      System.out.println();
    }
  }

  public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(String message) {
      super(message);
    }
  }
}