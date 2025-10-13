package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void tests() {
    //this is a winning board, 1st column filled
    //decided that the only apporpriate tests would be tests to verifying
    //logic is correct, like the check wins and any chekcing for open
    //tiles, any other functions that require user input were tested throug
    //the terminal.
        String[] win1board = {" ", "x", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", "x", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", "x", " |", " ", " ", " |", " ", " ", " "};

        //should be noted that checkWinx() and checkWino() are exactly the
        //same, copy and paste same, it is just how I decided to write the
        //game logic, therefore only one of them is being tested.
        assertEquals(Board.checkWinx(win1board), 1);

        String[] win2board = {" ", "x", " |", " ", "x", " |", " ", "x", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " "};
        assertEquals(Board.checkWinx(win2board), 1);
        
        String[] win3board = {" ", "x", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", "x", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", "x", " "};
        assertEquals(Board.checkWinx(win3board), 1);

        String[] win4board = {" ", " ", " |", " ", " ", " |", " ", "x", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", "x", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", "x", " |", " ", " ", " |", " ", " ", " "};
        assertEquals(Board.checkWinx(win4board), 1);
        
        String[] win5board = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", "x", " |", " ", "x", " |", " ", "x", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " "};
        assertEquals(Board.checkWinx(win5board), 1);

        String[] win6board = {" ", " ", " |", " ", "x", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", "x", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", "x", " |", " ", " ", " "};
        assertEquals(Board.checkWinx(win6board), 1);

        String[] win7board = {" ", " ", " |", " ", " ", " |", " ", "x", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", "x", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", "x", " "};
        assertEquals(Board.checkWinx(win7board), 1);

        String[] win8board = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", "x", " |", " ", "x", " |", " ", "x", " "};
        assertEquals(Board.checkWinx(win8board), 1);

        // tileCheck() and tileConversion() test, one cannot function
        // without the other as tileConversion is a helper function of tileCheck()
        String[] board = {" ", "x", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                          " ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                          " ", " ", " |", " ", " ", " |", " ", " ", " "};
        int tile = Board.tileConversion(1); //selecting and checking the top right tile
        assertEquals(Board.tileCheck(tile, board), false); //should return false for occupied tile
        int tile2 = Board.tileConversion(7); //selecting and checking the top right tile
        assertEquals(Board.tileCheck(tile2, board), true); //should return true for open tile
  }
}
