
public class TreeNode {
  private double element;
  private TreeNode parent;
  private TreeNode[] children;
  private TreeNode left;
  private TreeNode right;
  private int numberOfChildren;

  public TreeNode() {
    this.element = 0.00;
    this.parent = null;
    this.children = null;
    this.left = null;
    this.right = null;
    this.numberOfChildren = 0;
  }

  public double getElement() {
    return this.element;
  }

  public void setElement(double element) {
    this.element = element;
  }

  public TreeNode getLeft() {
    return this.left;
  }

  public void setLeft(TreeNode left) {
    if (this.left == null) {
      this.numberOfChildren += 1;
    }
    this.left = left;
  }

  public TreeNode getRight() {
    return this.right;
  }

  public void setRight(TreeNode right) {
    if (this.right == null) {
      this.numberOfChildren += 1;
    }
    this.right = right;
  }

  public boolean addChild(TreeNode child) {
    this.children[this.numberOfChildren += 1] = child;
    return true;
  }

  public boolean addChildren(TreeNode[] children) {
    for (int i = 0; i < children.length; i += 1) {
      this.children[this.numberOfChildren += 1] = children[i];
    }
    return true;
  }

  public TreeNode[] getChildren() {
    return this.children;
  }

  public int getNumberOfChildren() {
    return this.numberOfChildren;
  }

  public TreeNode getParent() {
    return this.parent;
  }

}