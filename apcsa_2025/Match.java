public class Match {
    private Competitor first;
    private Competitor second;

    public Match(Competitor one, Competitor two) {
        /* implementation not shown */
        this.first = one;
        this.second = two;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public Competitor getFirstCompetitor() {
        return first;
    }

    public Competitor getSecondCompetitor() {
        return second;
    }
}
