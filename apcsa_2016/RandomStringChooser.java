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

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> as;

    public RandomStringChooser(String[] arr) {
        as = new ArrayList<>();
        for (String s : arr)
            as.add(s);
    }

    public String getNext() {
        if (!as.isEmpty()) {
            // Math.random() [0.0,1,0)=>[0, as.size())
            int n = (int) (Math.random() * as.size());
            String res = as.get(n);
            as.remove(n);
            return res;
        }
        return "NONE";
    }

    public static void main(String[] args) {
        String[] wordArray = { "wheels", "on", "the", "bus" };
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }
    }
}
