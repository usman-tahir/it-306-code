
public class Node {

  private int data;
  private Node nextNode;
  private static int size;

  public Node(int d, Node n) {
    this.data = d;
    this.nextNode = n;
    size += 1;
  }

  public boolean hasNext() {
    if (this.nextNode == null) {
      return false;
    }
    return true;
  }

  public Node getNext() {
    return this.nextNode;
  }

  public void setNext(node nextNode) {
    this.nextNode = nextNode;
  }

  public int getData() {
    return this.data;
  }

  public void addNodeAfter(Node n) {
    // TODO
  }

  public static int getNumberOfNodes() {
    return size;
  }

}