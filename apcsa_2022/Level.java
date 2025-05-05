package apcsa_2022;

public class Level {
    private boolean goalReached;
    private int points;

    public Level(boolean goalReachedOrNot, int pts) {
        this.goalReached = goalReachedOrNot;
        this.points = pts;
    }

    /**
     * Returns true if the player reached the goal on this level and returns false
     * otherwise
     */
    public boolean goalReached() {
        /* implementation not shown */
        return goalReached;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints() {
        /* implementation not shown */
        return points;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
}
