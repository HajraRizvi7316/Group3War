/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * Author: Hajra Rizvi Date:
 */
public class WarMain {

    public static void main(String[] args) {
        DeckOfCards decks = new DeckOfCards(Suit.values(), Rank.values(), 52);
        System.out.println(decks);
        for (int i=0; i<decks.getSize(); i++){
            System.out.println(i);
        }
        

    }
}
