
import javax.swing.JOptionPane;

public class PriorityQueueImplementation {
  public static void main(String[] args) {
    String menu = "\n1. Insert a job\n2. Remove a job\n3. Check empty status\n4. Check full status\n5. Check size\n6. Display all\n7. Quit\n";
    int choice = -1;
    PriorityQueue p = new PriorityQueue(setPriorityQueueSize());
    do {
      choice = getMenuChoice(menu);
      switch (choice) {
        case 1:
          String jobTitle = getJobTitle();
          int jobPriority = getJobPriority();
          p.insert(jobTitle, jobPriority);
          break;
        case 2:
          removeJob(p);
          break;
        case 3:
          emptyStatus(p);
          break;
        case 4:
          fullStatus(p);
          break;
        case 5:
          getSize(p);
          break;
        case 6:
          displayAll(p);
          break;
        case 7:
          JOptionPane.showMessageDialog(null, "Goodbye");
          System.exit(0);
        default:
          JOptionPane.showMessageDialog(null, "Please enter a valid menu choice.");
          break;
      }
    } while (true);
  }
  public static int getMenuChoice(String menu) {
    int choice = -1;
    do {
      try {
        choice = Integer.parseInt(JOptionPane.showInputDialog("Please enter a choice from the menu:" + menu));
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a numeric value");
      }
    } while (choice < 1);
    return choice;
  }

  public static int setPriorityQueueSize() {
    int size = -1;
    do {
      try {
        size = Integer.parseInt(JOptionPane.showInputDialog("Please enter a size for this Priority Queue"));
        if (size <= 0) {
          JOptionPane.showMessageDialog(null, "Please enter a non-zero, positive size");
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a numeric value for the size");
      }
    } while (size <= 0);
    return size;
  }

  public static String getJobTitle() {
    String jobTitle = "";
    do {
      jobTitle = JOptionPane.showInputDialog("Enter a job title");
    } while (jobTitle.equals(""));
    return jobTitle;
  }

  public static int getJobPriority() {
    int jobPriority = -1;
    do {
      try {
        jobPriority = Integer.parseInt(JOptionPane.showInputDialog("Enter a priority for this job"));
        if (jobPriority < 0) {
          JOptionPane.showMessageDialog(null, "Please enter a non-negative priority value");
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid, numeric job priority");
      }
    } while (jobPriority < 0);
    return jobPriority;
  }

  public static void removeJob(PriorityQueue p) {
    JOptionPane.showMessageDialog(null, "Job removed: " + p.remove());
  }

  public static void emptyStatus(PriorityQueue p) {
    JOptionPane.showMessageDialog(null, "The Priority Queue " + (p.isEmpty() ? ("is empty") : ("is not empty")));
  }

  public static void fullStatus(PriorityQueue p) {
    JOptionPane.showMessageDialog(null, "The Priority Queue " + ((p.isFull()) ? ("is full") : ("is not full")));
  }

  public static void getSize(PriorityQueue p) {
    JOptionPane.showMessageDialog(null, "This Priority Queue has a size of " + p.getSize());
  }

  public static void displayAll(PriorityQueue p) {
    String output = "--- List of Jobs ---\n";
    Task[] jobs = p.getListOfJobs();
    int size = p.getSize();
    int i;

    for (i = 0; i < size; i += 1) {
      System.out.println("Looking in index " + i);
      output += jobs[i].toString();
    }
    JOptionPane.showMessageDialog(null, output);
  }
}