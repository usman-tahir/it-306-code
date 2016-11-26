
public class Pair<T, S> {
  T first;
  S second;

  public Pair(T u1, S u2) {
    this.first = u1;
    this.second = u2;
  }

  public T getFirst() {
    return this.first;
  }

  public S getSecond() {
    return this.second;
  }
}