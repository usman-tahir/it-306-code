
public class LNode {
  
  Character data;
  LNode link;

  public LNode(Character data, LNode link) {
    this.data = data;
    this.link = link;
  }

  public Character getData() {
    return this.data;
  }

  public LNode getNext() {
    return this.link;
  }

  public void setNext(LNode link) {
    this.link = link;
  }

  public void setData(Character data) {
    this.data = data;
  }

  public boolean hasNext() {
    if (this.link == null) {
      return false;
    } else {
      return true;
    }
  }

}