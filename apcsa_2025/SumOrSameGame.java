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

public class SumOrSameGame {
    private int[][] puzzle;

    public SumOrSameGame(int[][] arr) {
        this.puzzle = arr;
    }

    /***
     * Creates a two-dimensional array and fills it with random integers,* as
     * described in part (a)* Precondition: numRows > 0; numCols > 0
     */
    public SumOrSameGame(int numRows, int numCols) {
        /* to be implemented in part (a) */
        puzzle = new int[numRows][numCols];
        // r=Math.random() => [0.0, 1.0)
        // (int)(r*9) [0.0, 0.0) [0, 8]+1
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                puzzle[r][c] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    /***
     * Identifies and clears an element of puzzle that can be paired with* the
     * element at the given row and column, as described in part (b)* Preconditions:
     * row and col are valid row and column indices in puzzle.* The element at the
     * given row and column is between 1 and 9, inclusive.
     */
    public boolean clearPair(int row, int col) {
        /* to be implemented in part (b) */
        for (int r = row; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                if (r != row || c != col) {
                    if ((puzzle[row][col] == puzzle[r][c]) || (puzzle[row][col] + puzzle[r][c] == 10)) {
                        puzzle[row][col] = 0;
                        puzzle[r][c] = 0;
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void printPuzzle() {
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                System.out.print(puzzle[r][c] + " ");
            }
            System.out.println();
        }
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public static void main(String[] args) {
        // SumOrSameGame sosg = new SumOrSameGame(4, 5);
        // sosg.printPuzzle();
        // int[][] arr = {
        // { 0, 7, 9, 0 },
        // { 7, 4, 1, 6 },
        // { 8, 4, 1, 8 }
        // };
        // int[][] arr = {
        // { 8, 1, 0, 5 },
        // { 0, 4, 3, 6 },
        // { 3, 4, 5, 8 }
        // };
        int[][] arr = {
                { 1, 7, 9 },
                { 2, 6, 5 },
                { 4, 4, 4 }
        };

        SumOrSameGame sosg = new SumOrSameGame(arr);
        boolean b = sosg.clearPair(0, 2);
        System.out.println(b);
        sosg.printPuzzle();
    }
}
