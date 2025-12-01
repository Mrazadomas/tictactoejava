package org.example;
import java.lang.Math;
import java.util.ArrayList;

// t1 = 1;
// t2 = 4;
// t3 = 7;
// t4 = 11;
// t5 = 14;
// t6 = 17;
// t7 = 21;
// t8 = 24;
// t9 = 27;

public class Bot {

    Integer[] tiles = {1, 4, 7, 11, 14, 17, 21, 24, 27};

    private static int blockWinIndex;
    
    public void corners(String mark, String[] gameboard) {
        int num = (int) (Math.random() * 4) + 1;
        if (num == 1) {
            gameboard[1] = mark;
        } else if (num == 2) {
            gameboard[7] = mark;
        } else if (num == 3) {
            gameboard[21] = mark;
        } else if (num == 4) {
            gameboard[27] = mark;
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

    public void center(String mark, String[] gameboard) {
        if (gameboard[14] == " ") {
            gameboard[14] = mark;
            System.out.println("\n");
            for (int i = 0; i < gameboard.length; i++) {
                if ((i == 9) || (i == 19)) {
                    System.out.print("\n" + gameboard[i] + "\n");
                } else {
                    System.out.print(gameboard[i]);
                }
            }
        }
    }

    public static int[] checkWin(String mark, String[] gameboard) {
        ArrayList<Integer> xTiles = new ArrayList<Integer>();
        for (int i = 0; i < gameboard.length; i++) {
            if (gameboard[i].equals(mark)) {
                xTiles.add(i);
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 4) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 7) {
                                int[] winners = {1, 4, 7};
                                return winners;
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
                                int[] winners = {11, 14, 17};
                                return winners;
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
                                int[] winners = {21, 24, 27};
                                return winners;
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
                                int[] winners = {1, 11, 21};
                                return winners;
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
                                int[] winners = {4, 14, 24};
                                return winners;
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
                                int[] winners = {7, 17, 27};
                                return winners;
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
                                int[] winners = {1, 14, 27};
                                return winners;
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
                                int[] winners = {7, 14, 21};
                                return winners;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }


    public void findWin(String mark, String[] gameboard) {
        ArrayList<Integer> empties = new ArrayList<Integer>();
        
        String[] temp = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " "};

        for (int i = 0; i < temp.length; i++) {
            temp[i] = gameboard[i];
        }

        for (int i = 0; i < tiles.length; i++) { // make a list of all the empty spaces
            if (gameboard[tiles[i]].equals(" ")) {
                empties.add(tiles[i]);
            }
        }
        
        // for (int i = 0; i < empties.size(); i++) {
        //     System.out.println(empties.get(i));
        // }

        for (int i = 0; i < tiles.length; i++) { // fill all empty spaces with the bot's mark
            if (temp[tiles[i]] == " ") {
                temp[tiles[i]] = mark;
            }
        }

        int[] winners = checkWin(mark, temp); // find the possible winning conditions and store in an array
        ArrayList<Integer> choices = new ArrayList<Integer>();
        if (winners != null) {
            for (int i = 0; i < empties.size(); i++) { // seeing if the win conditions match with any of the empty spaces
                for (int x = 0; x < winners.length; x++) {
                    if (empties.get(i) == winners[x]) {
                        choices.add(winners[x]);
                    }
                }
            }
        }

        if (winners == null) {
            int index = (int) (Math.random() * empties.size()); 
            gameboard[empties.get(index)] = mark;
        } else {
            int index = (int) (Math.random() * choices.size()); 
            gameboard[choices.get(index)] = mark;
            // System.out.println(index);
        }

        // in the occasion that there are more than one possible winning conditions, a random one out of all of them will be selected
        // or it will be just one option, therefore it will be the one
        // option.
        
        // finally marking the possible win condition with the mark.
        System.out.println("\n");
        for (int i = 0; i < gameboard.length; i++) {
            if ((i == 9) || (i == 19)) {
                System.out.print("\n" + gameboard[i] + "\n");
            } else {
                System.out.print(gameboard[i]);
            }
        }
    }
    
    public boolean blockWinChance(String mark, String[] gameboard) { // for checking if there can be a win within opponent's next move
        ArrayList<Integer> empties = new ArrayList<>();

        String[] temp = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " "};

        for (int i = 0; i < temp.length; i++) {
            temp[i] = gameboard[i];
        }

        for (int i = 0; i < tiles.length; i++) { // make a list of all the empty spaces
            if (gameboard[tiles[i]] == " ") {
                empties.add(tiles[i]);
            }
        }
        for (int i = 0; i < empties.size(); i++) {
            temp[empties.get(i)] = mark;
            if ((checkWin(mark, temp)) != null) {
                blockWinIndex = empties.get(i);
                return true;
            } else {
                temp[empties.get(i)] = " ";
            }
        }
        return false;
    }

    public void blockWin(String markBot, String markHuman, String[] gameboard) {
        
        gameboard[blockWinIndex] = markBot;
        // finally marking the possible block with the mark.
        System.out.println("\n");
        for (int i = 0; i < gameboard.length; i++) {
            if ((i == 9) || (i == 19)) {
                System.out.print("\n" + gameboard[i] + "\n");
            } else {
                System.out.print(gameboard[i]);
            }
        }
    }

}
