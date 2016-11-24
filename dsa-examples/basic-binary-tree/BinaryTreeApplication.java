
import java.util.Scanner;

public class BinaryTreeApplication {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    BinaryTree b = new BinaryTree();
    int choice = -1;

    do {
      try {
        System.out.println("\n1. insert\n2. search\n3. count nodes\n4. check empty\n5. quit");
        System.out.print("Enter a choice from the menu: ");
        choice = s.nextInt();
        switch (choice) {
          case 1:
            System.out.print("Enter an integer element to add: ");
            b.insert(s.nextInt());
            break;
          case 2:
            System.out.println("Enter an integer element to search: ");
            System.out.println("Search result: " + b.search(s.nextInt()));
            break;
          case 3:
            System.out.println("Nodes: " + b.count());
            break;
          case 4:
            System.out.println("Empty status: " + b.isEmpty());
            break;
          case 5:
            System.exit(0);
          default:
            System.out.println("Please enter a valid menu choice.");
            break;
        }
      } catch (Exception e) {
        System.out.println("Please enter a numeric menu value.");
        choice = -1;
      }
      System.out.print("\nPost order: ");
      b.postOrder();
      System.out.print("\nPre order: ");
      b.preOrder();
      System.out.print("\nIn order: ");
      b.inOrder();
    } while (true);
  }
}