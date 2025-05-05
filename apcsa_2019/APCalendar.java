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

public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year) {
        /* implementation not shown */
        if (year == 2017 || year == 2019)
            return false;
        if (year == 2016)
            return true;

        return false;
    }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        /* to be implemented in part (a) */
        int counter = 0;
        for (int i = year1; i <= year2; i++) {
            if (APCalendar.isLeapYear(i))
                counter++;
        }
        return counter;
    }

    /**
     * Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year) {
        /* implementation not shown */
        if (year == 2019)
            return 2;

        return 0;
    }

    /**
     * Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        /* implementation not shown */
        int days = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    days += 31;
                    break;
                case 2: {
                    if (APCalendar.isLeapYear(year))
                        days += 29;
                    else
                        days += 28;
                }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
            }
        }

        return days + day;

    }

    public static int dayOfWeek(int month, int day, int year) {
        /* to be implemented in part (b) */
        int d = APCalendar.firstDayOfYear(year);
        int days = APCalendar.dayOfYear(month, day, year);

        return ((d + days - 1) % 7);
    }

    // There may be

    public static void main(String[] args) {
        // System.out.println(APCalendar.dayOfYear(3, 1, 2017));
        // System.out.println(APCalendar.dayOfYear(3, 1, 2016));
        System.out.println(APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println(APCalendar.dayOfWeek(1, 10, 2019));
    }

}