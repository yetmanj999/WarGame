package Code;

public class Deck extends GroupOfCards {
    
    public void createDeck() {
        for (Suits s : Suits.values()) {
            for (Faces f : Faces.values()) {
                cards.add(new Card(s,f));
            }
        }
    }
}
