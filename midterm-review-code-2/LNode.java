
public class LNode {

  private Integer data;
  private LNode link;

  public LNode(Integer data, LNode link) {
    this.data = data;
    this.link = link;
  }

  public LNode() {
    this.data = 0;
    this.link = null;
  }

  public Integer getData() {
    return this.data;
  }

  public LNode getNext() {
    return this.link;
  }

  public void setData(Integer data) {
    this.data = data;
  }

  public void setNext(LNode link) {
    this.link = link;
    // System.out.println(link);
  }

  public boolean hasNext() {
    if (this.link == null) {
      return false;
    }
    return true;
  }

}