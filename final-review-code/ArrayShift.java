
public class ArrayShift {
  public static void main(String[] args) {
    int[] data = new int[100];
    int i;

    // Fill the array with sample values
    for (i = 0; i < data.length; i += 1) {
      data[i] = (i + 1);
    }
    printArray(data); // Currently holds the data 1 to 100
    getValueAtIndex(50, data);

    System.out.println();

    for (i = 50; i < 98; i += 1) {
      int next = data[i + 1];
      data[i] = next;
    }
    data[50] = 42;

    printArray(data);
    getValueAtIndex(50, data);
    getValueAtIndex(51, data);
  }
  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void getValueAtIndex(int index, int[] array) {
    if (index >= array.length) {
      System.out.println("Index out of bounds.");
    } else {
      System.out.println("Value at index " + index + ": " + array[index] + "\n");
    }
  }
}