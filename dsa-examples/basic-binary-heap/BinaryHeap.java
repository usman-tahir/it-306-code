
import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryHeap {
  private static final int children = 2;
  private int size;
  private int[] heap;

  public BinaryHeap(int capacity) {
    this.size = 0;
    this.heap = new int[capacity + 1];
    Arrays.fill(heap, -1);
  }

  public boolean full() {
    return this.size == this.heap.length;
  }

  public boolean empty() {
    return this.size == 0;
  }

  public void clear() {
    this.size = 0;
  }

  private int parent(int i) {
    return (i - 1) / children;
  }

  private int nthChild(int i, int j) {
    return (children * i + j);
  }

  public void insert(int i) {
    if (this.full()) {
      throw new NoSuchElementException("Error: Overflow Exception");
    } else {
      this.heap[this.size++] = i;
      percolateUp(this.size - 1);
    }
  }

  public int findMin() {
    if (this.empty()) {
      throw new NoSuchElementException("Error: Underflow Exception");
    } else {
      return this.heap[0];
    }
  }

  public int deleteMin() {
    int keyItem = this.heap[0];
    this.delete(0);
    return keyItem;
  }

  public int delete(int i) {
    if (this.empty()) {
      throw new NoSuchElementException("Error: Underflow Exception");
    } else {
      int keyItem = this.heap[i];
      this.heap[i] = this.heap[this.size - 1];
      this.size--;
      this.percolateDown(i);
      return keyItem;
    }
  }

  private void percolateUp(int childIndex) {
    int temp = this.heap[childIndex];
    while (childIndex > 0 && temp < this.heap[parent(childIndex)]) {
      this.heap[childIndex] = this.heap[parent(childIndex)];
      childIndex = parent(childIndex);
    }
    this.heap[childIndex] = temp;
  }

  private void percolateDown(int index) {
    int child;
    int temp = this.heap[index];
    while (nthChild(index, 1) < this.size) {
      child = minChild(index);
      if (this.heap[child] < temp) {
        this.heap[index] = this.heap[child];
      } else {
        break;
      }
      index = child;
    }
    this.heap[index] = temp;
  }

  private int minChild(int index) {
    int bestChild = nthChild(index, 1);
    int k = 2;
    int position = nthChild(index, k);
    while ((k <= children) && (position < this.size)) {
      if (this.heap[position] < this.heap[bestChild]) {
        bestChild = position;
      }
      position = nthChild(index, k++);
    }
    return bestChild;
  }

  public void printBinaryHeap() {
    System.out.print("Current Binary Heap: ");
    for (int i = 0; i < this.size; i += 1) {
      System.out.print(this.heap[i] + " ");
    }
    System.out.println();
  }
}