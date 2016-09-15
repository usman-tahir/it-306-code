
import java.util.ArrayList;

public class SortingAlgorithms {
  public static void main(String[] args) {
    int[] unsorted = {12, 53, 66, 101, 1, 4, 54, 90, 109, 442, 13};
    printArray(unsorted);

    int[] insertionSortedList = insertionSort(unsorted);
    // printArray(insertionSortedList);

    int[] selectionSortedList = selectionSort(unsorted);
    printArray(selectionSortedList);

    ArrayList<Double> gpaList = new ArrayList<Double>();
    gpaList.add(3.44);
    gpaList.add(3.10);
    gpaList.add(1.22);
    printArrayList(gpaList);
    insertionSort(gpaList);
    printArrayList(gpaList);

  }

  /* Print out ArrayList elements */
  public static void printArrayList(ArrayList<?> arrayList) {
    int i;
    for (i = 0; i < arrayList.size(); i += 1) {
      System.out.println(arrayList.get(i));
    }
  }

  /* Print out array elements */
  public static void printArray(int[] array) {
    for (int number : array) {
      System.out.printf(" %d", number);
    }
    System.out.println();
  }

  public static void printArray(double[] array) {
    for (double number : array) {
      System.out.printf(" %f", number);
    }
    System.out.println();
  }

  /* Insertion sort (int) */
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

  /* Insertion sort (double) */
  public static void insertionSort(ArrayList<Double> list) {
    double temp;
        int previousIndex;

        for (int index = 1; index < list.size(); index++) {
            temp = list.get(index);
            previousIndex = index - 1;
            while (previousIndex >= 0 && (list.get(previousIndex) > temp)) {
                list.set((previousIndex + 1), list.get(previousIndex));
                previousIndex -= 1;
            }
            if (previousIndex >= 0 && list.get(previousIndex) > temp) {
                list.set((previousIndex + 1), list.get(previousIndex));
                list.set((previousIndex + 1), temp);
            } else {
                list.set((previousIndex + 1), temp);
            }
        }
  }

  public static int[] selectionSort(int[] array) {
    int arrayLength = array.length;
    int[] tempArray = array;
    int i;
    int j;

    for (i = 0; i < arrayLength - 1; i++) {
      int first = i;
      for (j = i + 1; j < arrayLength; j++) {
        if (tempArray[j] < tempArray[first]) {
          first = j;
        }
      }
      int temp = tempArray[first];
      array[first] = array[i];
      array[i] = temp;
    }
    return tempArray;
  }

}