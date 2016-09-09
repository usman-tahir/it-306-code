
public class SearchingAlgorithms {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println("--- Linear / Sequential Search ---");

    // Element exists in the array
    int sequentialExisting = sequentialSearch(a, 0, 9, 5);

    // Element does not exist in the array
    int sequentialNonExisting = sequentialSearch(a, 0, 9, 11);

    System.out.println("--- Binary Search ---");

    // use int[] a
    // Element exists in the array
    int binaryExisting = binarySearch(a, 0, 9, 3);

    // Element does not exist in the array
    int binaryNonExisting = binarySearch(a, 0, 9, 11);

    System.out.println("--- Insertion Sort --- ");
    char[] c = {'a', 'd', 'c', 'b'};
    insertionSort(c);
  }

  /*
    Sequentially looks through the array, given a lower bound (l) and
    upper bound (u), and the key (k) to look for. If they key is not
    found, it returns -1

    Complexity: O(n)
  */
  public static int sequentialSearch(int[] a, int l, int u, int k) {
    for (int i = l; i <= u; i += 1) {
      if (a[i] == k) {
        System.out.println("Found k (" + k + ") at position " + i + "");
        return k;
      }
    }
    System.out.println("Could not find k (" + k + ")\n");
    return -1;
  }

  /*
    Splits the list into two parts to search each one after the other,
    given the key (k) to find. The lower bound (l) and upper bound (u)
    are split down the middle and searched, making each searched
    portion smaller until the key is found. If the key is not found, it
    returns -1

    Complexity: O(log(n)) 
  */
  public static int binarySearch(int[] a, int l, int u, int k) {
    do {
      int m = (l + u) / 2;
      System.out.printf("l = %d, m = %d, u = %d\n", l, m, u);
      if (k < a[m]) {
        u = m - l;
        System.out.println("a[m] (" + a[m] + ") was greater than k (" + k + "), setting u to " + u + "");
      } else if (k > a[m]) {
        System.out.println("a[m] (" + a[m] + ") was less than k (" + k + "), setting l to " + l + "");
        l = m + l;
      } else {
        System.out.println("Found k (" + k + ") at position " + m);
        return m;
      }

      if (l > u) {
        System.out.println("Could not find k (" + k + ")\n");
        return -1;
      }
    } while (true);
  }

  public static void insertionSort(char[] c) {
    int l = c.length;
    for (int i = 0; i < l; i++) {
      System.out.print("first line of for-loop: c = ");
      System.out.println(c);
      char cur = c[i];
      int j = i;
      while (j > 0 && c[j - 1] > cur) {
        System.out.print("first line of while-loop: c = ");
        System.out.println(c);
        c[j] = c[j - 1];
        j--;
        System.out.print("last line of while-loop: c = ");
        System.out.println(c);
      }
      c[j] = cur;
      System.out.print("last line of for-loop: c = ");
      System.out.println(c);
    }
  }

}