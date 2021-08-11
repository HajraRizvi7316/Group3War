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

    //War Game
    public boolean war(Player playerOne, Player playerTwo, Hand handCards) {
        //players show top card from deck, each player draws from top of deck
        //stores cards that are in play in an array.
        WarCard playerOneShow = playerOne.getHand().removeCardTop();
        if (playerOneShow == null) {
            return false;
        }
        WarCard playerTwoShow = playerTwo.getHand().removeCardTop();
        if (playerTwoShow == null) {
            return false;
        }

        //In case of war rach player adds 2 cards to handCards and the thrid card is evaluated
        if (handCards == null) {
            handCards = new Hand();
        }

        handCards.addCardTop(playerOneShow);
        handCards.addCardTop(playerTwoShow);
        int result = playerOneShow.compareTo(playerTwoShow);
        switch (result) {
            case 0:
                gamePrint.warRound();

                //each player adds two cards to the war hand
                List<WarCard> playerOneWar = playerOne.getHand().take(2);
                if (playerOneWar == null) {
                    return false;
                }

                //add the two cards to the war hand
                handCards.addCardsTop(playerOneWar);

                //each player adds two cards to the war hand
                List<WarCard> playerTwoWar = playerTwo.getHand().take(2);
                if (playerTwoWar == null) {
                    return false;
                }

                //add the two cards to the war hand
                handCards.addCardsTop(playerTwoWar);

            case 1:
                //Give all cards on table to player 1
                //PLayer1 adds both face up cards to the bottom of their deck
                playerOne.getHand().AddHand(handCards);
                gamePrint.roundWinner(playerOne, playerOneShow, playerTwo, playerTwoShow, playerOne.getName());
                break;
            case -1:
                //Give all cards on table to player 2
                //player2 adds both face up cards to the bottom of their deck
                playerTwo.getHand().AddHand(handCards);
                gamePrint.roundWinner(playerOne, playerOneShow, playerTwo, playerTwoShow, playerTwo.getName());
                break;
        }
        return true;

    }

    //Main
    public static void main(String[] args) {
        //Welcome to War! message
        System.out.println("Welcome to War Card Game!");
        GamePlay game = new GamePlay();
        game.startGame();
    }

}
