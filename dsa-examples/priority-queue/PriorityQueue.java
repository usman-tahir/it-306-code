
public class PriorityQueue {
  private Task[] listOfJobs;
  private int size, capacity;

  public PriorityQueue(int capacity) {
    this.capacity = capacity + 1;
    this.listOfJobs = new Task[this.capacity];
    this.size = 0;
  }

  public Task[] getListOfJobs() {
    return this.listOfJobs;
  }

  public int getSize() {
    return this.size;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void insert(String job, int priority) {
    Task newJob = new Task(job, priority);
    this.listOfJobs[++this.size] = newJob;
    int position = this.size;
    while (position != 1 && newJob.getPriority() > this.listOfJobs[position / 2].getPriority()) {
      this.listOfJobs[position] = this.listOfJobs[position / 2];
      position /= 2;
    }
    this.listOfJobs[position] = newJob;
    System.out.println("inserted the task " + job + " with priority " + priority + " at index " + position);
  }

  public void clear() {
    this.listOfJobs = new Task[this.capacity];
    this.size = 0;
  }

  public Task remove() {
    int parent, child;
    Task item, temp;
    if (this.isEmpty()) {
      System.out.println("This heap is empty.");
      return null;
    } else {
      item = this.listOfJobs[1];
      temp = this.listOfJobs[this.size--];

      parent = 1;
      child = 2;
      while (child <= this.size) {
        if (child < this.size && this.listOfJobs[child].getPriority() < this.listOfJobs[child + 1].getPriority()) {
          child += 1;
        }
        if (temp.getPriority() >= this.listOfJobs[child].getPriority()) {
          break;
        }
        this.listOfJobs[parent] = this.listOfJobs[child];
        parent = child;
        child *= 2;
      }
    }
    this.listOfJobs[parent] = temp;
    return item;
  }

  public boolean isEmpty() {
    return (this.size == 0) ? (true) : (false);
  }

  public boolean isFull() {
    return (this.size == this.capacity - 1) ? (true) : (false);
  }
}