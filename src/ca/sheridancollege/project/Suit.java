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

//enum class for Suits
public enum Suit {
    CLUB("Club"), 
    DIAMOND("Diamond"), 
    HEART("Heart"), 
    SPADE("Spade");

    //declare name 
    String name;
    
    //Constructor with one arg
    Suit(String name)
    {
        this.name=name;
    }
    
    //Getter method to get suit name
    public String getSuit(){
        return name;
    }

    //toString method
    @Override
    public String toString()
    {
        return name;
    }

}
