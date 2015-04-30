import javax.swing.ImageIcon;

/**
 * @author Shayan Amir-Kabirian
 */
public class CardIcon extends Card{
	
   /**
    * Constructor to create a card
    * @param suit integer to denote suit (1 = spades, 2 = clubs, 3 = hearts, 4 = diamonds)
    * @param rank integer to denote rank (2 to 14)
    */
   public CardIcon(int suit, int rank){
      super(suit, rank);
   }
   
   /**
    * Copy Constructor
    * @param card object to be copied 
    */
   public CardIcon(Card card){
      super(card);
   }
   
   /**
    * ImageIcon getter for the GUI
    * @return ImageIcon of the card
    */
    public ImageIcon getIcon(){
        return new ImageIcon("cards/" + super.imageCode() + ".png");
    }
}