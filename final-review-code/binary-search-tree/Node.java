
public class Node {
  private Node left;
  private Node right;
  private int data;

  public Node(int data) {
    this.left = null;
    this.right = null;
    this.data = data;
  }

  public Node getLeft() {
    return this.left;
  }

  public Node getRight() {
    return this.right;
  }

  public int getData() {
    return this.data;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public void setData(int data) {
    this.data = data;
  }
}