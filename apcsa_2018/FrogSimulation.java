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
 * Create Date: 2025-05-02 *
 *******************************************************************************/

package apcsa_2018;

public class FrogSimulation {
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    private int[] hds;
    private static int idx = 0;

    /**
     * Constructs a FrogSimulation where dist is the distance, in inches, from the
     * starting
     * position to the goal, and numHops is the maximum number of hops allowed to
     * reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops, int[] hds) {
        goalDistance = dist;
        maxHops = numHops;
        this.hds = hds;
    }

    /**
     * Returns an integer representing the distance, in inches, to be moved when the
     * frog hops.
     */
    private int hopDistance() {
        /* implementation not shown */
        // return 0;
        return hds[FrogSimulation.idx];
    }

    /**
     * Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the
     * simulation;
     * false otherwise.
     */
    public boolean simulate() {
        /* to be implemented in part (a) */
        int distance = 0;
        for (int i = 0; i < maxHops; i++) {
            FrogSimulation.idx = i;
            distance += hopDistance();
            if (distance >= goalDistance)
                return true;
            if (distance < 0)
                return false;
        }

        return false;
    }

    /**
     * Runs num simulations and returns the proportion of simulations in which the
     * frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b) */
        int trueTimes = 0;
        for (int i = 0; i < num; i++) {
            if (simulate())
                trueTimes++;
        }

        return (double) trueTimes / num;
    }

    public static void main(String[] args) {
        int[] dists = { 5, 4, 2, 4, 3 };
        FrogSimulation sim = new FrogSimulation(24, 5, dists);
        System.out.println(sim.simulate());
        // System.out.println((double) 100 / (double) 400);
    }
}
