
import java.util.Date;

public class Email {
  private String receiver;
  private String sender;
  private String content;
  private Date date;

  public Email() {
    this.receiver = "";
    this.sender = "";
    this.content = "";
    this.date = new Date();
  }

  public Email(String receiver, String sender, String content) {
    this.sender = sender;
    this.receiver = receiver;
    this.content = content;
    this.date = new Date();
  }

  public String getReceiver() {
    return this.receiver;
  }

  public String getSender() {
    return this.sender;
  }

  public String getContent() {
    return this.content;
  }

  public String getDate() {
    return this.date.toString();
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String toString() {
    String output = "\n" + this.getDate() + "\nTo: " + this.getReceiver() + "\nFrom" + this.getSender();
    output += "\n\n" + this.getContent();
    return output;
  }
}