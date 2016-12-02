
import java.util.*;

public class TransactionObjectTester {
  public static void main(String[] args) {
    // Create three initial stores, and store them in a Store[] array()
    Store fairfaxStore = new Store(1, "Shane Evans");
    Store sterlingStore = new Store(2, "Hank Jones");
    Store chantillyStore = new Store(3, "Usman Tahir");

    Store[] stores = {fairfaxStore, sterlingStore, chantillyStore};

    // Create sample members who can carry out transactions
    Member jakeS = new Member(1, "Jake Stone");
    Member sarahB = new Member(2, "Sarah Bales");
    Member usmanT = new Member(3, "Usman Tahir");

    Member[] members = {jakeS, sarahB, usmanT};

    // The HashMap object that stores the transaction details
    HashMap<Integer, TransactionObject> transactions = new HashMap<Integer, TransactionObject>();

    // Create 10 sample transactions
    int i;
    for (i = 1; i <= 10; i += 1) {
      transactions.put(i, new TransactionObject(getRandomMember(members).getMemberID(), getRandomStore(stores).getStoreID(), getRandomTransactionAmount()));
    }

    printTransactions(transactions);
  }
  public static Store getRandomStore(Store[] stores) {
    int random = new Random().nextInt(stores.length);
    return stores[random];
  }

  public static Member getRandomMember(Member[] members) {
    int random = new Random().nextInt(members.length);
    return members[random];
  }

  public static double getRandomTransactionAmount() {
    double min = 10.00;
    double max = 150.00;
    double random = new Random().nextDouble();
    double result = min + (random * (max - min));
    return result;
  }

  public static void printTransactions(HashMap<Integer, TransactionObject> transactions) {
    Set set = transactions.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      Map.Entry mapEntry = (Map.Entry)iterator.next();
      System.out.println("Transaction #" + mapEntry.getKey() + mapEntry.getValue().toString());
    }
  }
}