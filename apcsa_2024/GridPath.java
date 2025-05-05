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

public class GridPath {
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public GridPath(int[][] arr) {
        this.grid = arr;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        /* to be implemented in part (a) */
        if (row + 1 >= grid.length) {
            return new Location(row, col + 1);
        } else if (col + 1 >= grid[0].length) {
            return new Location(row + 1, col);
        } else {
            if (grid[row + 1][col] < grid[row][col + 1])
                return new Location(row + 1, col);
            else
                return new Location(row, col + 1);
        }
    }

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        /* to be implemented in part (b) */
        int sum = 0;
        while (row != grid.length - 1 || col != grid[0].length - 1) {
            sum += grid[row][col];
            Location l = getNextLoc(row, col);
            row = l.getRow();
            col = l.getCol();
        }

        sum += grid[grid.length - 1][grid[0].length - 1];

        return sum;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        // int[][] arr = {
        // { 12, 3, 4, 13, 5 },
        // { 11, 21, 2, 14, 16 },
        // { 7, 8, 9, 15, 0 },
        // { 10, 17, 20, 19, 1 },
        // { 18, 22, 30, 25, 6 }
        // };
        // GridPath gp = new GridPath(arr);
        // Location l = gp.getNextLoc(0, 0);
        // System.out.println(l.getRow() + "-" + l.getCol());
        // l = gp.getNextLoc(1, 3);
        // System.out.println(l.getRow() + "-" + l.getCol());
        // l = gp.getNextLoc(2, 4);
        // System.out.println(l.getRow() + "-" + l.getCol());
        // l = gp.getNextLoc(4, 3);
        // System.out.println(l.getRow() + "-" + l.getCol());

        int[][] arr = {
                { 12, 30, 40, 25, 5 },
                { 11, 3, 22, 15, 43 },
                { 7, 2, 9, 4, 0 },
                { 8, 33, 18, 6, 1 }
        };
        GridPath gp = new GridPath(arr);
        System.out.println(gp.sumPath(1, 1));

    }
}