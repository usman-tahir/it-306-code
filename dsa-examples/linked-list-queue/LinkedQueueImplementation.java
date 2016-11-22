import java.util.*;

public class LinkedQueueImplementation {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    LinkedQueue l = new LinkedQueue();

    String menu = "1. insert\n2. remove\n3. peek\n4. check empty\n5. size\n6. quit\n";
    int choice = -1;
    do {
      System.out.print("Select a choice from the menu:\n" + menu);
      choice = keyboard.nextInt();

      switch (choice) {
        case 1:
          try {
            System.out.println("Enter an integer element to insert:");
            l.insert(keyboard.nextInt());
          } catch (Exception e) {
            System.out.println("There was an error during insertion.");
          }
          break;
        case 2:
          try {
            System.out.println("Removed element: " + l.remove().getData());
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          try {
            System.out.println("Peeked element: " + l.peek().getData());
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 4:
          System.out.println("Empty status: " + l.isEmpty());
          break;
        case 5:
          System.out.println("Size: " + l.getSize());
          break;
        case 6:
          System.out.println("Goodbye!");
          System.exit(0);
          // break;
        default:
          System.out.println("Invalid menu choice. Please try again.");
          break;
      }
      l.display();
    } while (choice != 6);
  }
}