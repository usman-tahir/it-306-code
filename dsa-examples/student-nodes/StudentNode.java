
public class Student {
  private Student studentData;
  private Node link;

  // Default Constructor
  public Node() {
    this.studentData = new Student();
    this.link = null;
  }

  // Parameterized Constructor
  public Node(Student studentData, Node link) {
    this.studentData = studentData;
    this.link = link;
  }

  // Get and Set methods
  public Student getStudent() {
    return this.studentData;
  }

  public void setStudent(Student studentData) {
    this.studentData = studentData;
  }

  public StudentNode getLink() {
    return this.link;
  }

  public void setLink(StudentData link) {
    this.link = link;
  }

  public boolean hasNext() {
    if (this.link == null) {
      return false;
    }
    return true;
  }

  public String getStudentData() {
    return this.studentData.toString();
  }

}