/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;
import ca.sheridancollege.project.Card;

/**
 * Author: HajraRizvi Date:
 */
public class DeckOfCards extends GroupOfCards {

    
    
    private Suit cardSuit[];
    private Rank cardRank[];
    
    

    public DeckOfCards(Suit suit[], Rank rank[], int size) {
        super(size);
        this.cardSuit = suit;
        this.cardRank = rank;
    }
    
  
    
    public ArrayList<Card> getDeck(){
        ArrayList<Card> deck = new ArrayList<Card>();
        for (Suit s: Suit.values()){
            for (Rank r : Rank.values()){
                deck.add(new WarCard(s,r,s,r));
            }
        }
        return deck;
    }
    
   

    public String toString() {
        return (cardRank + " of " + cardSuit);

    }
   
}
