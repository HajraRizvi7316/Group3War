
package ca.sheridancollege.project;

import java.util.Scanner;
import java.util.List;

/**
 * Author: Hajra Rizvi & Gurwinder Kaur Date: July 15, 2021
 */
public class GamePlay {

    //Game Deck
    private GroupOfCards deck;

    //User
    private Player userPlayer;
    //Computer 
    private Player compPlayer;

    //Game Printer
    private static GamePrint gamePrint = new GamePrint();

    public void startGame() {
        gamePrint.openingMessage();
        Scanner in = new Scanner(System.in);
        String playerName = in.nextLine();
        this.userPlayer = new Player(playerName);
        this.compPlayer = new Player("Computer");

        gamePrint.startMessage(userPlayer);

        //create a deck
        deck = new GroupOfCards();

        //shuffle deck
        deck.shuffle();

        //Create and set hands
        userPlayer.setHand(new Hand());
        compPlayer.setHand(new Hand());

        //deal Cards to hand
        dealCards(userPlayer.getHand());
        dealCards(compPlayer.getHand());

        gamePrint.header(userPlayer, compPlayer);

//        System.out.println("Player 1" + userPlayer.getName());
//        System.out.println(userPlayer.getHand().toString());
//        System.out.println(compPlayer.getHand().toString());
        //show results
        int maxRounds = 27;
        Player winner = null;
        while (war(userPlayer, compPlayer, null)) {
            maxRounds--;

            //check hands for winner
            if (userPlayer.getHand().handSize() == 0) {
                //cpu is winner
                winner = compPlayer;
                break;
            } else if (compPlayer.getHand().handSize() == 0) {
                //user is the winner
                winner = userPlayer;
                break;
            }

            if (maxRounds < 0) {
                break;
            }
        }

        if (winner != null) {
            //declaring the winner
        } else if (userPlayer.getHand().handSize() > compPlayer.getHand().handSize()) {
            winner = userPlayer;
        } else if (compPlayer.getHand().handSize() > userPlayer.getHand().handSize()) {
            winner = compPlayer;
        } else {
            //draw
            gamePrint.announceDraw();
            return;
        }
        gamePrint.gameWinner(winner);

    }

    public void dealCards(Hand hand) {
        for (int i = 0; i < 26; i++) {
            hand.addCardTop(deck.dealCard());
        }
//        System.out.println(hand);
    }



    //Main
    public static void main(String[] args) {
        //Welcome to War! message
        System.out.println("Welcome to War Card Game!");
        GamePlay game = new GamePlay();
        game.startGame();
    }

}
