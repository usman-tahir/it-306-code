
public class GenericNode<E> implements Cloneable {
  private E data;
  private GenericNode<E> next;

  public GenericNode(E data, GenericNode<E> next) {
    this.data = data;
    this.next = next;
  }

  public E getData() {
    return this.data;
  }

  public GenericNode<E> getNext() {
    return this.next;
  }

  public void setData(E data) {
    this.data = data;
  }

  public void setNext(GenericNode<E> next) {
    this.next = next;
  }

  public boolean hasNext() {
    return this.next == null ? false : true;
  }

  public GenericNode<E> clone() {
    GenericNode<E> result;
    try {
      result = (GenericNode<E>)super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("This class does not implement Cloneable.");
    }
    return result;
  }
}