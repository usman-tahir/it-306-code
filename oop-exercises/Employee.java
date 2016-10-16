
public class Employee {

  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  // Parameterized constructor (accepts an id, first name, last name, and salary)
  public Employee(int id, String firstName, String lastName, int salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary; // Per month basis
  }

  /**
   * Get and Set methods
   */
   public int getId() {
     return this.id;
   }

   public void setId(int id) {
     this.id = id;
   }

   public String getFirstName() {
     return this.firstName;
   }

   public void setFirstName(String firstName) {
     this.firstName = firstName;
   }

   public String getLastName() {
     return this.lastName;
   }

   public void setLastName(String lastName) {
     this.lastName = lastName;
   }

   public String getName() {
     return this.getFirstName() + " " + this.getLastName();
   }

   public int getSalary() {
     return this.salary;
   }

   public void setSalary(int salary) {
     this.salary = salary;
   }

   // Annual salary is equal to the salary multiplied by number of months
   public int getAnnualSalary() {
     return (this.getSalary() * 12);
   }

   /**
    * Raise the salary of an employee by a set amount. This only returns a value,
    * and must be used in conjunction with a set method (setSalary()), in order to
    * be effective. This raise only applies to the base salary (not the annual salary)
    * and must be used as such (the change filters into the annual salary)
    */
   public int raiseSalary(int percent) {
     int currentSalary;
     double raiseAmount; 
     currentSalary = this.getSalary();
     raiseAmount = currentSalary * ((double) percent / 100);
     return ((int) (currentSalary + raiseAmount));
   }

   public String toString() {
     String output = "Employee Information\n";
     output += "ID: " + this.getId() + "\nName: " + this.getName() + "\nSalary: $" + this.getSalary() + "\nAnnual Salary: " + this.getAnnualSalary() + "\n";
     return output;
   }

}