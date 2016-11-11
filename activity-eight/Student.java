
public class Student {
  public final static int MAX = 100;
  public final static String[] COURSE_LIST = {"IT106", "IT206", "IT306", "IT212", "IT213", "IT214", "COMM100", "MATH112", "IT293"};
  public final static String LIST = "IT106,IT206,IT306,IT212,IT213,IT214,COMM100,MATH112,IT293";

  private String name;
  private String address;
  private String major;
  private double[] courseGrades;
  private String[] courses;
  private int id;
  private int numCourses;
  private static int totalStudents;

  public Student() {
    this.courseGrades = new double[MAX];
    this.courses = new String[MAX];
    this.numCourses = 0;
    totalStudents++;
    this.id = totalStudents;
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

  public static int getTotalStudents() {
    return totalStudents;
  }

  public int getNumCourses() {
    return this.numCourses;
  }

  public int getId() {
    return this.id;
  }

  public double getGrade(String course) {
    for (int i = 0; i < COURSE_LIST.length; i++) {
      if (COURSE_LIST[i].equalsIgnoreCase(course)) {
        double grade = this.courseGrades[i];
        return grade;
      }
    }
    return -1;
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
    if (this.numCourses >= MAX) {
      return false;
    }
    for (int i = 0; i < COURSE_LIST.length; i++) {
      if (COURSE_LIST[i].equalsIgnoreCase(course)) {
        this.courseGrades[this.numCourses] = grade;
        this.courses[this.numCourses++] = course;
        return true;
      }
    }
    return false;
  }
}