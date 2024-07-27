package game;

public class Level3 extends GameState{
    public Level3(Game game){
        super(game);
    }

    @Override
    public void addPoints(int point) {
        int totalPoints = game.getTotalPoints() + 3 * point;
        game.setTotalPoints(totalPoints);
    }

    @Override
    public void checkForUpgrade() {
    }
}
