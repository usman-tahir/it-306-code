
public class Node {

  private int data;
  private Node nextNode;

  public Node(int d, Node n) {
    this.data = d;
    this.nextNode = n;
  }

  public Node getNext() {
    return this.nextNode;
  }

  public int getData() {
    return this.data;
  }

  public void addNodeAfter(Node n) {
    // TODO
  }

}