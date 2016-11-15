import java.util.Collections;
import java.util.ArrayList;

public class Deck {
  public static void main(String[] args) {
    ArrayList<Card> deckOfCards = populateDeckOfCards();
    Collections.shuffle(deckOfCards);
    CardStack stackOfCards = populateCardStack(deckOfCards);
    printCardStack(stackOfCards);
  }

  public static ArrayList<Card> populateDeckOfCards() {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    ArrayList<Card> deckOfCards = new ArrayList<Card>(52);
    int i, j;
    int k = 0;
    for (i = 0; i < suits.length; i += 1) {
      for (j = 0; j < values.length; j += 1) {
        Card c = new Card(suits[i], values[j]);
        deckOfCards.add(k++, c);
      }
    }
    return deckOfCards;
  }

  public static CardStack populateCardStack(ArrayList<Card> deckOfCards) {
    CardStack stackOfCards = new CardStack(52);
    int i;
    int length = deckOfCards.size();
    for (i = 0; i < length; i += 1) {
      stackOfCards.push(deckOfCards.get(i));
    }
    return stackOfCards;
  }

  public static void printCardStack(CardStack c) {
    if (c.isEmpty()) {
      System.out.println("There are no cards in the deck.");
    } else {
      System.out.println("This deck has the following cards:");
      while (!c.isEmpty()) {
        System.out.println(c.peek());
        c.pop();
      }
    }
  }
}