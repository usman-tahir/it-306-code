
public class GenericBox<E> {
  private E content;

  public GenericBox(E content) {
    this.content = content;
  }

  public E getContent() {
    return this.content;
  }

  public void setContent(E content) {
    this.content = content;
  }

  public String toString() {
    return this.content + " ('" + content.getClass() + "')\n";
  }
}