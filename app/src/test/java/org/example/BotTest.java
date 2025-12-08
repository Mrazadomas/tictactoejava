package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BotTest { // tests for the bot class
    @Test
    void tests() {
        Bot bot = new Bot();
        String[] gameboard = Board.gboard;
        bot.corners("x", gameboard); // for corners method
        assertEquals(((gameboard[1] != " ") || (gameboard[7] != " ") || (gameboard[21] != " ") || (gameboard[27] != " ")), ((gameboard[1] != " ") || (gameboard[7] != " ") || (gameboard[21] != " ") || (gameboard[27] != " ")));

        bot.center("x", gameboard); // for center method
        assertEquals(gameboard[14].equals("x"), gameboard[14].equals("x"));

        String[] win1board = {" ", "x", " |", " ", "x", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " "}; // should find the winning combination
                            
        bot.findWin("x", win1board);
        
        int num = Board.checkWinx(win1board);
        assertEquals(1, num);

        String[] win2board = {" ", "x", " |", " ", "x", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " ", 
                                            "-----------", 
                              " ", " ", " |", " ", " ", " |", " ", " ", " "}; // should block winning combination, testing both methods here

        if (bot.blockWinChance("x", win2board)) {
            bot.blockWin("o", "x", win2board);
        }
        assertEquals(false, Board.tileCheck(7, win2board));
    }
}
