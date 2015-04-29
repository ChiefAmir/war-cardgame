import java.util.ArrayList;

public class CardPileTester {
    public static void main(String [] args) {
    
      static final int HALF_DECK = 26;
    
      CardPile deck = new CardPile();
      ArrayList<Card> pile1Array = new ArrayList<Card>();
      ArrayList<Card> pile2Array = new ArrayList<Card>();
      
      
   
      for(int i = 0; i < HALF_DECK; i ++){
         pile1Array.add(deck.draw());
      }
      for(int i = 0; i < HALF_DECK; i ++){
         pile2Array.add(deck.draw());
      }
      
      System.out.println("");
       for (int i = 0; i < HALF_DECK ; i++){
         System.out.println(deck.draw());
      }
   
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