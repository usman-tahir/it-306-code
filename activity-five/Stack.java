/**
 * Phillip Ramirez
 * Usman Tahir
 * IT 306
 */


package Module_5.Activity_5;


public class Stack {

  private LNode top;

  public Stack() {
    this.top = null;
  }

  public boolean isEmpty() {
    return (this.top == null) ? true : false;
  }

  public void push(LNode node) {
    if (this.isEmpty()) {
      this.top = node;
      this.top.setNext(null);
    } else {
      node.setNext(this.top);
      this.top = node;
    }
  }

  public Character pop() {
    if (this.isEmpty()) {
      return null;
    } else {
      Character out = this.top.getData();
      LNode oldTop = this.top;
      top = top.getNext();
      oldTop.setNext(null);
      oldTop = null;
      return out;
    }
  }

}
