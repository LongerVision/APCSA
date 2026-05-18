/*******************************************************************************
 * *
 * *
 * IMPORTANT: READ BEFORE DOWNLOADING, COPYING AND USING. *
 * *
 * *
 * Copyright [2016~2026] [Longer Vision Technology (Canada) Ltd.] *
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
 * Create Date: 2026-05-17 *
 *******************************************************************************/

public class GameBoard {
    private Space[][] board;

    public GameBoard(int rows, int cols) {
        board = new Space[rows][cols];
    }

    /***
     * Returns the point value of the row in board specified by the* parameter. The
     * point value is the sum of the points in the row,* or two times the sum of the
     * points in the row if all spaces in* the row are the same color.*
     * Preconditions: No elements of board are null.* board has at least two rows
     * and* at least two columns.* targetRow is a valid row index.
     */
    public int getPointsForRow(int targetRow) {
        /* to be implemented */
        boolean sameColorOrNot = true;
        int ps = board[targetRow][0].getPoints();
        String c = board[targetRow][0].getColor();
        for (int r = 1; r < board[0].length; r++) {
            if (!c.equals(board[targetRow][r].getColor())) {
                sameColorOrNot = false;
            }
            ps += board[targetRow][r].getPoints();
        }

        if (sameColorOrNot)
            return ps * 2;
        else
            return ps;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public static void main(String[] args) {
        GameBoard gb = new GameBoard(4, 5);
        gb.board[0][0] = new Space("orange", 100);
        gb.board[0][1] = new Space("red", 100);
        gb.board[0][2] = new Space("blue", 500);
        gb.board[0][3] = new Space("green", 500);
        gb.board[0][4] = new Space("red", 100);
        gb.board[1][0] = new Space("red", 300);
        gb.board[1][1] = new Space("blue", 200);
        gb.board[1][2] = new Space("blue", 400);
        gb.board[1][3] = new Space("red", 100);
        gb.board[1][4] = new Space("gree", 100);
        gb.board[2][0] = new Space("red", 200);
        gb.board[2][1] = new Space("red", 300);
        gb.board[2][2] = new Space("red", 100);
        gb.board[2][3] = new Space("red", 200);
        gb.board[2][4] = new Space("red", 200);
        gb.board[3][0] = new Space("green", 100);
        gb.board[3][1] = new Space("blue", 100);
        gb.board[3][2] = new Space("blue", 200);
        gb.board[3][3] = new Space("blue", 100);
        gb.board[3][4] = new Space("blue", 200);

        System.out.println(gb.getPointsForRow(0));
        System.out.println(gb.getPointsForRow(2));
    }
}