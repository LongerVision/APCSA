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

package apcsa_2023;

import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    public WeatherData(double[] dArr) {
        temperatures = new ArrayList<>();
        for (double d : dArr)
            temperatures.add(d);
    }

    /**
     * * Cleans the data by removing from temperatures all values that are less than
     * lower and all values that are greater than upper, as described in part (a)
     */
    public void cleanData(double lower, double upper) {
        /* to be implemented in part (a) */
        for (int i = temperatures.size() - 1; i >= 0; i--) {
            double t = temperatures.get(i);
            if (t < lower || t > upper)
                temperatures.remove(i);
        }
    }

    /**
     * * Returns the length of the longest heat wave found in temperatures, as
     * described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on
     * threshold.
     */
    public int longestHeatWave(double threshold) {
        /* to be implemented in part (b) */
        return 0;
    }

    public void printValidData() {
        for (Double t : temperatures)
            System.out.print(t + " ");
        System.out.println();
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        double[] dArr = { 99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5 };
        WeatherData wd = new WeatherData(dArr);
        wd.cleanData(85.0, 120.0);
    }
}