package org.example;
import java.util.Scanner;

public class Player {

    private static Scanner input = new Scanner(System.in);
    private static int tile;
    private static String p1 = "";
    private static String p2 = "";


    public static void instructions() {
        System.out.print("Welcome to the Tic-Tac-Toe game!\n\n");
        System.out.print("Please enter the name of player 1: ");
        p1 = input.nextLine();
        System.out.print("\nPlease enter the name of player 2: ");
        p2 = input.nextLine();
        System.out.println("\nPlayer 1 will mark the boxes with o. Player 2 will mark the boxes with x.\n\n");
        System.out.println("To mark the boxes you will type in the number of the box you wish to fill according to the diagram below.\n");
        String[] board = {" ", "1", " |", " ", "2", " |", " ", "3", " ", 
            "----------", 
            " ", "4", " |", " ", "5", " |", " ", "6", " ", 
            "----------", 
            " ", "7", " |", " ", "8", " |", " ", "9", " ",};
        for (int i = 0; i < board.length; i++) {
            if ((i == 9) || (i == 19)) {
                System.out.print("\n" + board[i] + "\n");
            } else {
                System.out.print(board[i]);
            }
        }
    };

    private static int getTile() {
        boolean check = true;
        do {
            System.out.print("\n\nPlease enter the number of the tile you would like to place your mark.");
            if (input.hasNextInt()) {
                tile = input.nextInt();
                input.nextLine();
                if ((tile >= 1) && (tile <=9)) {
                    check = false;
                }
            } else {
                System.out.println("Please enter a valid integer 1 through 9.");
                input.nextLine();
            }


        } while (check);
        return tile;
    }

    public static void fillTile(int turn, String[] gameboard) { //t for tile
        if ((turn % 2) == 0) {
            int rt = getTile(); //requested tile
            int rtc = Board.tileConversion(rt); //requested tile converted
            if (Board.tileCheck(rtc, gameboard)) {
                gameboard[rtc] = "x";
            } else {
                fillTile(turn, gameboard);
            }
        } else {
            int rt = getTile(); //requested tile
            int rtc = Board.tileConversion(rt); //requested tile converted
            if (Board.tileCheck(rtc, gameboard)) {
                gameboard[rtc] = "o";
            } else {
                fillTile(turn, gameboard);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < gameboard.length; i++) {
            if ((i == 9) || (i == 19)) {
                System.out.print("\n" + gameboard[i] + "\n");
            } else {
                System.out.print(gameboard[i]);
            }
        }
    
    }

    public static String getp1() {
        return p1;
    }

    public static String getp2() {
        return p2;
    }

    public static boolean playAgain() {
        boolean playAgain = true;
        String in;
        boolean check = false;
            do {
                System.out.println("Would you like to play again? Enter Y/N: ");
                in = input.next();
                if (in.equals("Y") || in.equals("y")) {
                    playAgain = true;
                    check = false;
                } else if (in.equals("N") || in.equals("n")) {
                    playAgain = false;
                    check = false;
                } else {
                    System.out.println("Please enter Y or N.");
                    check = true;
                }
            input.nextLine();
            } while (check);
            return playAgain;
        } 
    
    }
