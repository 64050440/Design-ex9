public class Game {
    private GameStrategy gameStrategy;

    public Game(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void play() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}
