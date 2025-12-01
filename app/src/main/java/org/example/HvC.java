package org.example;

public class HvC {
    private static String[] gameboard = Board.gboard;

    Bot bot = new Bot();

    private static int timesPlayed = 0;

    private static int winner = 0; //1 for player 1 wins and 2 for player 2 wins

    private static int turn = 1; // Player one is O and player 2 is X

    public void startGame() {
        if (timesPlayed == 0) {
            Player.instructionsHvBot();
        }
        System.out.println("\n");
        for (int i = 0; i < gameboard.length; i++) {
            if ((i == 9) || (i == 19)) {
                System.out.print("\n" + gameboard[i] + "\n");
            } else {
                System.out.print(gameboard[i]);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((turn == 1) || ((turn % 2) == 1)) {
                System.out.println("\n\n" + Player.getp1() + "'s turn.");
            } else {
                System.out.println("\n\n" + Player.getp2() + "'s turn.");
            }

            if ((turn % 2) == 0) { // computer logic for the game, since computer doesn't start in this one corners() is not used.
                if ((turn == 2) && (gameboard[14].equals(" "))) {
                    bot.center("x", gameboard);
                } else if ((turn > 3) && (bot.blockWinChance("o", gameboard))) { // checks for a chance to block.
                    bot.blockWin("x", "o", gameboard);
                } else {
                    bot.findWin("x", gameboard); // this is ultimately either a random move or a win
                }
            }

            if ((turn == 1) || ((turn % 2) == 1)) { // same logic
                Player.fillTile(turn, gameboard);
            }

            if ((turn > 4)) {
                if ((turn % 2) == 0) {
                    if (Board.checkWinx(gameboard) == 1) {
                        System.out.println("\n\n" + Player.getp2() + " has won the game.\n");
                        winner = 2;
                        break;
                    }
                } else {
                    if (Board.checkWino(gameboard) == 1) {
                        System.out.println("\n\n" + Player.getp1() + " has won the game.\n");
                        winner = 1;
                        break;
                    }
                }
            }
            turn++;
            if (i == 9) {
                System.out.println("\n\nThe game ends in a tie");
                winner = 0;
            }
        }
        Scoreboard.updateScoreboard(winner);
        Scoreboard.displayScoreboard();
        if (Player.playAgain()) {
            timesPlayed++;
            Board.clear();
            turn = 1;
            startGame();
        } else {
            System.out.println("\nWriting the game log to disk. Please see game.txt for the final statistics!");
            ScoreWriter writer = new ScoreWriter();
            writer.writeScore();
        }
    }
}
