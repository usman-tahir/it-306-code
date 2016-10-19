
public class Student {
  private String name;
  private String id;
  private String email;
  private int age;
  private double gpa;

  // Default constructor
  public Student() {
    this.name = "";
    this.id = "";
    this.email = "";
    this.age = 0;
    this.gpa = 0.0;
  }

  // Parameterized constructor
  public Student(String name, String id, String email, int age, double gpa) {
    this.name = name;
    this.id = id;
    this.email = email;
    this.age = age;
    this.gpa = gpa;
  }

  // Get and Set methods
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getGPA() {
    return this.gpa;
  }

  public void setGPA(double gpa) {
    this.gpa = gpa;
  }

  // To-string methods
  public String toString() {
    String output = "--- Student Information ---\n";
    output += "ID: " + this.getId() + "\nName: " + this.getName() + "\nEmail: " + this.getEmail();
    output += "\nAge: " + this.getAge() + "\nGPA: " + this.getGPA();
    return output;
  }

}