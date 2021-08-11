/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
* Author: Hajra Rizvi & Gurwinder Kaur
 * Date: 07/15/2021
 */

//enum class for Rank
public enum Rank {
    ACE("Ace", 1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eigth", 8),
    NINE("Nine", 9),
    TEN("Eleven", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12), 
    KING("King", 13);
    
    //declare value and name
    private int value;
    private String rankName;
    
    //Constructor with two arguments
    Rank(String rankName, int value){
        this.rankName=rankName;
        this.value = value;
    }
    

    
   
    //toString method shorthand of rank
    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }
   

}
