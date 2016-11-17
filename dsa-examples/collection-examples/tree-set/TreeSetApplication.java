
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetApplication {
  public static void main(String[] args) {
    Set<Integer> collection = new TreeSet<Integer>();
    collection.add(10);
    collection.add(5);
    collection.add(2);
    collection.add(8);

    Iterator<Integer> iter = collection.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}