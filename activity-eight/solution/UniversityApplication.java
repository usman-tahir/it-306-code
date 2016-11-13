
import java.util.*;
import javax.swing.JOptionPane;

public class UniversityApplication {
  public static void main(String[] args) {
    Map<String, Student> studentRecords = new HashMap<String, Student>();
    String menu = "1. Add a new student\n2. Display a student's information\n3. Exit";
    int option = 0;
    int id = 1;

  }
  public static Student addStudent() {
    Student s = new Student();

    return s;
  }

  public static String getName() {
    String name = "";
    do {
      name = JOptionPane.showInputDialog("Please enter a name for this student");
      if (isEmpty(name)) {
        JOptionPane.showMessageDialog(null, "Please enter a non-blank name.");
      }
    } while (isEmpty(name));
    return name;
  }

  public static String getAddress() {
    String address = "";
    do {
      address = JOptionPane.showInputDialog("Please enter an address for this student");
      if (isEmpty(address)) {
        JOptionPane.showMessageDialog(null, "Please enter a non-blank address.");
      }
    } while (isEmpty(address));
    return address;
  }

  public static String getMajor() {
    String major = "";
    do {
      major = JOptionPane.showInputDialog("Please enter an address for this student");
      if (isEmpty(major)) {
        JOptionPane.showMessageDialog(null, "Please enter a non-blank address.");
      }
    } while (isEmpty(major));
    return major;
  }

  public static void getCourseAndGrade(Student s) {
    String course = "";
    double grade = -1.00;
    do {
      course = JOptionPane.showInputDialog("Enter the course name\nExisting courses:" + Student.LIST.toString());
      try {
        grade = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for this course"));
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a positive, numeric grade.");
      }
      if (!s.setCourse(grade, course)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid course (from the list) and grade (greater than or equal to 0.00).");
      }
    } while (!s.setCourse(grade, course));
  }

  private static boolean isEmpty(String string) {
    if (string.equals("")) {
      return true;
    }
    return false;
  }
}