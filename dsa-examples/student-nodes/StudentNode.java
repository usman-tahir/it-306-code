
public class StudentNode {
  private Student studentData;
  private StudentNode link;

  // Default Constructor
  public StudentNode() {
    this.studentData = new Student();
    this.link = null;
  }

  // Parameterized Constructor
  public StudentNode(Student studentData, StudentNode link) {
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

  public void setLink(StudentNode link) {
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