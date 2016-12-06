
import java.util.*;

public class VectorImplementation {
  public static void main(String[] args) {
    int size, number, value;

    size = getNumericInput("Enter the initial size of the vector: ");
    Vector<Integer> vector = new Vector<Integer>(size);

    number = getNumericInput("Enter the number of elements: ");
    int index;

    for (index = 0; index < number; index += 1) {
      value = getNumericInput("Enter value #" + (index + 1) + ": ");
      vector.store(index, value);
    }
    printVector(vector);

  }
  public static Scanner keyboard = new Scanner(System.in);

  public static int getNumericInput(String prompt) {
    int numericInput = -1;;
    do {
      try {
        System.out.print(prompt);
        numericInput = keyboard.nextInt();
        break;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } while (true);
    return numericInput;
  }

  public static void printVector(Vector vector) {
    int index;
    System.out.print("The vector contains the following elements: ");
    for (index = 0; index < vector.getSize(); index += 1) {
      System.out.print(vector.get(index) + " ");
    }
    System.out.println();
  }
}