
public abstract class Person {
  private String name;
  
  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract String display();
}