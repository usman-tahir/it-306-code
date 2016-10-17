
public class LNodeTest {

  public static void main(String[] args) {

    LNode head = new LNode(0, null);
    LNode current = head;
    int i;

    for (i = 0; i < 9; i += 1) {
      LNode temp = new LNode(i + 1, null);
      current.setNext(temp);
      current = current.getNext();
    }

    printLinkedList(head);
    head = addToHead(head, new LNode(-1, null));
    printLinkedList(head);
    // System.out.println(search(5, head));

    LNode tail = LNode.getTail(head);
    System.out.println("Data for tail: " + tail.getData());

  }

  public static void printLinkedList(LNode head) {
    LNode current = head;
    
    if (current == null) {
      System.out.println("This Linked Node has no other links.");
    }

    do {
      System.out.println("Data: [" + current.getData() + "] next: " + current.hasNext());
      current = current.getNext();
    } while (current != null);

  }

  public static boolean search(Integer searchFor, LNode head) {
    LNode current = head;
    
    if (current == null) {
      System.out.println("This Linked Node has no other chains.");
      return false;
    }

    do {
      if (searchFor.equals(current.getData())) {
        return true;
      }
      current = current.getNext();
    } while (current != null);

    return false;

  }

  public static LNode addToHead(LNode head, LNode node) {
    LNode oldHead = head;
    head = node;
    head.setNext(oldHead);
    return head;
  }

  public static LNode addToTail(LNode tail, LNode node) {
    LNode oldTail = tail;
    tail = node;
    oldTail.setNext(tail);
    return tail;
  }

}