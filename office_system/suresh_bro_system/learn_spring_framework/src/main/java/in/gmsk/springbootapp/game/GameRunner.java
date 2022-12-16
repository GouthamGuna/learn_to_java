package in.gmsk.springbootapp.game;

public class GameRunner {

    private SuperContraGame game;

    public GameRunner(SuperContraGame game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Game Running : "+game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
