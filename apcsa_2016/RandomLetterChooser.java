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

public class RandomLetterChooser extends RandomStringChooser {
    /**
     * Constructs a random letter chooser using the given string str.
     * Precondition: str contains only letters.
     */
    public RandomLetterChooser(String str) {
        /* to be implemented in part (b) */
        super(getSingleLetters(str));
    }

    /**
     * Returns an array of single-letter strings.
     * Each of these strings consists of a single letter from str. Element k
     * of the returned array contains the single letter at position k of str.
     * For example, getSingleLetters("cat") returns the
     * array { "c", "a", "t" }.
     */
    public static String[] getSingleLetters(String str) {
        /* implementation not shown */
        int len = str.length();
        String[] res = new String[len];
        for (int i = 0; i < len; i++)
            res[i] = str.substring(i, i + 1);

        return res;
    }

    public static void main(String[] args) {
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
    }
}