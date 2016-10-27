
public class BinaryMinHeapTest {
  public static void main(String[] args) {
    BinaryMinHeap binaryMinHeap = new BinaryMinHeap(5); // Initial size of 5
    
    // Insert the numbers 1-5 into the binary min heap
    for (int i = 1; i < 6; i += 1) {
      binaryMinHeap.insert(i);
    }

    printBinaryHeap(binaryMinHeap);

    // Remove the min element (currently -43)
    binaryMinHeap.removeMin();
    System.out.println("After removing the minimum:");
    printBinaryHeap(binaryMinHeap);

  }
  public static void printBinaryHeap(BinaryMinHeap binaryMinHep) {
    int[] data = binaryMinHep.getData();
    for (int d : data) {
      System.out.println(d);
    }
  }
}