
import java.util.*;
import javax.swing.JOptionPane;

public class CompareStudents {
  public static void main(String[] args) {
    Set<Person> people = new TreeSet<Person>(new StudentComparator());
    String menu = "1. Add a student\n2. Display a student's info\n3. Exit";
    int option = -1;

    while (true) {
      try {
        option = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (option) {
          case 1:
            do {
              people.add(getStudent());
            } while (JOptionPane.showConfirmDialog(null, "Do you wish to add a student?") == JOptionPane.YES_OPTION);
            break;
          case 2:
            displayAll(people);
            break;
          case 3:
            JOptionPane.showMessageDialog(null, "Goodbye!");
            System.exit(0);
            break;
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid, numeric choice from the menu.");
      }
    }
  }
  public static Person getStudent() {
    String name = "", major = "";
    do {
      name = JOptionPane.showInputDialog("Please enter the student's name:");
      major = JOptionPane.showInputDialog("Please enter the student's major:");
      String output = "";
      if (name.equals("")) {
        output += "Please enter a valid, non empty name";
      }
      if (major.equals("")) {
        output += " and major.";
      }

      if (!output.equals("")) {
        JOptionPane.showMessageDialog(null, output);
      }
    } while (name.equals("") || major.equals(""));
    return new Student(name, major);
  }

  public static void displayAll(Set<Person> all) {
    Iterator iter = all.iterator();
    String output = "";
    if (!all.isEmpty()) {
      while (iter.hasNext()) {
        output += (((Person)iter.next()).display() + "\n");
      }
      JOptionPane.showMessageDialog(null, output);
    } else {
      JOptionPane.showMessageDialog(null, "The set of Students is empty.");
    }
  }
}