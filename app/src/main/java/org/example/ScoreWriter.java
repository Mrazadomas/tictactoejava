package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreWriter {
    private static BufferedWriter writer;

    public ScoreWriter() {
        try {
            writer = new BufferedWriter(new FileWriter("game.txt"));
        } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void writeScore() {
        try {
            writer.write(Scoreboard.Oscore());
            writer.newLine();
            writer.write(Scoreboard.Xscore());
            writer.newLine();
            writer.write(Scoreboard.ties());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

