package Code;
/*
 * @authors: Jake Yetman, Joshua Santos, Kolade Siyanbola, Muhammad Hassan Asif
 * Date: 8/11/2020
 * Description: Program creates deck by extending GroupOfCards
*/ 
public class Deck extends GroupOfCards {
    
    public void createDeck() {
        for (Suits s : Suits.values()) {
            for (Faces f : Faces.values()) {
                cards.add(new Card(s,f));
            }
        }
    }
}
