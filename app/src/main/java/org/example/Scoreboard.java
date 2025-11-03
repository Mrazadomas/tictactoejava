package org.example;

public class Scoreboard {
    private static int xWins = 0;
    private static int oWins = 0;
    private static int ties = 0;

    public static void updateScoreboard(int winner) {
        if (winner == 1) {
            oWins++;
        } else if (winner == 2) {
            xWins++;
        } else {
            ties++;
        }
    }

    public static void displayScoreboard() {
        System.out.println("\n" + Player.getp1() + " wins: " + oWins);
        System.out.println(Player.getp2() + " wins: " + xWins);
        System.out.println("Ties: " + ties);
    }

    public static String Oscore() { // for the scorewriter class
        return Player.getp1() + " wins: " + oWins;
    }

    public static String Xscore() { // for the scorewriter class
        return Player.getp2() + " wins: " + xWins;
    }

    public static String ties() {
        return "Ties: " + ties;
    }
}
