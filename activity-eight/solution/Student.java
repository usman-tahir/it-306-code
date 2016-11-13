
public class Student {
  public final static int MAX = 100;
  public final static String[] COURSE_LIST = {"IT 106", "IT 206", "IT 306", "IT 212", "IT 213", "IT 214", "COMM 100", "MATH 112", "IT 293"};
  public final static String LIST = "IT 106, IT 206, IT 306, IT 212, IT 213, IT 214, COMM 100, MATH 112, IT 293";

  private static int totalStudents;

  private String name;
  private String address;
  private String major;
  private double[] courseGrades;
  private String[] courses;
  private int id;
  private int numberOfCourses;

  public Student() {
    this.name = "";
    this.address = "";
    this.major = "";
    this.courseGrades = new double[MAX];
    this.courses = new String[MAX];
    this.numberOfCourses = 0;
    this.id = ++totalStudents;
  }

  public static int getTotalStudents() {
    return totalStudents;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public String getMajor() {
    return this.major;
  }

  public double getGrade(String course) {
    for (int i = 0; i < this.courses.length; i += 1) {
      if (this.courses[i].equalsIgnoreCase(course)) {
        double grade = this.courseGrades[i];
        return grade;
      }
    }
    return -1;
  }

  public int getId() {
    return this.id;
  }

  public int getNumberOfCourses() {
    return this.numberOfCourses;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public boolean setCourse(double grade, String course) {
    if (this.numberOfCourses >= MAX) {
      return false;
    }

    for (int i = 0; i < COURSE_LIST.length; i += 1) {
      if (COURSE_LIST[i].equalsIgnoreCase(course) && grade >= 0.00) {
        this.courseGrades[this.numberOfCourses] = grade;
        this.courses[this.numberOfCourses] = course;
        this.numberOfCourses += 1;
        return true;
      }
    }
    return false;
  }

  public String toString() {
    String output = "--- Student Information ---\n";
    output += "ID: " + this.getId() + "\nName: " + this.getName() + "\nAddress: " + this.getAddress();
    output += "\nMajor: " + this.getMajor() + "\nThis student is currently taking " + this.getNumberOfCourses() + " courses:\n";
    for (int i = 0; i < this.numberOfCourses; i += 1) {
      output += this.courses[i] + " (Grade: " + this.courseGrades[i] + ")\n";
    }
    return output;
  }
}