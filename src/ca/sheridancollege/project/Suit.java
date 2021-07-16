/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
 * Author: Hajra Rizvi
 * Date: 
 */
public enum Suit {
    CLUB("Club"), 
    DIAMOND("Diamond"), 
    HEART("Heart"), 
    SPADE("Spade");

    String name;
    Suit(String name)
    {
        this.name=name;
    }

    @Override
    public String toString()
    {
        return name;
    }

}
