
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class EmployeeHandbook {
  public static void main(String[] args) {
    HashMap<Integer, Employee> employeeHandbook = createEmployeeHandbook("./data.csv");
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