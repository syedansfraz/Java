package deckofcards3;
public class Card {
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace; // initialize face of card
        this.suit = cardSuit; // initialize suit of card
    }
    public String getFace() {
        return face;
    }
    public String getSuit() {
        return suit;
    }
    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }
}
