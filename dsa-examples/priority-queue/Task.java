
public class Task {
  private String job;
  private int priority;

  public Task() {
    this.job = "";
    this.priority = 0;
  }

  public Task(String job, int priority) {
    this.job = job;
    this.priority = priority;
  }

  public String getJob() {
    return this.job;
  }

  public int getPriority() {
    return this.priority;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public String toString() {
    return "Job name: " + this.job + ", Priority: " + this.priority + "\n";
  }
}