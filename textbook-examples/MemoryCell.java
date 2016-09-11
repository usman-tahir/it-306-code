// MemoryCell class
// Object read() returns the stored value
// void write(Object x) stores x

public class MemoryCell {
  private Object storedValue;
  
  public Object read() {
    return this.storedValue;
  }

  public void write(Object x) {
    this.storedValue = x;
  }
}