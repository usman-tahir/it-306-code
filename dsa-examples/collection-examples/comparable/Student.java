
public class Student extends Person implements Comparable<Object> {
  private String major;

  public Student(String name, String major) {
    super(name);
    this.major = major;
  }

  public String getMajor() {
    return this.major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String toString() {
    return "\nName: " + this.getName() + "\nMajor: " + this.getMajor();
  }

  public int compareTo(Object o) {
    if (!(o instanceof Student)) {
      return -2;
    } else {
      Student studentObject = (Student)o;
      return this.getName().compareToIgnoreCase(studentObject.getName());
    }
  }

  @Override
  public String display() {
    return this.toString();
  }
}