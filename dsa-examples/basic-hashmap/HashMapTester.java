
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapTester {
  public static void main(String[] args) {
    // Basic HashMap declaration (example usage: items in a catalog)
    HashMap<Integer, String> itemsCatalog = new HashMap<Integer, String>();

    /* Add elements to the HashMap catalog */
    int[] itemIds = {1, 2, 3, 4, 5};
    String[] itemNames = {"hammer", "chisel", "spade", "knife", "needle"};
    itemsCatalog = addItemsToCatalog(itemIds, itemNames);
    System.out.println(getItemCatalogPrintout(itemsCatalog));
  }
  public static HashMap<Integer,String> addItemsToCatalog(int[] itemIDs, String[] itemNames) {
    int length = itemIDs.length;
    HashMap<Integer, String> itemsCatalog = new HashMap<Integer, String>();
    if (length != itemNames.length) {
      System.out.println("The item ID list and item name list lengths do not match up.");
      return new HashMap<Integer, String>();
    } else {
      int i;
      for (i = 0; i < length; i += 1) {
        itemsCatalog.put(itemIDs[i], itemNames[i]);
      }
    }
    return itemsCatalog;
  }

  public static String getItemCatalogPrintout(HashMap<Integer, String> itemsCatalog) {
    String output = "--- List of items with IDs ---\n";
    Set set = itemsCatalog.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      Map.Entry mapEntry = (Map.Entry)iterator.next();
      String tempItem = "ID: " + mapEntry.getKey() + " Item: " + mapEntry.getValue();
      output += tempItem + "\n";
    }
    return output;
  }
}