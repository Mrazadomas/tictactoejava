package org.example;


public class Game {

    private static String[] gameboard = Board.gboard;

    private static int turn = 1;
    public void startGame() {
        Player.instructions();
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
            Player.fillTile(turn, gameboard);
            if ((turn > 4)) {
                if ((turn % 2) == 0) {
                    if (Board.checkWinx(gameboard) == 1) {
                        System.out.println("\n\n" + Player.getp2() + " has won the game.\n");
                        break;
                    }
                } else {
                    if (Board.checkWino(gameboard) == 1) {
                        System.out.println("\n\n" + Player.getp1() + " has won the game.\n");
                        break;
                    }
                }
            }
            turn++;
            if (i == 9) {
                System.out.println("\n\nThe game ends in a tie");
            }
        }
        if (Player.playAgain()) {
            Board.clear();
            startGame();
        }
    }
}
