/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * Student Name: Hajra Rizvi & Gurwinder Kaur
 * Student Number: 991627316 & 991340033
 */
public class GroupOfCards{

    //The group of cards, stored in an ArrayList
    private List<WarCard> cards = new ArrayList<WarCard>();
    
    GroupOfCards(){
        createDeck();
    }
    
    
    //method to create the deck
    public void createDeck(){
        for (Suit s: Suit.values()){
            for (Rank r : Rank.values()){
                cards.add(new WarCard(s,r));
            }
        }
    }

    
    //Adds a card to the bottom of the deck, index 0 of arraylist
    public void add(WarCard card){
        this.cards.add(0, card);
    }
    
    //Show the current Hand
    public String showHand(){
        String str = "";
        for (WarCard c: cards){
            str += c.toString();
        }
        return str;
    }
    /**
     * A method that will get the group of cards as an List
     *
     * @return the group of cards.
     */
    public List<WarCard> getCards() {
        return this.cards;   
    }

    public void setCards(ArrayList<WarCard> card) {
        this.cards = card;
    }
    

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
   
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.cards.size();
    }
    
    public WarCard dealCard(){
        return this.cards.remove(this.cards.size() -1);
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        size = 52;
    }
    
    //toString method to return all the orders in order
    @Override
    public String toString(){
        return this.cards.toString();
        //return this.showHand()
    }
    
}//end class
