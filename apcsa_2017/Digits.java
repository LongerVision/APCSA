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
 * Create Date: 2025-05-03 *
 *******************************************************************************/

package apcsa_2017;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        this.digitList = new ArrayList<>();
        while (num / 10 > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }

        digitList.add(0, num % 10);
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < this.digitList.size(); i++) {
            if (this.digitList.get(i - 1) >= this.digitList.get(i))
                return false;
        }

        return true;
    }

    public void printDigitList() {
        for (Integer i : digitList)
            System.out.print(i + ",");
        System.out.println();
    }

    public static void main(String[] args) {
        // Digits d1 = new Digits(15704);
        // d1.printDigitList();
        // Digits d2 = new Digits(0);
        // d2.printDigitList();
        System.out.println(new Digits(7).isStrictlyIncreasing());
        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(1536).isStrictlyIncreasing());
        System.out.println(new Digits(65310).isStrictlyIncreasing());
    }
}
