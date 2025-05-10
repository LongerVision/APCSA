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

public class DogWalker {
    /** The maximum number of dogs this walker can walk simultaneously per hour */
    private int maxDogs;

    /** The dog-walking company this dog walker is associated with */
    private DogWalkCompany company;

    public DogWalker(int md) {
        this.maxDogs = md;
        this.company = new DogWalkCompany();
    }

    /*** Assigns max to maxDogs and comp to company* Precondition: max > 0 */
    public DogWalker(int max, DogWalkCompany comp) {
        /* implementation not shown */
    }

    /***
     * Takes at least one dog for a walk during the time specified by* hour, as
     * described in part (a)* Preconditions: 0 <= hour <= 23* maxDogs > 0
     */
    public int walkDogs(int hour) {
        /* to be implemented in part (a) */
        int dogsToBeWalked = this.company.numAvailableDogs(hour);
        int dogsWalked = dogsToBeWalked <= this.maxDogs ? dogsToBeWalked : this.maxDogs;

        this.company.updateDogs(hour, dogsWalked);

        return dogsWalked;
    }

    /***
     * Performs an entire dog-walking shift and returns the amount* earned, in
     * dollars, as described in part (b)* Preconditions: 0 <= startHour <= endHour
     * <= 23* maxDogs > 0
     */
    public int dogWalkShift(int startHour, int endHour) {
        /* to be implemented in part (b) */
        int earned = 0;
        int wd = 0;
        for (int i = startHour; i <= endHour; i++) {
            wd = this.walkDogs(i);
            if (wd == this.maxDogs || (9 <= i && i <= 17))
                earned += 5 * wd + 3;
            else
                earned += 5 * wd;
        }

        return earned;
    }

    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public static void main(String[] args) {
        DogWalker dw = new DogWalker(3);
        System.out.println(dw.dogWalkShift(7, 10));
    }
}
