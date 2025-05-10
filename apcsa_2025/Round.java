package apcsa_2025;

import java.util.ArrayList;

public class Round {
    /** The list of competitors participating in this round */
    private ArrayList<Competitor> competitorList;

    /** Initializes competitorList, as described in part (a) */
    public Round(String[] names) {
        /* to be implemented in part (a) */
        this.competitorList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            this.competitorList.add(new Competitor(names[i], i + 1));
        }
    }

    /***
     * Creates an ArrayList of Match objects for the next round* of the tournament,
     * as described in part (b)* Preconditions: competitorList contains at least one
     * element.* competitorList is ordered from best to worst rank.* Postcondition:
     * competitorList is unchanged.
     */
    public ArrayList<Match> buildMatches() {
        /* to be implemented in part (b) */
        ArrayList<Match> res = new ArrayList<>();
        int nbOfCompetitors = this.competitorList.size();
        if (nbOfCompetitors % 2 == 0) {
            for (int i = 0; i < nbOfCompetitors / 2; i++) {
                res.add(new Match(this.competitorList.get(i), this.competitorList.get(nbOfCompetitors - i - 1)));
            }
        } else {
            for (int i = 1; i < (nbOfCompetitors + 1) / 2; i++) {
                res.add(new Match(this.competitorList.get(i), this.competitorList.get(nbOfCompetitors - i)));
            }
        }

        return res;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public void printCompetitors() {
        for (Competitor c : competitorList)
            System.out.println(c.getName() + "-" + c.getRank());
    }

    public static void main(String[] args) {
        // String[] players = { "Alex", "Ben", "Cara" };
        String[] players = { "Jack", "Rei", "Sam", "Vi", "Tim" };
        Round r = new Round(players);
        // r.printCompetitors();

        ArrayList<Match> am = r.buildMatches();
        for (Match m : am) {
            Competitor c1 = m.getFirstCompetitor();
            Competitor c2 = m.getSecondCompetitor();
            System.out.println(c1.getName() + "-" + c1.getRank());
            System.out.println(c2.getName() + "-" + c2.getRank());
            System.out.println("-------");
        }
    }
}
