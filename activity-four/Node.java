
public class Node {

    // The integer value associated with each node (its data)
    private int val;
    // The next node in the list
    private Node next;
    // The number of nodes in the list
    private static int size;

    // Parameterized constructor
    public Node(int v, Node n) {
        this.val = v;
        this.next = n;
    }

    public boolean hasNext() {
        if (this.next == null) { // The node is at position 'tail'
            return false;
        } else {
            return true; // The node has more links connected to it
        }
    }

    // Add a node to the linked list, and update its size
    public void setNext(Node n) {
        this.next = n;
        size++;
    }

    // Set the value for a given node
    public void setVal(int v) {
        this.val = v;
    }

    // Return the value for a given node
    public int getVal() {
        return this.val;
    }

    // Get the next node in the linked list
    public Node getNext() {
        return this.next;
    }

    // Return the number of nodes in the linked list
    public int getSize() {
        return size;
    }

}