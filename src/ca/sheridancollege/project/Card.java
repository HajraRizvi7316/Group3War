/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * Student Name: Hajra Rizvi
 */
public abstract class Card {
    //default modifier for child classes
    private Rank cardRank;
    private Suit cardSuit;
    /**
     * Students should implement this method for their specific children classes
     *
     * @param rank
     * @param suit
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    public Card(Rank rank, Suit suit){
        this.cardRank = rank;
        this.cardSuit = suit;
    }
    
    public Rank getRank(){
        return cardRank;
    }
    
    public Suit getSuit(){
        return cardSuit;
    }
    
    @Override
    public abstract String toString();

}
