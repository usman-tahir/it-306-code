
public class BinaryMinHeap {
  private int[] data;
  private int heapSize;

  public BinaryMinHeap(int size) {
    this.data = new int[size];
    this.heapSize = 0;
  }

  public int getMinimum() {
    if (this.isEmpty()) {
      throw new HeapException("The Min Heap is currently empty.");
    } else {
      return data[0];
    }
  }

  public boolean isEmpty() {
    return (this.heapSize == 0);
  }

  private int getLeftChildren(int nodeIndex) {
    return (2 * (nodeIndex + 1));
  }

  private int getRightChildren(int nodeIndex) {
    return (2 * (nodeIndex + 2));
  }

  private int getParentIndex(int nodeIndex) {
    return ((nodeIndex - 1) / 2);
  }

  public class HeapException extends RuntimeException {
    public HeapException(String message) {
      super(message);
    }
  }
}