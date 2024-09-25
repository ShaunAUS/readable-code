package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Beginner;

public class GameApplication {

    public static void main(String[] args) {
        Beginner beginner = new Beginner();
        MineSweeper mineSweeper = new MineSweeper(beginner);
        mineSweeper.run();
    }

}