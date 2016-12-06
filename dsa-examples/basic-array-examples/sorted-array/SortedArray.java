
import java.util.Arrays;

public class SortedArray<T> {
  private T[] array;

  public SortedArray(T[] array) {
    this.array = array;
  }

  public T[] getArray() {
    return this.array;
  }

  public void sort() {
    Arrays.sort(this.array);
  }

  public String toString() {
    String output = "Unsorted array: ";
    int length = this.array.length;
    for (int i = 0; i < length; i += 1) {
      output += this.array[i] + " ";
    }
    output += "\nSorted array: ";
    this.sort();
    for (int j = 0; j < length; j += 1) {
      output += this.array[j] + " ";
    }
    return output + "\n";
  }
}