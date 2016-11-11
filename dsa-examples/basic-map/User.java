
public class User {
  private String username;
  private int userID;
  private String phoneNumber;
  private static int total;

  public User(String username) {
    this.username = username;
    total++;
    this.userID = total;
  }

  public String getUsername() {
    return this.username;
  }

  public int getUserID() {
    return this.userID;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public static int getTotal() {
    return total;
  }

  public boolean setUsername(String username) {
    if (username.length() == 0) {
      return false;
    }
    this.username = username;
    return true;
  }

  public boolean setPhoneNumber(String phoneNumber) {
    if (phoneNumber.length() != 10) {
      return false;
    }
    for (int i = 0; i < phoneNumber.length(); i += 1) {
      if (!Character.isDigit(phoneNumber.charAt(i))) {
        return false;
      }
    }
    this.phoneNumber = phoneNumber;
    return true;
  }

  public String toString() {
    return "Username: " + this.username + "\nUser ID: " + this.userID + "\nPhone number: " + this.phoneNumber;
  }
}