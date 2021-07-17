/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Author: HajraRizvi & Gurwinder Kaur
 * Date:July 15, 2021
 */
public class DeckOfCards extends GroupOfCards {

    //Constructor creating a deck of cards
    public DeckOfCards(int size) {
        super(size);

        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                WarCard card = new WarCard(s, r);
                this.add(card);

            }
        }
    }
    public void deal(int n) {
        for (int i=0; i < n; ++i)
           System.out.println(cards.get(i));
    }

    //toString Method
    @Override
    public String toString() {
        return this.showHand();

    }

}
