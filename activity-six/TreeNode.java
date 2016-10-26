
public class TreeNode {
  private double element; // Data
  private TreeNode parent; // Represents a link to the parent node
  private TreeNode left;
  private TreeNode right;
  private int numberOfChildren;

  // Default Constructor
  public TreeNode() {
    this.element = 0.00;
    this.parent = null;
    this.left = null;
    this.right = null;
    this.numberOfChildren = 0;
  }

  // Parameterized Constructor
  public TreeNode(double element) {
    this.element = element;
    this.parent = null;
    this.left = null;
    this.right = null;
    this.numberOfChildren = 0;
  }

  // Get and Set methods
  public double getElement() {
    return this.element;
  }

  public void setElement(double element) {
    this.element = element;
  }

  public TreeNode getParent() {
    return this.parent;
  }

  public void setParent(TreeNode parent) {
    this.parent = parent;
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

  public int getNumChildren() {
    return this.numberOfChildren;
  }

  public String toString() {
    return String.valueOf(this.getElement());
  }
}