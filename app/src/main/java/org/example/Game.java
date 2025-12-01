package org.example;

public class Game {

    public void startGame() {
        int num = Player.gameType();
        if (num == 1) {
            HvH game = new HvH();
            game.startGame();
        } else if (num == 2) {
            HvC game = new HvC();
            game.startGame();
        } else if (num == 3) {
            CvH game = new CvH();
            game.startGame();
        }
    }
    
}
