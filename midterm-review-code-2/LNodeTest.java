
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
    /*
    printLinkedList(head);
    head = addToHead(head, new LNode(-1, null));
    printLinkedList(head);
    */

    /*
    LNode reversedList = reverseLinkedList(head);
    printLinkedList(reversedList);
    */
    // System.out.println(search(5, head));
    head = insertAtPosition(head, -1, 1);
    printLinkedList(head);

    /*
    LNode reversedList = reverseLinkedList(head);
    printLinkedList(reversedList);
    */
    deleteAtPosition(head, 1);
    printLinkedList(head);

    /*
    System.out.println("The length of the linked list is: " + getLength(current));

    LNode tail = LNode.getTail(head);
    System.out.println("Data for tail: " + tail.getData());
    */

  }

  public static void printLinkedList(LNode head) {
    LNode current = head;
    
    if (current == null) {
      System.out.println("This Linked Node has no other links.");
    }

    do {
      System.out.print(current.getData() + " -> ");
      current = current.getNext();
    } while (current != null);
    System.out.print("null\n");
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

  public static LNode reverseLinkedList(LNode head) {
    LNode current = head;
    LNode previous = null;
    LNode next = null;
    while (current != null) {
      next = current.getNext();
      current.setNext(previous);
      previous = current;
      current = next;
    }
    return previous;
  }

  public static int getLength(LNode head) {
    if (head.getNext() == null || head == null) {
      return 0;
    }

    int count = 0;
    LNode current = head;

    while (current != null) {
      count += 1;
      current = current.getNext();
    }
    return count;
  }

  public static LNode insertAtPosition(LNode head, int data, int position) {
    int size = getLength(head);
    if (position > size + 1 || position < 1) {
      return head;
    }

    LNode newNode = new LNode(data, null);
    if (position == 1) {
      newNode.setNext(head);
      return newNode;
    } else {
      LNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.getNext();
        count += 1;
      }
      LNode current = previous.getNext();
      newNode.setNext(current);
      previous.setNext(newNode);
      return head;
    }
  }

  private static LNode deleteAtPosition(LNode head, int position) {
    int size = getLength(head);
    if (position > size || position < 1) {
      return head;
    }

    if (position == 1) {
      LNode temp = head;
      head = head.getNext();
      temp.setNext(null);
      return temp;
    } else {
      LNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.getNext();
        count += 1;
      }

      LNode current = previous.getNext();
      previous.setNext(current.getNext());
      current.setNext(null);
      return current;
    }
  }

}