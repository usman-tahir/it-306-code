
public class InsertionSort {
  public static void main(String[] args) {
    // Sample integer array from the example
    int[] numbers = {0, 15, 7, 27, 4, 5};

    // Print out the unsorted array
    System.out.println("Unsorted array: ");
    printArray(numbers);

    // Print out the sorted array
    System.out.println("Insertion sorted array: ");
    printArray(insertionSort(numbers));
  }
  // Insertion sort on an array of integers
  public static int[] insertionSort(int[] numbers) {
    int temp, previousIndex, index;
    int len = numbers.length;

    for (index = 1; index < len; index += 1) {
      temp = numbers[index];
      previousIndex = index - 1;
      while (previousIndex >= 0 && (numbers[previousIndex] > temp)) {
        numbers[previousIndex + 1] = numbers[previousIndex];
        previousIndex -= 1;
      }

      if (previousIndex >= 0 && numbers[previousIndex] > temp) {
        numbers[previousIndex + 1] = numbers[previousIndex];
        numbers[previousIndex + 1] = temp;
      } else {
        numbers[previousIndex + 1] = temp;
      }
    }
    return numbers;
  }

  // Print out the integer array
  public static void printArray(int[] numbers) {
    for (int n : numbers) {
      System.out.print(n + " ");
    }
    System.out.println("");
  }
}