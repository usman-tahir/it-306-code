
public class TestLinkedList {

  public static void main(String[] args) {

    LNode head = new LNode(1, null);
    LNode current = head;

    for (int i = 0; i < 9; i += 1) {
      LNode temp = new LNode(i + 2, null);
      current.setNext(temp);
      current = current.getNext();
    }

    printLinkedList(head);
    System.out.println(search(5, head));

  }

  public static void printLinkedList(LNode head) {
    LNode current = head;
    
    if (current == null) {
      System.out.println("empty chain.");
    } else {
      do {
        System.out.println(current.getData());
        current = current.getNext();
      } while (current != null);
    }
  }

  public static boolean search(Integer q, LNode head) {
    LNode current = head;

    if (current == null) {
      System.out.println("empty chain.");
      return false;
    } else {
      do {
        if (q.equals(current.getData())) {
          return true;
        } else {
          current = current.getNext();
        }
      } while (current != null);
      return false;
    }
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