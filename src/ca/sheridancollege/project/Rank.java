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

//enum class for Rank
public enum Rank {
    ACE("Ace", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12), 
    KING("King", 13);
    
    //declare value and name
    int value;
    String name;
    
    //Constructor with two arguments
    Rank(String name, int value){
        this.name=name;
        this.value = value;
    }
    
    //toString method
    @Override
    public String toString(){
        return name;
    }
   

}
