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

public class Location {
    private int theRow;
    private int theCol;

    public Location(int r, int c) {
        theRow = r;
        theCol = c;
    }

    public int getRow() {
        return theRow;
    }

    public int getCol() {
        return theCol;
    }
}