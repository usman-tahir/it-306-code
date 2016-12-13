
public class BinaryTree {
  private Node root;

  public BinaryTree() {
    this.root = null;
  }

  /**
    Returns true if the given target is in the binary tree,
    and false otherwise. Uses recursion to accomplish this
    determination
  */
  public boolean lookup(int data) {
    return lookup(this.root, data);
  }

  /**
    Recursive lookup - given a node, recurse down the tree and
    search for the given data
  */
  private boolean lookup(Node node, int data) {
    if (node == null) {
      return false;
    }

    if (data == node.getData()) {
      return true;
    } else if (data < node.getData()) {
      return lookup(node.getLeft(), data);
    } else {
      return lookup(node.getRight(), data);
    }
  }

  /**
    Inserts the given data element into the BST; Uses a
    recursive helper method
  */
  public void insert(int data) {
    this.root = this.insert(this.root, data);
  }
  /**
    Recursive insert - given a node pointer, recur down and insert
    the given data into the tree. The new node pointer is then
    returned
  */
  private Node insert(Node node, int data) {
    if (node == null) {
      node = new Node(data);
    } else {
      if (data <= node.getData()) {
        node.setLeft(insert(node.getLeft(), data));
      } else {
        node.setRight(insert(node.getRight(), data));
      }
    }

    return node;
  }
}