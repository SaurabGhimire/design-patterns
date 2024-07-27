package game;

public class Level2 extends  GameState{
    public Level2(Game game){
        super(game);
    }
    @Override
    public void addPoints(int newPoints) {
        int totalPoints = game.getTotalPoints() + 2 * newPoints;
        game.setTotalPoints(totalPoints);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if (game.getTotalPoints() > 15) { // move to level 3
            GameState level = new Level2_5(game);
            game.setLevel(level);
            int totalPoints = game.getTotalPoints() + 1; //add 2 bonus points
            game.setTotalPoints(totalPoints);
        }
    }
}
