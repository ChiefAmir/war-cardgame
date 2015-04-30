import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;


public class War{
   
   private CardPile pile1, pile2, buffer1, buffer2;
   private CardIcon card1, card2;
   private int bufferCounter;
   
   public War(){
      CardPile deck = new CardPile();
      deck.makePile();
      //ArrayList<Card> pile1Array = new ArrayList<Card>();
      //ArrayList<Card> pile2Array = new ArrayList<Card>();
      pile1 = new CardPile();
      pile2 = new CardPile();
      buffer1 = new CardPile();
      buffer2 = new CardPile();
      bufferCounter = 1;
      
      for(int i = 0; i < 26; i++){
         pile1.add(deck.draw());
      }
      for(int i = 0; i < 26; i++){
         pile2.add(deck.draw());
      }
      
      //CardPile pile1 = new CardPile(pile1Array.toArray(new CardIcon [pile1Array.size()]));
      //CardPile pile2 = new CardPile(pile2Array.toArray(new CardIcon [pile2Array.size()]));
      
      
      //card1 = new CardIcon();
      //card2 = new CardIcon();
      
   }

   
   public int pile1Size(){
      return pile1.size();
   }
   
   public int pile2Size(){
      return pile2.size();
   }
   
   public void draw(){
      if (pile1.size() != 0 && pile2.size() != 0){
         card1 = pile1.draw();
         card2 = pile2.draw();
         buffer1.add(card1);
         buffer2.add(card2);
      }
   }
   
   public ImageIcon getCard1Icon(){
      return card1.getIcon();
   }
   
   public ImageIcon getCard2Icon(){
      return card2.getIcon();
   }
   
   public int result(){
      return card1.compare(card2);
      // 2 is greater, 1 is equal, 0 is lesser

   }
   
   public String emptyBuffer(){
      if (result() == 2 || (result() == 1 && pile2.size() == 0)){
         for (int i = 0; i > bufferCounter; i++){
            pile1.add(buffer1.draw());
            pile1.add(buffer2.draw());
         }
         bufferCounter = 1;
         return "Player 1 Wins the hand";
      }
      else if (result() == 0 || (result() == 1 && pile1.size() == 0)){
         for (int i = 0; i > bufferCounter; i++){
            pile2.add(buffer2.draw());
            pile2.add(buffer1.draw());
         }
         bufferCounter = 1;
         return "Player 2 Wins the hand";
      }
      // On a draw
      else {
         bufferCounter++;
         return "Tie";
      }
      
   }

}