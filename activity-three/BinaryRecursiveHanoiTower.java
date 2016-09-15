
import java.util.Stack;

public class BinaryRecursiveHanoiTower {
  public static void main(String[] args) {
    Stack<Integer> source = new Stack<Integer>();
    Stack<Integer> destination = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    Stack<Integer> sourceCopy = new Stack<Integer>();

    for (int i = d; i >= 1; i -= 1) {
      source.add(i);
    }

    sourceCopy = (Stack<Integer>) source.clone();

    System.out.println("Source:");
    while (!sourceCopy.isEmpty()) {
      System.out.println(sourceCopy.pop());
    }
    System.out.println("Destination:");
    if (!destination.isEmpty()) {
      while (!destination.isEmpty()) {
        System.out.println(destination.pop());
      }
    } else {
      System.out.println("Destination is empty.");
    }

    hanoi(4, source, temp, destination);
    System.out.println("\n\n");

    System.out.println("Source: ");
    if (!sourceCopy.isEmpty()) {
      while (!sourceCopy.isEmpty()) {
        System.out.println(sourceCopy.pop());
      }
    } else {
      System.out.println("Source is empty.")
    }
  }
}