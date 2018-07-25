public class Card {
  public static enum Suits {
    HEARTS,
    DIAMONDS,
    SPADE,
    CLOVER
  };
  public static enum Cards {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
  };
  private Suits suit;
  private Cards card;

  public Card(Suits suit, Cards card) {
    this.suit = suit;
    this.card = card;
  }

  public Suits getSuit() {
    return this.suit;
  }

  public Cards getCard() {
    return this.card;
  }
}
