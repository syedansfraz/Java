package deckofcards3;
import deckofcards3.DeckOfCards4.CardCombination;
public class DeckofCards3 {
    public static void main(String[] args) {
        // TODO code application logic here
        DeckOfCards4 myDeckOfCards = new DeckOfCards4();
        myDeckOfCards.shuffle(); // place Cards in random order
        Card[] hand = new Card[5];
        CardCombination checkFor = CardCombination.NOTHING;
        while (checkFor != CardCombination.FULL_HOUSE && checkFor != CardCombination.STRAIGHT) {
            // Deal a poker hand till we find Fullhouse or Straigh or Flush
            for (int i = 0; i < 5; i++) {
                // deal and display a Card
                hand[i] = myDeckOfCards.dealCard();
                System.out.printf("%-19s", hand[i]);
            }
            CardCombination combination = myDeckOfCards.checkHand(hand);
            System.out.println(combination);
            checkFor = combination;
            myDeckOfCards.shuffle();
        }
    }
}
