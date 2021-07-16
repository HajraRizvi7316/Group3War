/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * Author: Hajra Rizvi Date:
 */
public class WarCard extends Card {

    private Suit cardSuit;
    private Rank cardRank;

    public WarCard(Suit suits, Rank ranks, Suit suit, Rank rank) {
        super(rank, suit);
        this.cardSuit = suits;
        this.cardRank = ranks;
    }

    
    

    public Rank getRank() {
        return cardRank;
    }

    public void setCardSuit(Suit suit) {
        this.cardSuit = suit;
    }

    public void setCardRank(Rank rank) {
        this.cardRank = rank;
    }
    

    public Suit getSuit() {
        return cardSuit;
    }
    
    public String toString(){
        return (cardRank + " of " + cardSuit);
    }

}
