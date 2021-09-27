/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020 Hajra Rizvi & Gurwinder Kaur SYST17796 
 * Date:08/08/2021
 */
public class Game {
    //Main

    public static void main(String[] args) {
        //Welcome to War! message
        System.out.println("Welcome to War Card Game!");
        GamePlay game = new GamePlay();
        game.startGame();
    }

}//end class
