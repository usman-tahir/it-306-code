
public class BinaryTreeNode {
  private BinaryTreeNode left;
  private BinaryTreeNode right;
  private int data;

  public BinaryTreeNode() {
    this.left = null;
    this.right = null;
    this.data = 0;
  }

  public BinaryTreeNode(int data) {
    this.left = null;
    this.right = null;
    this.data = data;
  }

  public BinaryTreeNode getLeft() {
    return this.left;
  }

  public BinaryTreeNode getRight() {
    return this.right;
  }

  public int getData() {
    return this.data;
  }

  public void setLeft(BinaryTreeNode left) {
    this.left = left;
  }

  public void setRight(BinaryTreeNode right) {
    this.right = right;
  }

  public void setData(int data) {
    this.data = data;
  }
}