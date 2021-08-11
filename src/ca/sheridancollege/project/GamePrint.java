package ca.sheridancollege.project;

/**
 * Author: Hajra Rizvi Date:
 */
public class GamePrint {

    public void openingMessage() {
        System.out.println("Overview of the Game:\n - This Game is automated\n"
                + " - It will play until one player's deck is empty or 25 rounds are completed"
                + "\n - You will play against the Computer\n Good Luck!");
        System.out.print("Please Enter Username: ");
    }

    public void startMessage(Player player) {
        System.out.printf("Let's Start! %s\n", player.getName());
        System.out.println("...");
    }

    public void header(Player playerOne, Player playerTwo) {
        String header = "Points";
        String winner = "Round Winner";
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", playerOne.getName(), header, playerTwo.getName(), header, winner);

    }

    //Print out winnings for each round and final winner of game.
    public void roundWinner(Player player1, WarCard card1, Player player2, WarCard card2, String winner) {
        System.out.printf("%-20s %-20s %-20s %-20s %s is winner.\n", card1.toString(), player1.getHand().handSize(), card2.toString(), player2.getHand().handSize(), winner);
    }

    //print war round
    public void warRound() {
        System.out.println("WAR! Played 3 Cards.");
    }

    public void gameWinner(Player player) {
        System.out.printf("Congratulations! The winner of the game is %s!\nTotal Points: %d \n", player.getName(), player.getHand().handSize());
    }

    public void announceDraw() {
        System.out.printf("DRAW! Better Luck Next Time!\n");
    }

}
