import java.util.*;

public class UnsortedPriorityQueue{
  private LinkedList<PQEntry> queue;

  public UnsortedPriorityQueue() {
    this.queue = new LinkedList<PQEntry>();
  }

  public void add(Flight p) {
    PQEntry entry = new PQEntry();
    entry.setValue(p);
    this.queue.add(entry);
  }

  public PQEntry removeMin() {
    if (this.queue.isEmpty()) {
      System.out.println("The queue is empty.");
      return null;
    } else {
      int min = 0;
      for (int i = 1; i < this.queue.size(); i += 1) {
        if (this.queue.get(min).getKey() > this.queue.get(i).getKey()) {
          min = 1;
        } else if (this.queue.get(min).getKey() == this.queue.get(i).getKey()) {
          if (min > i) {
            min = i;
          }
        }
      }
      PQEntry minEntry = queue.get(min);
      this.queue.remove(min);
      return minEntry;
    }
  }

  public boolean isEmpty() {
    return this.queue.isEmpty();
  }

  public int size() {
    return queue.size();
  }
}