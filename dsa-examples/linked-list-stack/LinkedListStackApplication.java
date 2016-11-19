
public class LinkedListStackApplication {
  public static void main(String[] args) {
    LinkedListStack list = populateLinkedListStack();
    displayLinkedListStack(list);

  }
  public static LinkedListStack populateLinkedListStack() {
    LinkedListStack list = new LinkedListStack();

    // Initialize a list of 10 numbers and add them as Nodes
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int length = data.length;
    int i;

    for (i = 0; i < length; i += 1) {
      list.push(data[i]);
    }
    return list;
  }

  public static void displayLinkedListStack(LinkedListStack list) {
    while (list.getCount() > 0) {
      System.out.println(list.pop().getData());
    }
  }
}