
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Map.Entry;
public class UniversityApplication {
  public static void main(String[] args) {
    Map<Integer, Student> studentRecords = new HashMap<Integer, Student>();
    String menu = "1. Add a new student\n2. Display a student's information\n3. Exit";
    int option = 0;
    int id = 1;

    do {
      try {
        option = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (option) {
          case 1:
            Student s = addStudent();
            studentRecords.put(s.getId(), s);
            break;
          case 2:
            retrieveStudent(1, studentRecords);
            break;
          case 3:
            System.exit(0);
          default:
            JOptionPane.showMessageDialog(null, "Please enter a choice from the menu.");
            break;
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a choice from the menu.");
      }
    } while (true);

  }
  public static void retrieveStudent(int id, Map<Integer, Student> all){
    Iterator i = all.entrySet().iterator();
    while (i.hasNext()) {
      System.out.println(((Entry<Integer, Student>)i.next()).getValue().toString() + "\n");
    }
  }  
  public static Student addStudent() {
    Student s = new Student();
    s.setName(getName());
    s.setAddress(getAddress());
    s.setMajor(getMajor());
    do {
      getCourseAndGrade(s);
    } while (JOptionPane.showConfirmDialog(null, "Would you like to enter a course and grade for this student?") == JOptionPane.YES_OPTION);
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
      major = JOptionPane.showInputDialog("Please enter a major for this student");
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
    } while (!s.setCourse(grade, course));
  }

  private static boolean isEmpty(String string) {
    if (string.equals("")) {
      return true;
    }
    return false;
  }
}