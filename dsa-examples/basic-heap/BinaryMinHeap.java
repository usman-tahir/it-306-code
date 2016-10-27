
public class BinaryMinHeap {
  private int[] data;
  private int heapSize;

  public BinaryMinHeap(int size) {
    this.data = new int[size];
    this.heapSize = 0;
  }

  public void insert(int value) {
    if (this.heapSize == this.data.length) {
      throw new HeapException("This Min Heap is currently full.");
    } else {
      this.heapSize++;
      this.data[heapSize - 1] = value;
      siftUp(this.heapSize - 1);
    }
  }

  private void siftUp(int nodeIndex) {
    int parentIndex, temp;
    if (nodeIndex != 0) {
      parentIndex = getParentIndex(nodeIndex);
      if (this.data[parentIndex] > this.data[nodeIndex]) {
        temp = this.data[parentIndex];
        data[parentIndex] = data[nodeIndex];
        data[nodeIndex] = temp;
        siftUp(parentIndex);
      }
    }
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