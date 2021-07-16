/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.*;
/**
 * Author: Hajra Rizvi 
 * Date: 07/15/2021
 */
public class WarMain {

    public static void main(String[] args) {
        

        
//        DeckOfCards decks = new DeckOfCards(52);
        
//        decks.shuffle();
//        System.out.println(decks);

        DeckOfCards d1;
        d1 = new DeckOfCards(52);
        System.out.println(d1.toString());
        d1.shuffle();
        System.out.println(d1);
        
        /*Things to do
        Deal the cards and keep track of who has what card
        and how many cards each player has
        
        */ 

        

    }
}
