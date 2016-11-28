
import java.util.Scanner;

public class BinaryHeapTest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int size = -1;
    do {
      try {
        System.out.print("Enter the size of the Binary Heap: ");
        size = s.nextInt();
      } catch (Exception e) {
        System.out.println("Please enter a valid, numeric size.");
      }
    } while (size <= 0);

    BinaryHeap b = new BinaryHeap(size);
    String menu = "1. insert\n2. delete min\n3. check full\n4. check empty\n5. clear\n6. print heap\n7. quit";

    do {
      int choice = -1;
      try {
        System.out.println("Enter a choice from the menu:\n" + menu);
        choice = s.nextInt();

        switch (choice) {
          case 1:
            int elementToAdd = 0;
            do {
              try {
                System.out.print("Enter an integer element to add: ");
                elementToAdd = s.nextInt();
                b.insert(elementToAdd);
                break;
              } catch (Exception e) {
                System.out.println("Please enter a valid, numeric integer value to add.");
                elementToAdd = 0;
              }
            } while (true);
            break;
          case 2:
            try {
              System.out.println("Minumum element: " + b.deleteMin());
            } catch (Exception e) {
              System.out.println(e.getMessage());
            }
            break;
          case 3:
            System.out.println("Full Heap status: " + b.full());
            break;
          case 4:
            System.out.println("Empty Heap status: " + b.empty());
            break;
          case 5:
            b.clear();
            System.out.println("The Heap was cleared of all elements.");
            break;
          case 6:
            b.printBinaryHeap();
            break;
          case 7:
            System.out.println("Goodbye!");
            System.exit(0);
          default:
            System.out.println("Please enter a valid choice from the menu.");
            break;
        }
      } catch (Exception e) {
        System.out.println("Please enter a valid, numeric choice.");
      }
    } while (true);
  }
}