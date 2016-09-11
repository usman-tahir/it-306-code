
public class BoxingDemo {
  public static void main(String[] args) {
    // Integer value which replaces <AnyType>
    GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();

    m.write(37);
    int val = m.read();
    System.out.println("Contents are " + val);

    // String value which replaces <AnyType>
    GenericMemoryCell<String> n = new GenericMemoryCell<String>();

    n.write("Hello World!");
    String val_s = n.read();
    System.out.println("Contents are " + val_s);
  }
}