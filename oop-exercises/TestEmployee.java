
public class TestEmployee {

  public static void main(String[] args) {

    // Instantiate a new parameterized employee
    Employee employeeOne = new Employee(1, "John", "Doe", 2200);

    // Print out the employee's information
    System.out.println(employeeOne.toString());

    // Give the employee a raise
    employeeOne.setSalary(employeeOne.raiseSalary(10)); // Raise the current salary by 10%

    // Print out the new information after the raise
    System.out.println(employeeOne.toString());

  }

}