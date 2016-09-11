
public class WrapperDemo {
  public static void main(String[] args) {
    MemoryCell m = new MemoryCell();

    m.write(new Integer(37));

    // Use the Integer wrapper to wrap the value from MemoryCell
    Integer wrapperVal = (Integer)m.read();

    // Use the access method from the Integer wrapper (intValue())
    int val = wrapperVal.intValue();
    System.out.println("Contents are " + val);
  }
}