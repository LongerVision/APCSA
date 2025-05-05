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

package apcsa_2019;

public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                // [0.0, 1.0) => [0.0, 0.4), [0.4, 1.0)
                lights[r][c] = Math.random() < 0.4;
            }
        }
    }

    public LightBoard(boolean[][] b) {
        this.lights = b;
    }

    public boolean evaluateLight(int row, int col) {
        int counter = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col])
                counter++;
        }

        if (lights[row][col]) {
            if (counter % 2 == 0)
                return false;
        } else {
            if (counter % 3 == 0)
                return true;
        }

        return lights[row][col];
    }

    public static void main(String[] args) {
        // LightBoard sim = new LightBoard(7, 5);

        boolean[][] b = {
                { true, true, false, true, true },
                { true, false, false, true, false },
                { true, false, false, true, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, true, false, true, true },
                { false, false, false, false, false }
        };

        LightBoard sim = new LightBoard(b);
        System.out.println(sim.evaluateLight(0, 3));
        System.out.println(sim.evaluateLight(6, 0));
        System.out.println(sim.evaluateLight(4, 1));
        System.out.println(sim.evaluateLight(5, 4));
    }
}
