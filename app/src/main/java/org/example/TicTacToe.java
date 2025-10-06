package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    
    private static String[] gameboard = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " "};

    private static String[] clearboard = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " "};

    private static String p1;
    private static String p2;
    private static int turn = 1; //for turns, default is 1, which is o, 2 is x and so on alternating
    private static int t1 = 1;
    private static int t2 = 4;
    private static int t3 = 7;
    private static int t4 = 11;
    private static int t5 = 14;
    private static int t6 = 17;
    private static int t7 = 21;
    private static int t8 = 24;
    private static int t9 = 27;
    private static int tile;
    private static Scanner input = new Scanner(System.in);
// x win is 1, o win is 0;

//win conditions
/*
1 4 7
11 14 17
21 24 27
1 11 21
4 14 24
7 17 27
1 14 27
7 14 21
*/

// vector<int> win1 = {1, 4, 7};
// vector<int> win2 = {11, 14, 17};
// vector<int> win3 = {21, 24, 27};
// vector<int> win4 = {1, 11, 21};
// vector<int> win5 = {4, 14, 24};
// vector<int> win6 = {7, 17, 27};
// vector<int> win7 = {1, 14, 27};
// vector<int> win8 = {7, 14, 21};

    public static int checkWinx() {
        ArrayList<Integer> xTiles = new ArrayList<Integer>();
        for (int i = 0; i < gameboard.length; i++) {
            if (gameboard[i] == "x") {
                xTiles.add(i);
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 4) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 7) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 11) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 17) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 21) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 24) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 11) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 4) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 24) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 17) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int checkWino() {
        ArrayList<Integer> xTiles = new ArrayList<Integer>();
        for (int i = 0; i < gameboard.length; i++) {
            if (gameboard[i] == "o") {
                xTiles.add(i);
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 4) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 7) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 11) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 17) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 21) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 24) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 11) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 4) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 24) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 17) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int getTile() {
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

    public static int tileConversion(int tile) {
        if (tile == 1) {
            return t1;
        } else if (tile == 2) {
            return t2;
        } else if (tile == 3) {
            return t3;
        } else if (tile == 4) {
            return t4;
        } else if (tile == 5) {
            return t5;
        } else if (tile == 6) {
            return t6;
        } else if (tile == 7) {
            return t7;
        } else if (tile == 8) {
            return t8;
        } else {
            return t9;
        }
    }

    public static boolean tileCheck(int tile) {
        if (gameboard[tile] != " ") {
            System.out.println("Tile is already marked.");
            return false;
            
        } 
        return true;
    }

    public static void fillTile() { //t for tile
        if ((turn % 2) == 0) {
            int rt = getTile(); //requested tile
            int rtc = tileConversion(rt); //requested tile converted
            if (tileCheck(rtc)) {
                gameboard[rtc] = "x";
            } else {
                fillTile();
            }
        } else {
            int rt = getTile(); //requested tile
            int rtc = tileConversion(rt); //requested tile converted
            if (tileCheck(rtc)) {
                gameboard[rtc] = "o";
            } else {
                fillTile();
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
        for (int i = 0; i < gameboard.length; i++) {
            if ((i == 9) || (i == 19)) {
                System.out.print("\n" + board[i] + "\n");
            } else {
                System.out.print(board[i]);
            }
        }
    };

    public static void game() {
        instructions();
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
                System.out.println("\n\n" + p1 + "'s turn.");
            } else {
                System.out.println("\n\n" + p2 + "'s turn.");
            }
            fillTile();
            if ((turn > 4)) {
                if ((turn % 2) == 0) {
                    if (checkWinx() == 1) {
                        System.out.println("\n\n" + p2 + " has won the game.\n");
                        break;
                    }
                } else {
                    if (checkWino() == 1) {
                        System.out.println("\n\n" + p1 + " has won the game.\n");
                        break;
                    }
                }
            }
            turn++;
            if (i == 9) {
                System.out.println("\n\nThe game ends in a tie");
            }
        }


    }

    public static void clear() {
        for (int i = 0; i < gameboard.length; i++) {
            gameboard[i] = clearboard[i];
        }
        p1 = "";
        p2 = "";
    }

    public static void main(String[] args) {
        boolean playAgain = true;
        String in;
        boolean check = false;
        do {
            game();
            do {
                System.out.println("Would you like to play again? Enter Y/N: ");
                in = input.next();
                if (in.equals("Y")) {
                    playAgain = true;
                    check = false;
                } else if (in.equals("N")) {
                    playAgain = false;
                    check = false;
                } else {
                    System.out.println("Please enter Y or N.");
                    check = true;
                }
            input.nextLine();
            } while (check);
            clear();
        } while (playAgain);
        input.close();
    }
}
