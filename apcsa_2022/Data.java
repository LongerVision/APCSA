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

package apcsa_2022;

public class Data {
    public static final int MAX = 100;
    private int[][] grid;

    public Data(int rows, int cols) {
        grid = new int[rows][cols];
    }

    public Data(int[][] d) {
        this.grid = d;
    }

    public void printGrid() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Fills all elements of grid with randomly generated values, as described in
     * part ( a)
     * Precondition: grid is not null.* grid has at least one element.
     */
    public void repopulate() {
        /* to be implemented in part (a) */
        // [0.0, 1.0)*MAX=>(int)[0.0, MAX.0)=>[0, MAX)+1=>[1,MAX]
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int value = (int) (Math.random() * Data.MAX) + 1;
                while (!(value % 10 == 0 && value % 100 != 0))
                    value = (int) (Math.random() * Data.MAX) + 1;
                grid[r][c] = value;
            }
        }

    }

    /**
     * Returns the number of columns in grid that are in increasing order, as
     * described
     * in part (b)
     * Precondition: grid is not null.* grid has at least one element.
     */
    public int countIncreasingCols() {
        /* to be implemented in part (b) */
        int count = 0;
        for (int c = 0; c < grid[0].length; c++) {
            boolean increasingOrNot = true;
            for (int r = 1; r < grid.length; r++) {
                if (grid[r][c] < grid[r - 1][c]) {
                    increasingOrNot = false;
                    break;
                }
            }
            if (increasingOrNot)
                count++;
        }

        return count;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        // Data d = new Data(2, 4);
        // d.printGrid();
        // System.out.println();
        // d.repopulate();
        // d.printGrid();
        // int[][] arr = {
        // { 10, 50, 40 },
        // { 20, 40, 20 },
        // { 30, 50, 30 }
        // };
        int[][] arr = {
                { 10, 540, 440, 440 },
                { 220, 450, 440, 190 }
        };
        Data d = new Data(arr);
        System.out.println(d.countIncreasingCols());

    }
}
