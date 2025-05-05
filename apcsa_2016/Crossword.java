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
 * Create Date: 2025-05-04 *
 *******************************************************************************/

package apcsa_2016;

public class Crossword {
    /**
     * Each element is a Square object with a color (black or white) and a number.
     * puzzle[r][c] represents the square in row r, column c.
     * There is at least one row in the puzzle.
     */
    private Square[][] puzzle;

    /**
     * Constructs a crossword puzzle grid.
     * Precondition: There is at least one row in blackSquares.
     * Postcondition:
     * - The crossword puzzle grid has the same dimensions as blackSquares.
     * - The Square object at row r, column c in the crossword puzzle grid is black
     * if and only if blackSquares[r][c] is true.
     * - The squares in the puzzle are labeled according to the crossword labeling
     * rule.
     */
    public Crossword(boolean[][] blackSquares) {
        /* to be implemented in part (b) */
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int value = 1;
        for (int r = 0; r < blackSquares.length; r++) {
            for (int c = 0; c < blackSquares[0].length; c++) {
                if (toBeLabeled(r, c, blackSquares))
                    puzzle[r][c] = new Square(false, value++);
                else
                    puzzle[r][c] = new Square(true, 0);
            }
        }
    }

    /**
     * Returns true if the square at row r, column c should be labeled with a
     * positive number;
     * false otherwise.
     * The square at row r, column c is black if and only if blackSquares[r][c] is
     * true.
     * Precondition: r and c are valid indexes in blackSquares.
     */
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        /* to be implemented in part (a) */
        if (blackSquares[r][c])
            return false;

        if (r - 1 < 0 || c - 1 < 0)
            return true;

        return blackSquares[r - 1][c] || blackSquares[r][c - 1];
    }

    public void printPuzzle() {
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                System.out.print(puzzle[r][c].getNum() + " ");
            }
            System.out.println();
        }
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        boolean[][] bs = {
                { true, false, false, true, true, true, false, false, false },
                { false, false, false, false, true, false, false, false, false },
                { false, false, false, false, false, false, true, true, true },
                { false, false, true, false, false, false, true, false, false },
                { true, true, true, false, false, false, false, false, false },
                { false, false, false, false, true, false, false, false, false },
                { false, false, false, true, true, true, false, false, true }
        };

        Crossword cw = new Crossword(bs);
        cw.printPuzzle();
    }
}
