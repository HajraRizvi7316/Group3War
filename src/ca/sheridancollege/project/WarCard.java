package ca.sheridancollege.project;

/**
 * Author: Hajra Rizvi & Gurwinder Kaur
 * Date: 07/15/2021
 * WarCard: This is class which initializes the cards. 
 */
public class WarCard implements Comparable<WarCard>{

    //Define data members, Instance variable in private visibility for complete encapsulation
    private Suit cardSuit;
    private Rank cardRank;

    //constructor with two args
    public WarCard(Suit suits, Rank ranks) {
        if (ranks == null || suits == null){
            throw new NullPointerException();
        }
        this.cardSuit = suits;
        this.cardRank = ranks;
    }

    //Getter method to getRank
    public Rank getRank() {
        return this.cardRank;
    }
    
    //Setter method to set Card Rank
    public void setRank(Rank rank) {
        this.cardRank = rank;
    }

    //Setter method to set the Card Suit
    public void setSuit(Suit suit) {
        this.cardSuit = suit;
    }


    
    //Getter method to get Suit
    public Suit getSuit() {
        return this.cardSuit;
    }
    
    //ACE= A, TWO = 2
    public String getRankLetter(){
        return this.cardRank.toString();
    }
    
    //@return Number indicating how many point the card is worth
    public Integer getCardValue(){
        return this.cardRank.getValue();
    }
    

    //return 1 if value of card > other, -1 if this < other and id equal
    public int compareTo(WarCard other) {
        return this.getCardValue().compareTo(other.getCardValue());
    }
    
    //return true if the suit of 2 different cards are the same
    public boolean isSameSuit(WarCard other){
        return this.cardSuit.equals(other.cardSuit);
    }
    
    //return true is the rank of 2 different cards are the same
    public boolean isSameRank(WarCard other){
        return this.cardRank.equals(other.cardRank);
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (!WarCard.class.isAssignableFrom(obj.getClass())){
            return false;
        }
        final WarCard other = (WarCard) obj;
        return this.cardSuit == other.cardSuit && this.cardRank == other.cardRank;
        
    }
    
    //toString method --> Two of Hearts
    @Override
    public String toString(){
        return this.cardRank.getRankName() + " of " + this.cardSuit.getSuit();
    }

}
