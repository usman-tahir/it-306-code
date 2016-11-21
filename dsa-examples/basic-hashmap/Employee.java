
public class Employee {
  private int employeeID;
  private String firstName;
  private String lastName;
  private String department;

  public Employee(int employeeID, String firstName, String lastName, String department) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
  }

  public int getEmployeeID() {
    return this.employeeID;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String toString() {
    String output = "\nEmployee ID: " + this.employeeID + "\nFirst name: " + this.firstName;
    output += "\nLast name: " + this.lastName + "\nDepartment: " + this.department + "\n";
    return output;
  }
}