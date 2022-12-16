package in.gmsk.springbootapp;

import in.gmsk.springbootapp.game.GameRunner;
import in.gmsk.springbootapp.game.MarioGame;
import in.gmsk.springbootapp.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var supercontragame = new SuperContraGame();

        var gameRunner = new GameRunner(supercontragame);
        gameRunner.run();
    }
}
