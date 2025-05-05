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
 * Create Date: 2025-05-03 *
 *******************************************************************************/

package apcsa_2017;

public class Position {
    /** Constructs a Position object with row r and column c. */
    private int r;
    private int c;

    public Position(int r, int c) {
        /* implementation not shown */
        this.r = r;
        this.c = c;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

    public void printPosition() {
        System.out.print("(" + this.r + "," + this.c + ")");
    }

    public static Position findPosition(int num, int[][] intArr) {
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[0].length; c++) {
                if (intArr[r][c] == num)
                    return new Position(r, c);
            }
        }

        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] res = new Position[intArr.length][intArr[0].length];
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[0].length; c++) {
                Position p = Position.findPosition(intArr[r][c] + 1, intArr);
                res[r][c] = p;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 15, 5, 9, 10 },
                { 12, 16, 11, 6 },
                { 14, 8, 13, 7 }
        };
        // Position res = Position.findPosition(8, arr);
        // res.printPosition();
        // res = Position.findPosition(17, arr);
        // if (res != null)
        // res.printPosition();
        // else
        // System.out.println("The result is null.");
        Position[][] res = Position.getSuccessorArray(arr);
        for (int r = 0; r < res.length; r++) {
            for (int c = 0; c < res[0].length; c++) {
                if (res[r][c] != null) {
                    res[r][c].printPosition();
                    System.out.print(" ");
                } else {
                    System.out.print("null ");
                }
            }
            System.out.println();
        }
    }
}
