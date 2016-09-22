
import javax.swing.JOptionPane;

/*
*   For Activity4, implement an insertion sort to sort a linked list.   
*   For testing, use input 4 1 3 0, the output should be 0 1 3 4
*/

public class NodeTester {
    public static void main(String[] args) {

        int option = 0, newVal;

        // Assumption: The beginning of the list does not carry specific
        // data
        Node unsortedList = new Node(0, null);
        Node beg = unsortedList;

        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog("" + "To add press 1\nTo sort press 2\nEnter 3 to exit"));
                switch (option) {
                    case 1:
                        newVal = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer to add"));
                        unsortedList = addToList(newVal, unsortedList);
                        break;
                    case 2:
                        // Printing the unsorted list
                        if (print(beg).equals("")) {
                            JOptionPane.showMessageDialog(null, "There are no elements to sort or print.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Unsorted list: " + print(beg));
                            // In-place sort list
                            bubbleSort(unsortedList, beg);
                            JOptionPane.showMessageDialog(null, "Sorted list (Bubble Sort): " + print(beg));

                            /* TODO: insertionSort(unsortedList, beg) */
                            insertionSort(unsortedList, beg);
                            JOptionPane.showMessageDialog(null, "Sorted list (Insertion Sort): " + print(beg));
                        }
                        
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Please enter a valid number (1 - 3).");
                        break;
                }
            } catch (Exception e) {
                // Invalid/non-numeric input
                JOptionPane.showMessageDialog(null, "Please enter numeric input.");
            }
            
        } while (option != 3);

    }

    // Adds a link to the end of the linked list
    // @param val
    // @param list
    public static Node addToList(int val, Node list) {
        list.setNext(new Node(val, null));
        list = list.getNext();
        return list;
    }

    // Prints the entire list starting from the beginning
    // @param list
    public static String print(Node beg) {
        Node current = beg.getNext();
        String output = "";

        if (current == null) {
            return ""; // No links in the linked list
        }

        while (current != null) { // While there are still links
            output += current.getVal() + ", ";
            current = current.getNext();
        }
        // Remove the last comma for formatting purposes
        return output.substring(0, output.length() - 2);
    }

    public static Node bubbleSort(Node list, Node beg) {
        int size = list.getSize();
        Node current, next;
        
        // The list is empty
        if (size == 0) {
            return null;
        }

        // The list has one element
        if (size == 1) {
            return list;
        }

        for (int i = 0; i <= size; i += 1) {
            // Get the 'next two' elements and compare them
            current = beg.getNext();
            next = current.getNext();

            do {
                if (current.getVal() > next.getVal()) {
                    // Swap operation
                    int temp = current.getVal(); // Set the temporary value for the current link's next node
                    current.setVal(next.getVal()); // Set the current node's value to the next node's value
                    next.setVal(temp); // Set the next node's value to the current node's value, essentially swapping them
                }
                current = next;
                next = current.getNext();
            } while (current.hasNext());
        }
        return list;
    }

    public static Node insertionSort(Node list, Node beg){
        int length = list.getSize();
        Node current = beg.getNext();

        if (length == 0) {
            return null;
        }

        if (length == 1) {
            return list;
        }

        for (int i = 1; i < length - 1; i += 1) {
            int k = i;
            Node nextElement = current.getNext();
            while(k > 0 && nextElement.getVal() < current.getVal()) {
                int temp = nextElement.getVal(); 
                nextElement.setVal(current.getVal()); 
                current.setVal(temp); 
                k -= 1;
            }
        }
        return list;
    }


}