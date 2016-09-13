
public class SortingAlgorithms {
  public static void main(String[] args) {
    int[] unsorted = {12, 53, 66, 101, 1, 4, 54, 90, 109, 442, 13};
    printArray(unsorted);
    
    int[] insertionSortedList = insertionSort(unsorted);
    printArray(insertionSortedList);
  }

  /* Print out array elements */
  public static void printArray(int[] array) {
    for (int number : array) {
      System.out.printf(" %d", number);
    }
    System.out.println();
  }

  /* Insertion sort */
  public static int[] insertionSort(int[] array) {
    int arrayLength = array.length;
    int[] tempArray = array;
    int i;

    for (i = 0; i < arrayLength; i += 1) {
      int currentNumber = tempArray[i];
      int j = i;
      while (j > 0 && tempArray[j - 1] > currentNumber) {
        tempArray[j] = tempArray[j - 1];
        j--;
      }
      tempArray[j] = currentNumber;
    }
    return tempArray;
  }

}