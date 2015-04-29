import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;


public class War{
   
   private CardPile pile1, pile2, buffer1, buffer2;
   private CardIcon card1, card2;
   
   public War(){
      CardPile deck = new CardPile();
      deck.makePile();
      //ArrayList<Card> pile1Array = new ArrayList<Card>();
      //ArrayList<Card> pile2Array = new ArrayList<Card>();
      CardPile pile1 = new CardPile();
      CardPile pile2 = new CardPile();
      
      for(int i = 0; i < 26; i++){
         pile1Array.add(deck.draw());
      }
      for(int i = 0; i < 26; i++){
         pile2Array.add(deck.draw());
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
   
   //public void emptyBuffer(){
      
   //}

}