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

public class ArrayTester {
    /**
     * Returns an array containing the elements of column c of arr2D in the same
     * order as
     * they appear in arr2D.
     * Precondition: c is a valid column index in arr2D.
     * Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {
        /* to be implemented in part (a) */
        int[] res = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++)
            res[r] = arr2D[r][c];
        return res;
    }

    /**
     * Returns true if and only if every value in arr1 appears in arr2.
     * Precondition: arr1 and arr2 have the same length.
     * Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        /* implementation not shown */
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }

        return true;
    }

    /**
     * Returns true if arr contains any duplicate values;
     * false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        /* implementation not shown */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    /**
     * Returns true if square is a Latin square as described in part (b);
     * false otherwise.
     * Precondition: square has an equal number of rows and columns.
     * square has at least one row.
     */
    public static boolean isLatin(int[][] square) {
        /* to be implemented in part (b) */
        if (ArrayTester.containsDuplicates(square[0]))
            return false;

        for (int r = 1; r < square.length; r++) {
            if (!ArrayTester.hasAllValues(square[0], square[r]))
                return false;
        }

        for (int c = 0; c < square[0].length; c++) {
            int[] col = ArrayTester.getColumn(square, c);
            if (!ArrayTester.hasAllValues(square[0], col))
                return false;
        }

        return true;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // int[][] arr2D = { { 0, 1, 2 },
        // { 3, 4, 5 },
        // { 6, 7, 8 },
        // { 9, 5, 3 } };
        // int[] result = ArrayTester.getColumn(arr2D, 1);
        // ArrayTester.printArray(result);
        // int[][] arr2D = {
        // { 1, 2, 3 },
        // { 2, 3, 1 },
        // { 3, 1, 2 }
        // };
        // int[][] arr2D = {
        // { 10, 30, 20, 0 },
        // { 0, 20, 30, 10 },
        // { 30, 0, 10, 20 },
        // { 20, 10, 0, 30 }
        // };
        int[][] arr2D = {
                { 1, 2 },
                { 1, 2 }
        };
        System.out.println(ArrayTester.isLatin(arr2D));
    }
}
