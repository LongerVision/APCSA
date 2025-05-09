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

public class AppointmentBook {
    /**
     * * Returns true if minute in period is available for an appointment and
     * returns
     * false otherwise
     * Preconditions: 1 <= period <= 8; 0 <= minute <= 59
     */
    private boolean isMinuteFree(int period, int minute) {
        /* implementation not shown */
        // if (period == 2) {
        // if (0 <= minute && minute <= 9)
        // return false;
        // else if (10 <= minute && minute <= 14)
        // return true;
        // else if (15 <= minute && minute <= 29)
        // return false;
        // else if (30 <= minute && minute <= 44)
        // return true;
        // else if (45 <= minute && minute <= 49)
        // return false;
        // else // [50, 59]
        // return true;
        // }
        switch (period) {
            case 2: {
                if (0 <= minute && minute <= 24)
                    return false;
                else if (25 <= minute && minute <= 29)
                    return true;
                else // [30, 59]
                    return false;
            }
            case 3: {
                if (0 <= minute && minute <= 14)
                    return true;
                else if (15 <= minute && minute <= 40)
                    return false;
                else // [41, 59]
                    return true;
            }
            case 4: {
                if (0 <= minute && minute <= 4)
                    return false;
                else if (5 <= minute && minute <= 29)
                    return true;
                else if (30 <= minute && minute <= 43)
                    return false;
                else // [4, 59]
                    return true;
            }
            default:
                return false;
        }
    }

    /**
     * * Marks the block of minutes that starts at startMinute in period and
     * is duration minutes long as reserved for an appointment
     * Preconditions: 1 <= period <= 8; 0 <= startMinute <= 59;
     * 1 <= duration <= 60
     */
    private void reserveBlock(int period, int startMinute, int duration) {
        /* implementation not shown */
    }

    /**
     * * Searches for the first block of duration free minutes during period, as
     * described in
     * part (a). Returns the first minute in the block if such a block is found or
     * returns -1 if no
     * such block is found.
     * Preconditions: 1 <= period <= 8; 1 <= duration <= 60
     */
    public int findFreeBlock(int period, int duration) {
        /* to be implemented in part (a) */
        int len = 0;
        int firstMinuteInBlock = 0;

        for (int i = 0; i < 60; i++) {
            if (isMinuteFree(period, i)) {
                len++;
                if (len >= duration)
                    return firstMinuteInBlock;
            } else {
                len = 0;
                firstMinuteInBlock = i + 1;
            }
        }

        return -1;
    }

    /**
     * * Searches periods from startPeriod to endPeriod, inclusive, for a block
     * of duration free minutes, as described in part (b). If such a block is found,
     * calls reserveBlock to reserve the block of minutes and returns true;
     * otherwise
     * returns false.
     * Preconditions: 1 <= startPeriod <= endPeriod <= 8; 1 <= duration <= 60
     */
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        /* to be implemented in part (b) */
        for (int i = startPeriod; i <= endPeriod; i++) {
            int startMinute = findFreeBlock(i, duration);
            if (startMinute >= 0) {
                reserveBlock(i, startMinute, duration);
                System.out.println(i + "-" + startMinute + "-" + duration);
                return true;
            }
        }

        return false;
    } // There may be instance variables, constructors, and methods that are not
      // shown.

    public static void main(String[] args) {
        AppointmentBook ab = new AppointmentBook();
        // System.out.println(ab.findFreeBlock(2, 15));
        // System.out.println(ab.findFreeBlock(2, 9));
        // System.out.println(ab.findFreeBlock(2, 20));

        System.out.println(ab.makeAppointment(2, 4, 22));
        System.out.println(ab.makeAppointment(3, 4, 3));
        System.out.println(ab.makeAppointment(2, 4, 30));
    }
}