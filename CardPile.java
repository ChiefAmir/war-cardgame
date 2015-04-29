import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class CardPile{
   
   private Queue pile;
   private ArrayList<Card> pileArray;
   
   public CardPile(){
      pile = new Queue();
      pileArray = new ArrayList<Card>();
      this.makePile();
      
   }
   
   public CardPile(CardPile otherPile){

      Queue temp = new Queue();
      while(otherPile.isEmpty() != true){
         temp.enqueue(otherPile.draw());
         pile.enqueue(temp.dequeue());
      }
   
   }
   
   
   public CardPile(ArrayList<Card> newPileArray){
      for(int i = 0; i < newPileArray.size(); i++){
         pile.enqueue(newPileArray.get(i));
      }  
   }

   
   
   public void makePile(){
      Random rand = new Random();
    
      for(int s = 1; s < 5; s++){
         for(int r = 2; r < 15; r++){
            Card card = new Card(s, r);
            pileArray.add(card);
         }
      }
      
      long seed = System.nanoTime();
      Collections.shuffle(pileArray, new Random(seed));
      
      for(int i = 0; i < pileArray.size(); i++){
         pile.enqueue(pileArray.get(i));
      }
      
   }
   
   
   public Card draw(){
      pileArray.remove(pile.peek());
      return(Card)pile.dequeue();
   }
   
   public void peek(){
      pile.peek();
   }
   
   public void add(Card card){
      pile.enqueue(card);
      pileArray.add(card);
   }
   
   public void empty(){
   }
   
   
   public boolean isEmpty(){
      //return(pile.size() == 0);
      return true;
   }
    


}