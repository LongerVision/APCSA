package apcsa_2022;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /** Postcondition: All instance variables have been initialized. */
    public Game() {
        /* implementation not shown */ }

    public void setLevelOne(Level l) {
        this.levelOne = l;
    }

    public void setLevelTwo(Level l) {
        this.levelTwo = l;
    }

    public void setLevelThree(Level l) {
        this.levelThree = l;
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus() {
        /* implementation not shown */
        return false;
    }

    /**
     * Simulates the play of this Game (consisting of three levels) and updates all
     * relevant
     * game data
     */
    public void play() {
        /* implementation not shown */ }

    /**
     * Returns the score earned in the most recently played game, as described in
     * part ( a)
     */
    public int getScore() {
        /* to be implemented in part (a) */
        int scoreLevel1 = 0;
        int scoreLevel2 = 0;
        int scoreLevel3 = 0;
        if (this.levelOne.goalReached()) {
            scoreLevel1 = this.levelOne.getPoints();
            if (this.levelTwo.goalReached()) {
                scoreLevel2 = this.levelTwo.getPoints();
                if (this.levelThree.goalReached()) {
                    scoreLevel3 = this.levelThree.getPoints();
                }
            }
        }
        int sum = scoreLevel1 + scoreLevel2 + scoreLevel3;
        return isBonus() ? 3 * sum : sum;
    }

    /**
     * Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        /* to be implemented in part (b) */
        // int[] scores = { 75, 50, 90, 20 };
        int highestScore = -1;
        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            // int score = scores[i];
            if (highestScore < score)
                highestScore = score;
        }

        return highestScore;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        Game g = new Game();
        g.setLevelOne(new Level(false, 200));
        g.setLevelTwo(new Level(true, 100));
        g.setLevelThree(new Level(true, 500));

        // System.out.println(g.getScore());
        System.out.println(g.playManyTimes(4));
    }
}
