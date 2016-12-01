
public class MinHeapTester {
  public static void main(String[] args) {
    System.out.println("Current Min Heap: ");
    MinHeap m = new MinHeap(15);

    // Add elements to the Min Heap (statically)
    m.insert(5);
    m.insert(3);
    m.insert(17);
    m.insert(10);
    m.insert(84);
    m.insert(19);
    m.insert(6);
    m.insert(22);
    m.insert(9);
    m.minHeap();
    m.printMinHeap();

    System.out.println("The minimum value is: " + m.remove());
  }
}