package game;

public abstract class GameState {
    public GameState(Game game){
        this.game = game;
    }
    public Game game;
    public abstract void addPoints(int point);
    public abstract void checkForUpgrade();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
