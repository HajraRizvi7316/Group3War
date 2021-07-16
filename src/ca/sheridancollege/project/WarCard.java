/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * Author: Hajra Rizvi 
 * Date: 07/15/2021
 */
public class WarCard extends Card {

    //Define data members, Instance variable in private visibility for complete encapsulation
    private Suit cardSuit;
    private Rank cardRank;

    //constructor with two args
    public WarCard(Suit suits, Rank ranks) {
        this.cardSuit = suits;
        this.cardRank = ranks;
    }

    //Getter method to getRank
    public Rank getRank() {
        return cardRank;
    }

    //Setter method to set the Card Suit
    public void setCardSuit(Suit suit) {
        this.cardSuit = suit;
    }

    //Setter method to set Card Rank
    public void setCardRank(Rank rank) {
        this.cardRank = rank;
    }
    
    //Getter method to get Suit
    public Suit getSuit() {
        return cardSuit;
    }
    
    //toString method
    public String toString(){
        return (cardRank + " of " + cardSuit + "\n");
    }

}
