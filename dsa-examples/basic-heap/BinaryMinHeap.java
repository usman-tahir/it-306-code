
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

  public void removeMin() {
    if (this.isEmpty()) {
      throw new HeapException("This Min Heap is empty.");
    } else {
      this.data[0] = this.data[this.heapSize - 1];
      this.heapSize--;
      if (this.heapSize > 0) {
        siftDown(0);
      }
    }
  }

  private void siftDown(int nodeIndex) {
    int leftChildIndex, rightChildIndex, minIndex, temp;
    leftChildIndex = getLeftChildIndex(nodeIndex);
    rightChildIndex = getRightChildIndex(nodeIndex);
    if (rightChildIndex >= this.heapSize) {
      if (leftChildIndex >= this.heapSize) {
        return;
      } else {
        minIndex = leftChildIndex;
      }
    } else {
      if (this.data[leftChildIndex] <= this.data[rightChildIndex]) {
        minIndex = leftChildIndex;
      } else {
        minIndex = rightChildIndex;
      }
    }

    if (this.data[nodeIndex] > this.data[minIndex]) {
      temp = this.data[minIndex];
      this.data[minIndex] = this.data[nodeIndex];
      this.data[nodeIndex] = temp;
      siftDown(minIndex);
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

  private int getLeftChildIndex(int nodeIndex) {
    return 2 * nodeIndex + 1;
  }

  private int getRightChildIndex(int nodeIndex) {
    return 2 * nodeIndex + 2;
  }

  private int getParentIndex(int nodeIndex) {
    return ((nodeIndex - 1) / 2);
  }

  public int[] getData() {
    return this.data;
  }

  public class HeapException extends RuntimeException {
    public HeapException(String message) {
      super(message);
    }
  }
}