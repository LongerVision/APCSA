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
 * Create Date: 2026-05-15 *
 *******************************************************************************/

public class ItemInfo {
    private String name;
    private double cost;
    private boolean availableOrNot;

    // Wrapper class: Integer, Double, Boolean
    // Math: all methods are static, Math.random()
    // String

    public ItemInfo(String n, double c, boolean b) {
        this.name = n;
        this.cost = c;
        this.availableOrNot = b;
    }

    /** * Returns the name of the item */
    public String getName() {
        /* implementation not shown */
        return this.name;
    }

    /**
     * * Returns a value greater than 0.0 that represents the * cost of a single
     * unit of the item, in dollars
     */
    public double getCost() {
        /* implementation not shown */
        return this.cost;
    }

    /**
     * * Returns true if the item is currently available and * returns false
     * otherwise
     */
    public boolean isAvailable() {
        /* implementation not shown */
        return this.availableOrNot;
    }
    /*
     * There may be instance variables, constructors, and
     * methods that are not shown.
     */
}
