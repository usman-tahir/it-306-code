
public class BinaryTree {
  private BinaryTreeNode root;

  public BinaryTree() {
    this.root = null;
  }

  public boolean isEmpty() {
    return this.root == null;
  }

  public void insert(int data) {
    this.root = insert(this.root, data);
  }

  private BinaryTreeNode insert(BinaryTreeNode node, int data) {
    if (node == null) {
      node = new BinaryTreeNode(data);
    } else {
      if (node.getRight() == null) {
        node.setRight(insert(node.getRight(), data));
      } else {
        node.setLeft(insert(node.getLeft(), data));
      }
    }
    return node;
  }

  public int count() {
    return count(this.root);
  }

  private int count(BinaryTreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int l = 1;
      l += count(root.getLeft());
      l += count(root.getRight());
      return l;
    }
  }

  public boolean search(int data) {
    return search(this.root, data);
  }

  private boolean search(BinaryTreeNode root, int data) {
    if (root.getData() == data) {
      return true;
    }
    if (root.getLeft() != null) {
      if (search(root.getLeft(), data)) {
        return true;
      }
    }
    if (root.getRight() != null) {
      if (search(root.getRight(), data)) {
        return true;
      }
    }
    return false;
  }

  public void inOrder() {
    inOrder(this.root);
  }

  private void inOrder(BinaryTreeNode root) {
    if (root != null) {
      inOrder(root.getLeft());
      System.out.print(root.getData() + " ");
      inOrder(root.getRight());
    }
  }

  public void preOrder() {
    preOrder(this.root);
  }

  private void preOrder(BinaryTreeNode root) {
    if (root != null) {
      System.out.println(root.getData() + " ");
      preOrder(root.getLeft());
      preOrder(root.getRight());
    }
  }

  public void postOrder() {
    postOrder(this.root);
  }

  private void postOrder(BinaryTreeNode root) {
    if (root != null) {
      postOrder(root.getLeft());
      postOrder(root.getRight());
      System.out.print(root.getData() + " ");
    }
  }
}