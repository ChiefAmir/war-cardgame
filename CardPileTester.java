import java.util.ArrayList;

/**
 * @author Shayan Amir-Kabirian
 */
public class CardPileTester {

   //THIS IS ALL OBSOLETE

    public static void main(String [] args) {

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
      

      System.out.println(pile1.size());
      System.out.println(pile2.size());


   
//    
//    CardPile pile1 = new CardPile(pile1Array);
//    CardPile pile2 = new CardPile(pile2Array);
//    
//   
//    
//     for (int i = 0; i < 26; i++){
//       System.out.println(pile1.draw());
//    }
//    
//     for (int i = 0; i < 26; i++){
//       System.out.println(pile2.draw());
//    }

}
}