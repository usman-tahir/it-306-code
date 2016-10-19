
public class StudentNodeTest {
  public static void main(String[] args) {
    // Make two student objects
    Student studentOne = new Student("John Doe", "0000001", "jdoe@email.com", 22, 4.0);
    Student studentTwo = new Student("Usman Tahir", "0000002", "utahir@email.com", 22, 3.5);

    // Create the nodes and link the two students
    StudentNode s1 = new StudentNode(studentOne, null);
    StudentNode s2 = new StudentNode(studentTwo, null);
    s1.setLink(s2);
    System.out.println(s1.getStudentData());

  }
}