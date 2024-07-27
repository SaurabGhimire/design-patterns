package game;

public class Level1 extends GameState{

    public Level1(Game game){
        super(game);
    }
    @Override
    public void addPoints(int points) {
        int newPoints = game.getTotalPoints() + points;
        game.setTotalPoints(newPoints);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if (game.getTotalPoints() > 10) { // move to level 2
            GameState newLevel = new Level2(game);
            game.setLevel(newLevel);
            game.setTotalPoints(game.getTotalPoints() + 1); // bonus points
        }
    }
}
