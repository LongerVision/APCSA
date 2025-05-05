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
 * Create Date: 2025-04-30 *
 *******************************************************************************/

package apcsa_2023;

public class BoxOfCandy {
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    public BoxOfCandy() {
        // box = new Candy[4][3];
        // for (int r = 0; r < box.length; r++) {
        // for (int c = 0; c < box[0].length; c++) {
        // box[r][c] = null;
        // }
        // }

        // box[0][1] = new Candy("lime");
        // box[1][1] = new Candy("orange");
        // box[2][2] = new Candy("cherry");
        // box[3][1] = new Candy("lemon");
        // box[3][2] = new Candy("grape");

        box = new Candy[3][5];
        for (int r = 0; r < box.length; r++) {
            for (int c = 0; c < box[0].length; c++) {
                box[r][c] = null;
            }
        }
        box[0][0] = new Candy("lime");
        box[0][1] = new Candy("lime");
        box[0][3] = new Candy("lemon");
        box[1][0] = new Candy("orange");
        box[1][3] = new Candy("lime");
        box[1][4] = new Candy("lime");
        box[2][0] = new Candy("cherry");
        box[2][2] = new Candy("lemon");
        box[2][4] = new Candy("orange");
    }

    public Candy[][] getBox() {
        return box;
    }

    /**
     * * Moves one piece of candy in column col, if necessary and possible, so that
     * the box * element in row 0 of column col contains a piece of candy, as
     * described in part (a).
     * Returns false if there is no piece of candy in column col and returns true
     * otherwise.
     * Precondition: col is a valid column index in box.
     */
    public boolean moveCandyToFirstRow(int col) {
        /* to be implemented in part (a) */
        if (box[0][col] != null)
            return true;

        for (int r = 1; r < box.length; r++) {
            if (box[r][col] != null) {
                box[0][col] = box[r][col];
                box[r][col] = null;
                return true;
            }
        }

        return false;
    }

    /**
     * * Removes from box and returns a piece of candy with flavor specified by the
     * parameter, or
     * returns null if no such piece is found, as described in part (b)
     */
    public Candy removeNextByFlavor(String flavor) {
        /* to be implemented in part (b) */
        for (int r = box.length - 1; r >= 0; r--) {
            for (int c = 0; c < box[0].length; c++) {
                if (box[r][c] != null) {
                    if (box[r][c].getFlavor().equals(flavor)) {
                        Candy res = box[r][c];
                        box[r][c] = null;
                        return res;
                    }
                }
            }
        }

        return null;

    } // There may be instance variables, constructors, and methods that are not
      // shown.

    public static void main(String[] args) {
        BoxOfCandy boc = new BoxOfCandy();
        // System.out.println(boc.moveCandyToFirstRow(0));
        // System.out.println(boc.moveCandyToFirstRow(1));
        // System.out.println(boc.moveCandyToFirstRow(2));
        // if (boc.getBox()[0][2] != null)
        // System.out.println(boc.getBox()[0][2].getFlavor());
        // if (boc.getBox()[2][2] != null)
        // System.out.println(boc.getBox()[2][2].getFlavor());
        // else
        // System.out.println("2-2 is empty.");
        Candy cd = boc.removeNextByFlavor("cherry");
        System.out.println(cd.getFlavor());
        if (boc.getBox()[2][0] == null)
            System.out.println("Good");

        cd = boc.removeNextByFlavor("lime");
        System.out.println(cd.getFlavor());
        if (boc.getBox()[1][3] == null)
            System.out.println("Good");
    }
}
