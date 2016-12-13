
import java.util.*;
public class Names {
  public static void main(String[] args) {
    String[] names = {"Mary", "Donna", "Nina", "Mary", "Lisa"};
    Set<String> collection = new TreeSet<String>();
    for (String name : names) {
      collection.add(name);
    }

    Iterator<String> iter = collection.iterator();
    while(iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
    System.out.println();
  }
}