
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
  }

  public boolean hasNext() {
    if (this.link == null) {
      return false;
    }
    return true;
  }

  public String toString() {
    String output = "":
    output += "This node has an Integer value of " + this.data;
    if (this.hasNext()) {
      output += " and a pointer to the next LNode, which is " + this.getNext().toString();
    }
    return output;
  }

}