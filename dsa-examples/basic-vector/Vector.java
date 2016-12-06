
import java.util.ArrayList;

public class Vector<T> {
  private int capacity;
  private int size;
  private ArrayList<T> vector;
  private static final int INCREMENT_FACTOR = 1;

  public Vector(int size) {
    this.capacity = size + INCREMENT_FACTOR;
    this.size = size;
    this.vector = new ArrayList<T>();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int getSize() {
    return this.size;
  }

  public ArrayList<T> getVector() {
    return this.vector;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void getSize(int size) {
    this.size = size;
  }

  public void store(int index, T value) {
    try {
      this.vector.set(index, value);
    } catch (IndexOutOfBoundsException e) {
      if (index >= 0 && (index < this.size)) {
        vector.add(index, value);
      }

      if (index >= 0 && (index >= this.size && index < this.capacity)) {
        vector.add(index, value);
        this.size = index + 1;
        if (this.size == this.capacity) {
          capacity = capacity + INCREMENT_FACTOR;
        }
        if (index >= this.capacity) {
          throw new IndexOutOfBoundsException();
        }
      }
    }
  }

  public T get(int index) {
    try {
      return this.vector.get(index);
    } catch (IndexOutOfBoundsException e) {
      // System.out.println("\n" + e.getMessage());
    }
    return null;
  }
}