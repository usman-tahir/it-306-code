
public class PQEntry {
  private long key;
  private Flight val;
  public static final long DEFAULT_KEY = 1000000; // Indicates a very low priority

  public Flight getValue() {
    return this.val;
  }

  public void setValue(Flight p) {
    this.val = p;
    this.calcKey();
  }

  public long getKey() {
    return this.key;
  }

  private void calcKey() {
    // TODO
    System.out.println("To be implemented");
  }

  public String toString() {
    return "Value: " + this.getValue().toString() + ", Key: " + this.getKey();
  }
}