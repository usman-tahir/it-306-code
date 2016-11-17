
import java.util.Comparator;

public class StudentComparator implements Comparator<Object> {
  public int compare(Object objectOne, Object objectTwo) {
    if (objectOne instanceof Student && objectTwo instanceof Student) {
      return (((Student)objectOne).getName().compareToIgnoreCase(((Student)objectTwo).getName()));
    }
    return -2;
  }
}