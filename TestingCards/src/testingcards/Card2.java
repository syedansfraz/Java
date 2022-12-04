/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingcards;

/**
 *
 * @author ans shah55
 */
public class Card2 {
     private String face;
    private String suit;
     public Card2(String face, String suit)
    {
       this.setFace(face);
       this.setSuit(suit);
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
