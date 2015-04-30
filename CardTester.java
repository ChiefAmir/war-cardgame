/**
 * @author Shayan Amir-Kabirian
 */
public class CardTester {

    public static void main(String [] args) {
    
    // Create a card (4 of Spades) and print its toString and imageCode
    
    Card card = new Card (1, 4);
    
    System.out.println(card.toString());
    
    System.out.println(card.imageCode());
    
   }   
}