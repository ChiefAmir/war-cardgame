import javax.swing.ImageIcon;

public class CardIcon extends Card{

   public CardIcon(int suit, int rank){
      super(suit, rank);
   }
   
   
   public CardIcon(Card card){
      super(card);
   }
   
    public ImageIcon getIcon(){
        return new ImageIcon("cards/" + super.imageCode() + ".png");
    }
}