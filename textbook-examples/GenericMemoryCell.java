
public class GenericMemoryCell<AnyType> {
  private AnyType storedValue;
  
  public AnyType read() {
    return this.storedValue;
  }

  public void write(AnyType x) {
    this.storedValue = x;
  }
}