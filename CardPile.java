import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 * @author Shayan Amir-Kabirian
 */
public class CardPile{
   
	// Create pile queue and pile arrayList
   private Queue pile;
   private ArrayList<Card> pileArray;
   
   /**
    * Constructor
    * Creates a queue and an arrayList
    */
   public CardPile(){
      pile = new Queue();
      pileArray = new ArrayList<Card>();    
   }
   
   /**
    * Copy Constructor
    * @param otherPile CardPile to be copied into this one
    */
   public CardPile(CardPile otherPile){
      Queue temp = new Queue();
      pile = new Queue();
      while(otherPile.isEmpty() != true){
    	  // Move files over via a temporary queue
         temp.enqueue(otherPile.draw());
         pile.enqueue(temp.dequeue());
      }
   
   }
   
   /**
    * Alternate Constructor that takes an array of cards and puts all of them into the queue
    * @param pileArray Array of Cards
    */
   public CardPile(Card [] pileArray){
      pile = new Queue();
      for(Card card : pileArray){
         pile.enqueue(card);
      }  
      
   }

   
   /**
    * Adds 52 cards to the pile and shuffles them
    */
   public void makePile(){
      Random rand = new Random();
    
      for(int s = 1; s < 5; s++){
         for(int r = 2; r < 15; r++){
            Card card = new CardIcon(s, r);
            pileArray.add(card);
         }
      }
      
      long seed = System.nanoTime();
      Collections.shuffle(pileArray, new Random(seed));
      
      for(int i = 0; i < pileArray.size(); i++){
         pile.enqueue(pileArray.get(i));
      }
      pileArray = null;
   }
   
   /**
    * Draw a card
    * @return CardIcon object
    */
   public CardIcon draw(){
      return(CardIcon)pile.dequeue();
   }
   
   /**
    * Add a card to the pile
    * @param card Card object to be added to Queue
    */
   public void add(Card card){
      pile.enqueue(card);
   }
   
   /** 
    * Empty the pile
    */
   public void empty(){
      pile.dequeueAll();
   }
   
   /**
    * Get size of pile
    * @return int of pile size
    */
   public int size(){
      return(pile.size());
   }
   
   /**
    * Check is pile is empty
    * @return boolean of file emptyness
    */
   public boolean isEmpty(){
      return(pile.size() == 0);
   }
    


}