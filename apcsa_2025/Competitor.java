package apcsa_2025;

public class Competitor {
    /** The competitor’s name and rank */
    private String name;
    private int rank;

    /***
     * Assigns n to name and initialRank to rank* Precondition: initialRank >= 1
     */
    public Competitor(String n, int initialRank) {
        /* implementation not shown */
        this.name = n;
        this.rank = initialRank;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
