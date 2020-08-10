package Code;

import java.util.ArrayList;
import java.util.List;

public class War {

    private Deck deck;
    private Stack playerStack;
    private Stack pcStack;
                   //creating war cards
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();

  public  void play() {
    
        
         System.out.println("War"); 
                
                //creating war cards
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();
                
                //checking do players have enough (4)cards to stay in game
                for(int x=0; x<3; x++){ 
                    //either one player runs out of card is game over
                    if(playerStack.size() == 0 || pcStack.size() == 0 ){                      
                        break;
                    }//end if
                    
                    System.out.println("War card for player1 is xx\nWar card for pc is xx");

                    
                     drawThreeCard();
                            
//                    war1.add(playerStack.pop());  //place additional card for war
//                    war2.add(pcStack.pop());    
//                    
                    
                }//end for loop 
                
                //only compare result when both players have enough cards for war
                if(war1.size() == 3 && war2.size() == 3 ){
                    //display the war cards from each player
                    System.out.println("War card for player1 is " + war1.get(0).toString());
                    System.out.println("War card for pc is " + war2.get(0).toString());
                    
                    //if player 1 wins the war round
                    if(war1.get(2).getCard() > war2.get(2).getCard()){
                        playerStack.addAll(war1); //player1 get all 10 cards
                        playerStack.addAll(war2);
                        System.out.println("Player 1 wins the war round");
                    }//end if
                    //otherwise pc wins the war round
                    else{
                        pcStack.addAll(war1); //pc get all 10 cards
                        pcStack.addAll(war2);
                        System.out.println("Player 2 wins the war round");
                    }//end else
                }//end if
        
        
        
    }

    /**
     * 
     * @param card1
     * @param card2
     * @param card3
     */
    public void drawThreeCard() {
      
   
                   war1.add(playerStack.pop());  //place additional card for war
                    war2.add(pcStack.pop());   
        
                    
    }

}
