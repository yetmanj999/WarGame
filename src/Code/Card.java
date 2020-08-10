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
public class Card
{
    
//    
//    public enum Suits {hearts,spades,diamonds,clubs};
//    public enum Faces {ace,two,three,four,five,six,seven,eight,nine,ten,jack,king,queen,joker};
//    private Faces face;
//    private Suits suit;
// 
//    public Card() {
//    
//    }
// 
// //Using Card.java as a reference
//    public Card(Suits s, Faces f) {
//        suit = s;
//        face = f;
//    }
// 
//    public Faces getFace() {
//        return face;
//    }
// 
//    public void setFace(Faces face) {
//        this.face = face;
//    }
// 
//    public Suits getSuit() {
//        return suit;
//    }
// 
//    public void setSuit(Suits suit) {
//        this.suit = suit;
//    }
//    
     
    // End of previous version 
    
    
    
    private int face; //initialize the rank (2,3,4...King, Ace)
    private int suit; //initialize the suit (spades, hearts...)
    
    //constructor
    public Card(int suit, int rank){
        this.face = rank;
        this.suit = suit;
    }//end construcor
    
    //getter method
    public int getCard(){
        return face; 
    }//end getCard
    
    //setter method
    public void setCard(int rank){
        this.face = rank;
    }//end setCard
    
    
    
    
     @Override
    public String toString(){
    //combine rank and suit together into a single string(ex: Ace of Diamonds)

        //suing StringBuilder for modifiability later on
        StringBuilder displayCard = new StringBuilder();
        
        //personal choice to use switch
        switch(face){
            //since rank is int type, now match int 11 to String jack...14 to Ace
            case 11:
                displayCard.append("Jack");
                break;
            case 12:
                displayCard.append("Queen");
                break;
            case 13:
                displayCard.append("King");
                break;
            case 14:
                displayCard.append("Ace");
                break;    
            default:
                displayCard.append(face); //number from 2 to 10 does not need to modify
                break;
        }//end rank switch
        
        displayCard.append(" of "); //setting the format of the output
        
        switch(suit){
            case 0:
                displayCard.append("Spades");
                break;
            case 1:
                displayCard.append("Hearts");
                break;
            case 2:
                displayCard.append("Clubs");
                break;
            case 3:
                displayCard.append("Diamonds");
                break;
            default: //anything else, do nothing
                break;
        }//end suit switch
        
        //return the result of an entire cmombined string
        return displayCard.toString();
    }//end toString
    
    
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
}// End of class Card
