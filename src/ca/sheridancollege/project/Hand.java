/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: HajraRizvi & Gurwinder Kaur
 * Date:July 15, 2021
 * SYST17796
 * Hand: This class deals with each players deck; hand. This application includes
 * all the functionality the game has with players decks. It has methods
 * to add card to the bottom and top. Remove card from bottom and top and more. 
 */

public class Hand{
        //player individual cards
    private List<WarCard> cards; 
    
    //no arg constructor
    public Hand(){
        this.cards = new ArrayList<WarCard>();
    }
    
    //take N cards out
    public List<WarCard> take(int numCard){
        if (numCard > this.handSize()){
            return null;
        }
        List<WarCard> away = new ArrayList<>();
        for(int i = 0; i< numCard; i++){
            away.add(this.cards.remove(this.handSize()-1));
        }
        
        return away;
    }
    /**
     * Add cards from one hand to another
     */
    public void AddHand(Hand other){
        for (WarCard card : other.cards){
            this.addCardBottom(card);
        }
    }
    
    //single Card object added to end of Array
    public void addCardTop(WarCard card){
        if (card==null){
            throw new NullPointerException("Can't add a null card to cards!");
        }
        cards.add(card);
    }
    
    //more than one card added to to the array
    public void addCardsTop(List<WarCard> cs){
        this.cards.addAll(cs);
    }
    
    //adds Card object at the beginning of the array
    public void addCardBottom(WarCard card){
        cards.add(0, card);
    }
    
    //removes card from the last index of the array
    public WarCard removeCardTop(){
        if (handSize() < 1){
            return null;
        }
        return cards.remove(handSize() - 1);
    }
    
    //removes card from the first index of the array
    public WarCard removeCardBottom(){
        if (handSize() <1){
            return null;
        }
        return cards.remove(0);
    }
    
    //returns the number of cards in the hand
    public int handSize(){
        return cards.size();
    }
    
    public String toString(){
       return this.cards.toString();
    }

    

}
