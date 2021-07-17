/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

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
    public ArrayList<Card> cards;
    private int size;//the size of the grouping

    //Constructor with 1 argument 
    public GroupOfCards(int size) {
        cards =  new ArrayList<Card>();
        this.size = size;
    }
    
    //Add method
    public void add(Card card){
        cards.add(card);
    }
    
    //Show the current Hand
    public String showHand(){
        String str = "";
        for (Card c: cards){
            str += c.toString();
        }
        return str;
    }
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;   
    }

    public void setCards(ArrayList<Card> card) {
        this.cards = card;
    }
    

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}//end class
