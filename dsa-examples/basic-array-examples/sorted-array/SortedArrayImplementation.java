
import java.util.*;

public class SortedArrayImplementation {
  public static void main(String[] args) {

    // Example with an integer array
    Integer[] integers = {34, 53, 12, 32, 100, -23, 139, -45, -199};
    SortedArray sortedIntegers = new SortedArray(integers);
    System.out.println(sortedIntegers.toString());

    // Example with a double array
    Double[] doubles = {-3.45, 43.2, 100.30, -90.32, 102.32, 4.86, 9.45, 1.09};
    SortedArray sortedDoubles = new SortedArray(doubles);
    System.out.println(sortedDoubles.toString());

    // Example with a string array
    String[] strings = {"banana", "pineapple", "orange", "apple", "pineapples", "strawberry", "strawberries", ""};
    SortedArray sortedStrings = new SortedArray(strings);
    System.out.println(sortedStrings.toString());
  }
}