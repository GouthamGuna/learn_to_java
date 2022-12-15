package in.gmsk.springbootapp;

import in.gmsk.springbootapp.game.GameRunner;
import in.gmsk.springbootapp.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
