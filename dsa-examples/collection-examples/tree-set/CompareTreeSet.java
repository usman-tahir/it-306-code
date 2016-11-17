
import java.util.Comparator;

public class CompareTreeSet implements Comparator<String> {
  public int compare(String objectOne, String objectTwo) {
    if (objectOne.compareToIgnoreCase(objectTwo) == 0) {
      return 0;
    } else if (objectOne.compareToIgnoreCase(objectTwo) < 0) {
      return 1;
    } else {
      return -1;
    }
  }
}