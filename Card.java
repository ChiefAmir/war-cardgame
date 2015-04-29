public class Card{
   
   public static final int SPADES = 1, CLUBS = 2, HEARTS = 3, DIAMONDS = 4;
   
   public static final int JACK = 11, QUEEN = 12, KING = 13, ACE = 14;
   
   private static final int HIGH_RANKS = 14, LOW_RANKS = 2, HIGH_SUITS = 4, LOW_SUITS = 1;
   
   private int rank, suit;
   
   
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
   
   
   public Card (Card otherCard){
      suit = otherCard.suit;
      rank = otherCard.rank;
   }
   
   
   
   
   public int getSuit(){
      return suit;
   }
   
   
   
   public int getRank(){
      return rank;
   }
   
   
   
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
   
   
   
   public String imageCode(){
      String suitString, rankString;
      
      suitString = String.valueOf(suit);
      rankString = String.valueOf(rank);
      
      return suitString + "-" + rankString;
   }
   
   
   
   public boolean equals(Card otherCard){
      return (this.suit == otherCard.suit && this.rank == otherCard.rank);
   }
   

}