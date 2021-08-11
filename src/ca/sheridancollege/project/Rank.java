package ca.sheridancollege.project;

/**
* Author: Hajra Rizvi & Gurwinder Kaur
* Date: 07/15/2021
* Rank: This is an enum class for the ranks of a card. 
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
    
    //return rank name value
    public String getRankName(){
        return this.rankName;
    }
    
    /*returns int from 2 to 14
    ex Jack = 11
    */
    public int getValue(){
        return this.value;
    }    
   
    //toString method shorthand of rank
    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }
   

}
