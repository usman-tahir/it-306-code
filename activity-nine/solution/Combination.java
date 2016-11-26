
import java.util.*;

public class Combination {
  public static <T, S> Vector<Pair<T, S>> getPermutation(Vector<T> v1, Vector<S> v2) {
    if (v1.isEmpty() || v2.isEmpty()) {
      return null;
    }
    Vector<Pair<T, S>> permutations = new Vector<Pair<T, S>>();
    int maximum = Math.max(v1.size(), v2.size());
    int minimum = Math.min(v1.size(), v2.size());

    int i, j;
    for (i = 0; i < maximum; i += 1) {
      for (j = 0; j < minimum; j += 1) {
        Pair<T, S> p = new Pair<T, S>(v1.get(i), v2.get(j));
        permutations.add(p);
      }
    }
    System.out.println(permutations.size() + " permutations have been created.");
    return permutations;
  }

  public static <T, S> String display(Vector<Pair<T, S>> vectorPairs) {
    String output = "";
    Iterator<Pair<T, S>> iterator = vectorPairs.iterator();
    while (iterator.hasNext()) {
      Pair<T, S> cursor = ((Pair<T, S>)iterator.next());
      output += "<" + cursor.getFirst() + ", " + cursor.getSecond() + ">\n";
    }
    return output;
  }
}