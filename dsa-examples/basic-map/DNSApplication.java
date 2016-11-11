import java.util.*;

public class DNSApplication {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<String, String>();
    map.put("www.wiley.com", "208.215.179.146");
    map.put("http://localhost", "127.0.0.1");
    map.put("www.google.com", "64.233.160.0");
    map.put("www.google.com", "64.233.160.0");

    System.out.println("Printing entry set:");
    Iterator i = null;
    if (!map.isEmpty()) {
      i = map.entrySet().iterator();
      while (i.hasNext()) {
        System.out.println(i.next());
      }
      System.out.println("\n\nPrinting key set:");
      i = map.keySet().iterator();
      while (i.hasNext()) {
        System.out.println(i.next());
      }
    }
  }
}