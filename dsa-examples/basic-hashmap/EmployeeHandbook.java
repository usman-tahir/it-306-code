
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class EmployeeHandbook {
  public static void main(String[] args) {
    HashMap<Integer, Employee> employeeHandbook = createEmployeeHandbook("./data.csv");
    String menu = "1. Look up employee by ID\n2. Quit";
    int option = -1;
    do {
      try {
        option = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (option) {
          case 1:
            try {
              int employeeID = Integer.parseInt(JOptionPane.showInputDialog("Please enter an Employee ID to look up."));
              if (employeeID > 20 || employeeID < 1) {
                JOptionPane.showMessageDialog(null, "Please enter an ID in the range (1, 20) inclusive.");
              } else {
                JOptionPane.showMessageDialog(null, employeeHandbook.get(employeeID).toString());
              }
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Please enter a valid, numeric Employee ID.");
            }
            break;
          case 2:
            JOptionPane.showMessageDialog(null, "Goodbye!");
            break;
          default:
            JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            break;
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid numeric menu choice.");
      }
    } while (option != 2);
  }

  public static HashMap<Integer, Employee> createEmployeeHandbook(String filepath) {
    BufferedReader b = null;
    String line = "";
    String splitBy = ",";
    HashMap<Integer, Employee> employeeHandbook = new HashMap<Integer, Employee>();

    try {
      b = new BufferedReader(new FileReader(filepath));
      while ((line = b.readLine()) != null) {
        String[] employee = line.split(splitBy);

        int employeeID = Integer.parseInt(employee[0]);
        String firstName = employee[1];
        String lastName = employee[2];
        String department = employee[3];

        Employee e = new Employee(employeeID, firstName, lastName, department);
        employeeHandbook.put(e.getEmployeeID(), e);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (b != null) {
        try {
          b.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return employeeHandbook;
  }
}