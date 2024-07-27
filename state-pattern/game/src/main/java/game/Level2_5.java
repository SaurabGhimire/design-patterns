package game;

public class Level2_5 extends GameState{
    public Level2_5(Game game){
        super(game);
    }
    @Override
    public void addPoints(int point) {

    }
    @Override
    public void checkForUpgrade() {
        if (game.getTotalPoints() > 20) { // move to level 3
            GameState level3 = new Level3(game);
            game.setLevel(level3);
            int totalPoints = game.getTotalPoints() + 2; //add 2 bonus points
            game.setTotalPoints(totalPoints);
        }
    }
}
