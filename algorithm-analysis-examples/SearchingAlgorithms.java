
public class SearchingAlgorithms {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Element exists in the array
    int existingElement = sequentialSearch(a, 0, 9, 5);

    // Element does not exist in the array
    int nonExistingElement = sequentialSearch(a, 0, 9, 11);
  }

  /*
    Sequentially looks through the array, given a lower bound (l) and
    upper bound (u), and the key (k) to look for. If they key is not
    found, it returns -1
  */
  public static int sequentialSearch(int[] a, int l, int u, int k) {
    for (int i = l; i <= u; i += 1) {
      if (a[i] == k) {
        System.out.println("Found k (" + k + ") at position " + i + "");
        return k;
      }
    }
    System.out.println("Could not find k (" + k + ")");
    return -1;
  }

}