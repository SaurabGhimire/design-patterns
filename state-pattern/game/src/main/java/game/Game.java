package game;

import java.util.Random;

public class 	Game {
	 private int totalPoints = 0;
	 private GameState level;

	 public Game(){
		 level = new Level1(this);
	 }

	public void play() {
		Random random = new Random();
		addPoints(random.nextInt(7));
		System.out.println("points="+totalPoints+" level="+level);
	}

	public void addPoints(int newPoints) {
		level.addPoints(newPoints);
	}

	public GameState getLevel() {
		return level;
	}

	public void setLevel(GameState level) {
		this.level = level;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
}
