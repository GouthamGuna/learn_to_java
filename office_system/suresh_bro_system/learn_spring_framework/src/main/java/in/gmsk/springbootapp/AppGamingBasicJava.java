package in.gmsk.springbootapp;

import in.gmsk.springbootapp.game.GameRunner;
import in.gmsk.springbootapp.game.MarioGame;
import in.gmsk.springbootapp.game.PacGame;
import in.gmsk.springbootapp.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
