
public class NodeTester {
  public static void main(String[] args) {
    Node head = new Node(0);
    int[] data = {42, 23, 12, 42, 64, 53, 23, 64, 42, 42};

    Node current = head;
    for (int i = 0; i < data.length; i += 1) {
      System.out.println("Data set for node: " + data[i]);
      Node newNode = new Node(data[i]);
      current.setNext(newNode);
      current = current.getNext();
    }

    System.out.printf("There are currently " + dataValueCounter(42, head) + " nodes with a data value of 42.\n");
  }
  public static int dataValueCounter(int searchValue, Node head) {
    int counter = 0;
    Node current = head;
    while (current.hasNext()) {
      System.out.println("Current data: " + current.getData());
      if (current.getData() == searchValue) {
        counter += 1;
      }
      current = current.getNext();
    }
    if (current.getData() == searchValue) {
      counter += 1;
    }
    return counter;
  }
}