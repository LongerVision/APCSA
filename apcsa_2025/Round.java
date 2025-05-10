
/*******************************************************************************
 * *
 * *
 * IMPORTANT: READ BEFORE DOWNLOADING, COPYING AND USING. *
 * *
 * *
 * Copyright [2016~2025] [Longer Vision Technology (Canada) Ltd.] *
 * Licensed under the Educational Community License, Version 2.0 *
 * you may not use this file except in compliance with the License. *
 * *
 * *
 * "AP Computer Science A is an Advanced Placement course, an introductory *
 * college-level computer science course offered by the College Board. It *
 * focuses on object-oriented programming using the Java language, teaching *
 * students to design, implement, and test computer programs, as well as
 * explore concepts like data structures and algorithms. ." -- Cited from *
 * https://apstudents.collegeboard.org/courses/ap-computer-science-a *
 * *
 * *
 * All APCSA Free Response code is distributed on an "AS IS" BASIS, WITHOUT *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. *
 * And all rights are reserved to Longer Vision Technology (Canada) Ltd. *
 * You can use it, modify it, test the result, etc., but you are NOT *
 * allowed to redistributed it. However, you are encouraged to advertise *
 * for Longer Vision Technology (LVT). *
 * *
 * *
 * For those young talents who are interested in LVT course design, *
 * particularly, CCC Senior level competition, CCO (Canadian Computing *
 * Olympiad), AP (Advanced Placement), etc., please do NOT hesitate to *
 * find the contact via our website at: http://www.longervision.ca . *
 * *
 * Version: 1.0.0 *
 * Author: Pei, Jia *
 * Contact: jiapei@longervision.com *
 * URL: http://www.longervision.ca *
 * Create Date: 2025-05-09 *
 *******************************************************************************/

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
