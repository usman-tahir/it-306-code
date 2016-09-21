
public class Node {

    private int val;
    private Node next;
    private static int size;

    public Node(int v, Node n) {
        this.val = v;
        this.next = n;
    }

    public boolean hasNext() {
        if (this.next == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setNext(Node n) {
        this.next = n;
        size++;
    }

    public void setVal(int v) {
        this.val = v;
    }

    public int getVal() {
        return this.val;
    }

    public Node getNext() {
        return this.next;
    }

    public int getSize() {
        return size;
    }

}