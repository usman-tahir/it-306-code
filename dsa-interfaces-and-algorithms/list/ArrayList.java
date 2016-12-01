
public class ArrayList<E> implements List<E> {
  public static final int CAPACITY = 16;
  private E[] data;
  private int size;

  public ArrayList() {
    this(CAPACITY);
    this.size = 0;
  }

  public ArrayList(int capacity) {
    this.data = (E[])new Object[capacity];
    this.size = 0;
  }

  public int size() {
    return this.size;
  }

  public E get(int index) throws IndexOutOfBoundsException {
    this.checkIndex(index, this.size);
    return this.data[index];
  }

  public E set(int index, E element) throws IndexOutOfBoundsException {
    this.checkIndex(index, this.size);
    E temp = this.data[index];
    this.data[index] = element;
    return temp;
  }

  public void add(int index, E element) throws IndexOutOfBoundsException, IllegalStateException {
    this.checkIndex(index, this.size + 1);
    if (this.size == this.data.length) {
      throw new IllegalStateException("Error: The ArrayList is full.");
    } else {
      int k;
      for (k = this.size - 1; k >= index; k -= 1) {
        this.data[k + 1] = this.data[k];
      }
      this.data[index] = element;
      this.size += 1;
    }
  }

  public E remove(int index) throws IndexOutOfBoundsException {
    this.checkIndex(index, this.size);
    E temp = this.data[index];
    int k;
    for (k = index; k < this.size - 1; k += 1) {
      this.data[k] = this.data[k + 1];
    }
    this.data[this.size - 1] = null;
    this.size -= 1;
    return temp;
  }

  public boolean empty() {
    return this.size == 0;
  }
  protected void checkIndex(int index, int size) throws IndexOutOfBoundsException {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Error: Illegal index " + index);
    }
  }
}