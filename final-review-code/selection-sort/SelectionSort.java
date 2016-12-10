
public class SelectionSort {
  public static void main(String[] args) {
    int[] numbers = {12, 54, 23, 76, 1, 43, -53};
    int[] sortedNumbers = selectionSort(numbers);
  }
  public static int[] selectionSort(int[] array) {
    int arrayLength = array.length;
    int[] tempArray = array;
    int numberOfSwaps = 0;
    int i;
    int j;

    for (i = 0; i < arrayLength - 1; i++) {
      int first = i;
      for (j = i + 1; j < arrayLength; j++) {
        if (tempArray[j] < tempArray[first]) {
          first = j;
        }
      }
      numberOfSwaps++;
      int temp = tempArray[first];
      array[first] = array[i];
      array[i] = temp;
    }
    System.out.println("array size: " + array.length + " number of swaps: " + numberOfSwaps);
    return tempArray;
  }
}