
TESTING


TESTING 2
/**
 * @author Shayan Amir-Kabirian
 */
public class Card{
   
   // Declare the suits, ranks, and constants for use in the class
   public static final int SPADES = 1, CLUBS = 2, HEARTS = 3, DIAMONDS = 4;
   
   public static final int JACK = 11, QUEEN = 12, KING = 13, ACE = 14;
   
   public static final int HIGH_RANKS = 14, LOW_RANKS = 2, HIGH_SUITS = 4, LOW_SUITS = 1;
   // rank and suit, to keep track of the details of the card
   public int rank, suit;
   
   
   /**
    * Constructor to create a card
    * @param new_suit integer to denote suit (1 = spades, 2 = clubs, 3 = hearts, 4 = diamonds)
    * @param new_rank integer to denote rank (2 to 14)
    */
   public Card (int new_suit, int new_rank){
      if ((new_suit < LOW_SUITS) || (new_suit > HIGH_SUITS)){
         throw new IllegalArgumentException("Invalid Suit Integer. Has to be between 1 and 4.");
      }
      else{
         suit = new_suit;
      }
      
      if ((new_rank < LOW_RANKS) || (new_rank > HIGH_RANKS)){
         throw new IllegalArgumentException("Invalid Rank Integer. Has to be between 2 and 14");
      }
      else{
         rank = new_rank;
      }
   }
   
   /**
    * Copy constructor
    * @param otherCard Another card object
    */
   public Card (Card otherCard){
      suit = otherCard.suit;
      rank = otherCard.rank;
   }
   
   
   
   /**
    * Suit retriever
    * @return suit of card 
    */
   public int getSuit(){
      return suit;
   }
   
   
   /**
    * Rank retriever
    * @return rank of card
    */
   public int getRank(){
      return rank;
   }
   
   /**
    * Gets name of card
    * @ return string of card, ready to use (e.g. 4 of Spades)
    */
   public String toString(){
      String suitString;
      String rankString;
      
      switch(suit){
         case SPADES:
            suitString = "Spades";
            break;
         case CLUBS:
            suitString = "Clubs";
            break;
         case HEARTS:
            suitString = "Hearts";
            break;
         default:
            // Diamonds is the only suit left
            suitString = "Diamonds";
            break;
      }
      
      switch(rank){
         case ACE:
            rankString = "Ace";
            break;
         case JACK:
            rankString = "Jack";
            break;
         case QUEEN:
            rankString = "Queen";
            break;
         case KING:
            rankString = "King";
            break;
         default:
            rankString = String.valueOf(rank);
            break;
      }
      
      
      return rankString + " of " + suitString;
   }
   
   
   /**
    * Get code of card that corresponds to the image file name
    * @return suit number and rank number separated by a dash
    */
   public String imageCode(){
      String suitString, rankString;
      
      suitString = String.valueOf(suit);
      rankString = String.valueOf(rank);
      
      return suitString + "-" + rankString;
   }
   
   /**
    * Compare two cards based on rank alone
    * @param otherCard a card to compare to this one
    * @return integer based on comparison (2 = greater than, 1 = equal, 0 = less than)
    */
   public int compare(Card otherCard){
      if (rank > otherCard.rank){
         return 2;
      }
      else if (rank == otherCard.rank){
         return 1;
      }
      // rank < otherCard.rank is all that is left over
      else{
         return 0;
      }
   }
   
   /**
    * Find out if cards are completely equal
    * @param otherCard Card to compare to this one
    * @return boolean whether cards are equal or not
    */
   public boolean equals(Card otherCard){
      return (this.suit == otherCard.suit && this.rank == otherCard.rank);
   }
   

}