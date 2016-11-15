
public class CardStack {
  private int top;
  private Card[] deck;

  public CardStack (int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("You must place at least one card in the deck.");
    }
    this.deck = new Card[capacity];
    this.top = -1;
  }

  public void push(Card card) {
    if (this.top == this.deck.length) {
      throw new StackException("This deck of cards is already full.");
    }
    this.top++;
    this.deck[this.top] = card;
  }

  public Card peek() {
    if (this.top == -1) {
      throw new StackException("This deck is empty.");
    }
    return this.deck[this.top];
  }

  public void pop() {
    if (this.top == -1) {
      throw new StackException("This deck is empty.");
    }
    this.top--;
  }

  public boolean isEmpty() {
    return this.top == -1;
  }

  public class StackException extends RuntimeException {
    public StackException(String message) {
      super(message);
    }
  }
}