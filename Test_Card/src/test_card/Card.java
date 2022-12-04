package test_card;
public class Card {
     private String face;
    private String suit;
    public Card(String f, String s)
    {
       this.setFace(f);
       this.setSuit(s);
    }
    public String toString()
    {
        return String.format("%s of %s", this.getFace(),this.getSuit());
    }
    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

public void setSuit(String suit) {
        this.suit = suit;
}

}
