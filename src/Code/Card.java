/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package Code;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 */
public abstract class Card 
{   
    public enum Suits {hearts,spades,diamonds,clubs};
    public enum Faces {ace,two,three,four,five,six,seven,eight,nine,ten,jack,king,queen,joker};
    private Faces face;
    private Suits suit;
 
    public Card() {
    
    }
 
 //Using Card.java as a reference
    public Card(Suits s, Faces f) {
        suit = s;
        face = f;
    }
 
    public Faces getFace() {
        return face;
    }
 
    public void setFace(Faces face) {
        this.face = face;
    }
 
    public Suits getSuit() {
        return suit;
    }
 
    public void setSuit(Suits suit) {
        this.suit = suit;
    }
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}
