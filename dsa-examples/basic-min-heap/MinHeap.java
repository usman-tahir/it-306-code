
public class MinHeap {
  private int[] heap;
  private int size;
  private int maxSize;

  private static final int FRONT = 1;

  public MinHeap(int maxSize) {
    this.heap = new int[maxSize + 1];
    this.size = 0;
    this.maxSize = maxSize;
    this.heap[0] = Integer.MIN_VALUE;
  }

  private int parent(int position) {
    return (position / 2);
  }

  private int leftChild(int position) {
    return (2 * position);
  }

  private int rightChild(int position) {
    return ((2 * position) + 1);
  }

  private boolean isLeaf(int position) {
    if (position >= (this.size / 2) && position <= this.size) {
      return (true);
    } else {
      return (false);
    }
  }

  private void swap(int positionOne, int positionTwo) {
    int temp = this.heap[positionOne];
    this.heap[positionOne] = this.heap[positionTwo];
    this.heap[positionTwo] = temp;
  }

  private void minHeapify(int position) {
    if (!this.isLeaf(position)) {
      if (this.heap[position] > this.heap[this.leftChild(position)] || this.heap[position] > this.heap[(this.rightChild(position))]) {
        if (this.heap[this.leftChild(position)] < this.heap[this.rightChild(position)]) {
          this.swap(position, this.leftChild(position));
          this.minHeapify(this.leftChild(position));
        } else {
          this.swap(position, this.rightChild(position));
          this.minHeapify(this.rightChild(position));
        }
      }
    }
  }

  public void insert(int element) {
    this.heap[++this.size] = element;
    int current = this.size;

    while (this.heap[current] < this.heap[this.parent(current)]) {
      this.swap(current, this.parent(current));
      current = this.parent(current);
    }
  }

  public int remove() {
    int removed = this.heap[FRONT];
    this.heap[FRONT] = this.heap[this.size--];
    this.minHeapify(FRONT);
    return removed;
  }

  public void minHeap() {
    for (int position = (this.size / 2); position >= 1; position -= 1) {
      this.minHeapify(position);
    }
  }

  public void printMinHeap() {
    for (int i = 0; i <= (this.size / 2); i += 1) {
      System.out.print("parent: " + this.heap[i] + " left child: " + this.heap[this.leftChild(i)] + " right child: " + this.heap[this.rightChild(i)]);
      System.out.println();
    }
  }
}