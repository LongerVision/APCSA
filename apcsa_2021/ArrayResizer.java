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
 * Create Date: 2025-05-01 *
 *******************************************************************************/

package apcsa_2021;

public class ArrayResizer {
    /**
     * Returns true if and only if every value in row r of array2D is non-zero.
     * Precondition: r is a valid row index in array2D.
     * Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        /* to be implemented in part (a) */
        for (int c = 0; c < array2D[0].length; c++) {
            if (array2D[r][c] == 0)
                return false;
        }
        return true;
    }

    /**
     * Returns the number of rows in array2D that contain all non-zero values.
     * Postcondition: array2D is unchanged.
     */
    public static int numNonZeroRows(int[][] array2D) {
        /* implementation not shown */
        int counter = 0;
        for (int r = 0; r < array2D.length; r++) {
            if (ArrayResizer.isNonZeroRow(array2D, r))
                counter++;
        }

        return counter;
    }

    /**
     * Returns a new, possibly smaller, two-dimensional array that contains only
     * rows
     * from array2D with no zeros, as described in part (b).
     * Precondition: array2D contains at least one column and at least one row with
     * no zeros.
     * Postcondition: array2D is unchanged.
     */
    public static int[][] resize(int[][] array2D) {
        /* to be implemented in part (b) */
        int rows = ArrayResizer.numNonZeroRows(array2D);
        if (rows == 0)
            return null;

        int[][] res = new int[rows][array2D[0].length];
        int idx = 0;
        for (int r = 0; r < array2D.length; r++) {
            if (ArrayResizer.isNonZeroRow(array2D, r)) {
                for (int c = 0; c < array2D[0].length; c++)
                    res[idx][c] = array2D[r][c];
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 }
        };

        // System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
        // System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
        // System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
        // System.out.println(ArrayResizer.isNonZeroRow(arr, 3));

        int[][] smaller = ArrayResizer.resize(arr);
        for (int[] row : smaller) {
            for (int cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }
}
