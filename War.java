import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class War {
   
   private CardPile pile1, pile2;
   private CardIcon card1, card2;
   
   public War(){
      CardPile deck = new CardPile();
      ArrayList<Card> pile1Array = new ArrayList<Card>();
      ArrayList<Card> pile2Array = new ArrayList<Card>();
      for(int i = 0; i < 26; i++){
         pile1Array.add(deck.draw());
      }
      for(int i = 0; i < 26; i++){
         pile2Array.add(deck.draw());
      }
      
      CardPile pile1 = new CardPile(pile1Array.toArray(new Card[pile1Array.size()]));
      CardPile pile2 = new CardPile(pile2Array.toArray(new Card[pile2Array.size()]));
      
   }

   
   public int pile1Size(){
      return pile1.size();
   }
   
   public int pile2Size(){
      return pile2.size();
   }
   
   

}