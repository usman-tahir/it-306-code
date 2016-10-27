
public class BinaryMinHeapTest {
  public static void main(String[] args) {
    BinaryMinHeap binaryMinHeap = new BinaryMinHeap(10); // Initial size of 10
    // binaryMinHeap.insert(10);

    // Random assortment of ints
    int[] numbers = {23, 21, 12, -9, 199, 981, 105, -23, -43, 10};

    for (int i = 0; i < 10; i += 1) {
      binaryMinHeap.insert(numbers[i]);
    }
    printBinaryHeap(binaryMinHeap);

  }
  public static void printBinaryHeap(BinaryMinHeap binaryMinHep) {
    int[] data = binaryMinHep.getData();
    for (int d : data) {
      System.out.println(d);
    }
  }
}