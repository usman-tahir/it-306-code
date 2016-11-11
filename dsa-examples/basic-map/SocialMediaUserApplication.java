import java.util.*;
import java.util.Map.Entry;
import javax.swing.JOptionPane;

public class SocialMediaUserApplication {
  public static void main(String[] args) {
    Map<String, User> all = new Hashtable<String, User>();
    User newUser = null;

    while (JOptionPane.showConfirmDialog(null, "Add another user?") == JOptionPane.YES_OPTION) {
      newUser = getInput();
      all.put(newUser.getUsername(), newUser);
    }
    System.out.println("Printing the content of the map:");
    displayAll(all);

    System.out.println("Removing (specific) content from the map:");
    remove(all);
    displayAll(all);
  }

  public static User getInput() {
    User user = new User(JOptionPane.showInputDialog("Enter a username:"));
    String phoneNumber = "";
    do {
      phoneNumber = JOptionPane.showInputDialog("Enter a 10-digit phone number (no spaces):");
    } while (!user.setPhoneNumber(phoneNumber));
    return user;
  }

  public static void displayAll(Map<String, User> all) {
    Iterator i = all.entrySet().iterator();
    while (i.hasNext()) {
      System.out.println(((Entry<String, User>)i.next()).getValue().toString() + "\n");
    }
  }

  public static void remove(Map<String, User> all) {
    String key = JOptionPane.showInputDialog("Enter a username to remove:");
    if (all.containsKey(key)) {
      all.remove(key);
      System.out.println("The user '" + key + "' has been removed.");
    } else {
      System.out.println("The user '" + key + "' was not removed (does not exist).");
    }
  }
}