
public class Student {
  private String name;
  private String major;

  public Student(String name, String major) {
    this.name = name;
    this.major = major;
  }

  public String getName() {
    return this.name;
  }

  public String getMajor() {
    return this.major;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String toString() {
    return "\nName: " + this.name + "\nMajor: " + this.major;
  }
}