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

public class SingleTable {
    private int seats;
    private double viewquality;
    private int height;

    public SingleTable(int s, double v, int h) {
        this.seats = s;
        this.viewquality = v;
        this.height = h;
    }

    /**
     * Returns the number of seats at this table. The value is always greater than
     * or equal to 4.
     */
    public int getNumSeats() {
        /* implementation not shown */
        return this.seats;
    }

    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        /* implementation not shown */
        return this.height;
    }

    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        /* implementation not shown */
        return this.viewquality;
    }

    /** Sets the quality of the view from this table to value. */
    public void setViewQuality(double value) {
        /* implementation not shown */
        this.viewquality = value;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
