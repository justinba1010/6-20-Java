import java.util.*;

public class Deck {
  private ArrayList<Card> deck;
  private ArrayList<Card> dealt;
  private Random randomgenerator;
  public Deck() {
    //First we're going to loop through all the card permtations
    for(Card.Suits suit : Card.Suits.values()) {
      for(Card.Cards card : Card.Cards.values()) {
        this.deck.add(new Card(suit, card));
      }//Cards loop
    }//Suits loop
  }//Deck Constructor

  public void shuffle() {
    this.deck.addAll(this.dealt);
    this.dealt.clear();
    this.insideShuffle(this.deck);
  }//shuffle

  public int cardsLeft() {
    return this.deck.size();
  }//cardsLeft

  public boolean isEmpty() {
    return this.cardsLeft() == 0;
  }//isEmpty

  public Card deal() {
    Card c = this.deck.get(0);
    this.deck.remove(0);
    this.dealt.add(c);
    return c;
  }//deal

  private void insideShuffle(ArrayList<Card> deck) {
    //Our Algorithm for shuffling cards
  }
}//Deck class
