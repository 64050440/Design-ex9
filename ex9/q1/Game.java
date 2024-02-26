abstract class Game {
    // Template method
    final void play() {
        initializeGame();
        playingGame();
        showResult();
    }

    abstract void initializeGame();

    abstract void playingGame();

    abstract void showResult();
}
