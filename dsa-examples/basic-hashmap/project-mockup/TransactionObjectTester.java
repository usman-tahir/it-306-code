
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

    // printTransactions(transactions);
    processTransactions(transactions, stores, members);

    for (Store s : stores) {
      System.out.println(s.toString());
    }
    System.out.println("The store with the most sales was: " + getStoreWithHighestTransactions(stores).toString());

    for (Member m : members) {
      System.out.println(m.toString());
    }
    
    System.out.println("The member who spent the most was: " + getMemberWithHighestAmountSpent(members).toString());
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

  public static int getIndexedStoreFromTransaction(TransactionObject t, Store[] s) {
    int storeID = t.getStoreID();
    int i;
    for (i = 0; i < s.length; i += 1) {
      if (s[i].getStoreID() == storeID) {
        return i;
      }
    }
    return -1;
  }

  public static int getIndexedMemberFromTransaction(TransactionObject t, Member[] m) {
    int memberID = t.getMemberID();
    int i;
    for (i = 0; i < m.length; i += 1) {
      if (m[i].getMemberID() == memberID) {
        return i;
      }
    }
    return -1;
  }

  public static Member[] updateMember(TransactionObject t, Member[] m) {
    double amount = t.getAmountSpent();
    int index = getIndexedMemberFromTransaction(t, m);
    m[index].setAmountSpent(m[index].getAmountSpent() + amount);
    return m;
  }

  public static Store[] updateStore(TransactionObject t, Store[] s) {
    double amount = t.getAmountSpent();
    int index = getIndexedStoreFromTransaction(t, s);
    s[index].setTotalTransactionAmount(s[index].getTotalTransactionAmount() + amount);
    return s;
  }

  public static void processTransactions(HashMap<Integer, TransactionObject> t, Store[] s, Member[] m) {
    Set set = t.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      Map.Entry mapEntry = (Map.Entry)iterator.next();
      TransactionObject o = (TransactionObject)mapEntry.getValue();
      updateMember(o, m);
      updateStore(o, s);
    }
  }

  public static Store getStoreWithHighestTransactions(Store[] s) {
    int index;
    int highestIndex = 0;
    for (index = 0; index < s.length; index += 1) {
      if (s[index].getTotalTransactionAmount() >= s[highestIndex].getTotalTransactionAmount()) {
        highestIndex = index;
      }
    }
    return s[highestIndex];
  }

  public static Member getMemberWithHighestAmountSpent(Member[] m) {
    int index;
    int highestIndex = 0;
    for (index = 0; index < m.length; index += 1) {
      if (m[index].getAmountSpent() >= m[highestIndex].getAmountSpent()) {
        highestIndex = index;
      }
    }
    return m[highestIndex];
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