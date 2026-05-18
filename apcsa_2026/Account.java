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

public class Account {
    private String username; // To be initialized in part (a)/*** Creates a username based on the parameter
                             // requestedName. If the* username is unavailable, appends successive integers,
                             // beginning* with 1, to requestedName until an available username is found,* as
                             // described in part (a).*

    public Account(String requestedName) {
        /*
         * to be
         * // implemented in part (a)
         */
        if (Account.isAvailable(requestedName))
            this.username = requestedName;
        else {
            int n = 1;
            while (true) {
                if (Account.isAvailable(requestedName + n)) {
                    this.username = requestedName + n;
                    break;
                } else
                    n++;
            }
        }
    }

    /***
     * Returns true if the parameter str is an
     * // available username;* returns false otherwise.
     */
    public static boolean isAvailable(String str) {
        /* implementation not shown */
        if (str.equals("PSmith"))
            return true;
        if (str.equals("Luis-Cruz3"))
            return true;
        if (str.equals("SammyB3"))
            return true;
        if (str.equals("Amy-Marie-Lin"))
            return true;

        return false;
    }

    /***
     * Returns a
     * // shortened version of username with each hyphen ("-")* and the character
     * // before it removed, as described in part (b)* Preconditions: username does
     * not
     * // start or end with a hyphen.* username does not contain consecutive
     * hyphens.*
     * // username.length() >= 2* Postcondition: username is unchanged.
     */
    public String getShortenedName() {
        /* to be implemented in part (b) */
        String res = "";
        int idx = this.username.indexOf("-");
        if (idx < 0)
            return this.username;

        String tmp = this.username;
        while (idx > 0) {
            res += tmp.substring(0, idx - 1);
            tmp = tmp.substring(idx + 1);
            idx = tmp.indexOf("-");
        }
        res += tmp;

        return res;
    }

    /*
     * There may be
     * // instance variables, constructors, and methods that are not shown.
     */

    public void printUsername() {
        System.out.println(this.username);
    }

    public static void main(String[] args) {
        Account a = new Account("Amy-Marie-Lin");
        a.printUsername();
        String res = a.getShortenedName();
        System.out.println(res);
    }
}