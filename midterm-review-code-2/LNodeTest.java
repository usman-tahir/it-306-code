
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

}