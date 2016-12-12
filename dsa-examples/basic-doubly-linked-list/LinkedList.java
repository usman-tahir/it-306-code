
public class LinkedList {
  private Node start;
  private Node end;
  private int size;

  public LinkedList() {
    this.start = null;
    this.end = null;
    this.size = 0;
  }

  public Node getStart() {
    return this.start;
  }

  public Node getEnd() {
    return this.end;
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.start == null;
  }

  public void insertAtStart(int value) {
    Node newNode = new Node(value, null, null);
    if (this.start == null) {
      this.start = newNode;
      this.end = start;
    } else {
      start.setPrevious(newNode);
      newNode.setNext(start);
      start = newNode;
    }
    this.size++;
  }

  public void insertAtEnd(int value) {
    Node newNode = new Node(value, null, null);
    if (this.start == null) {
      this.start = newNode;
      this.end = start;
    } else {
      newNode.setPrevious(end);
      this.end.setNext(newNode);
      this.end = newNode;
    }
    this.size++;
  }
  
  public void insertAtPosition(int value, int position) {
    Node newNode = new Node(value, null, null);
    if (position == 1) {
      this.insertAtStart(value);
      return;
    } else {
      Node pointer = this.start;
      for (int i = 2; i <= size; i += 1) {
        if (i == position) {
          Node temp = pointer.getNext();
          pointer.setNext(newNode);
          newNode.setPrevious(pointer);
          pointer.setNext(temp);
          temp.setPrevious(pointer);
        }
        pointer = pointer.getNext();
      }
      this.size++;
    }
  }

  public void deleteAtPosition(int position) {
    if (position == 1) {
      if (this.size == 1) {
        this.start = null;
        this.end = null;
        this.size = 0;
        return;
      } else {
        this.start = start.getNext();
        this.start.setPrevious(null);
        this.size--;
        return;
      }
    }

    if (position == this.size) {
      this.end = this.end.getPrevious();
      this.end.setNext(null);
      this.size--;
    }

    Node pointer = this.start.getNext();
    for (int i = 2; i <= size; i += 1) {
      if (i == position) {
        Node previous = pointer.getPrevious();
        Node next = pointer.getNext();

        pointer.setNext(next);
        next.setPrevious(previous);
        this.size--;
        return;
      }
      pointer = pointer.getNext();
    }
  }

  public void display() {
    System.out.println("\n--- Doubly-Linked List ---\n");
    if (this.size == 0) {
      System.out.println(this.start.getData());
      return;
    } else {
      Node pointer = this.start;
      System.out.println(start.getData() + " <-> ");
      pointer = this.start.getNext();
      while (pointer.getNext() != null) {
        System.out.println(pointer.getData() + " <-> ");
        pointer = pointer.getNext();
      }
      System.out.println(pointer.getData() + "\n");
    }
  }
}