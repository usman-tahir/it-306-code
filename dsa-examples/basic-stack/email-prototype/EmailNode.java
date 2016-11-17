
public class EmailNode {
  private Email data;
  private EmailNode next;

  public EmailNode() {
    this.data = null;
    this.next = null;
  }

  public EmailNode(Email data, EmailNode next) {
    this.data = data;
    this.next = next;
  }

  public Email getData() {
    return this.data;
  }

  public EmailNode getNext() {
    return this.next;
  }

  public void setData(Email data) {
    this.data = data;
  }

  public void setNext(EmailNode next) {
    this.next = next;
  }

  public boolean hasNext() {
    if (this.next == null) {
      return false;
    } else {
      return true;
    }
  }
}