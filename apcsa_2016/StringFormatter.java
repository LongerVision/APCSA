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

public class StringFormatter {
    public static int totalLetters(ArrayList<String> wordList) {
        int len = 0;
        for (String word : wordList)
            len += word.length();

        return len;
    }

    public static int basicGapWidth(ArrayList<String> wordList,
            int formattedLen) {
        int nbOfSpaces = formattedLen - StringFormatter.totalLetters(wordList);

        return nbOfSpaces / (wordList.size() - 1);
    }

    public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen) {
        int nbOfSpaces = formattedLen - StringFormatter.totalLetters(wordList);

        return nbOfSpaces % (wordList.size() - 1);
    }

    public static String format(ArrayList<String> wordList, int formattedLen) {
        String res = wordList.get(0);
        int basicNbOfSpaces = StringFormatter.basicGapWidth(wordList, formattedLen);
        int leftoverNbOfSpaces = StringFormatter.leftoverSpaces(wordList, formattedLen);
        for (int i = 1; i < wordList.size(); i++) {
            for (int k = 0; k < basicNbOfSpaces; k++)
                res += "/";
            if (leftoverNbOfSpaces > 0) {
                res += "/";
                leftoverNbOfSpaces--;
            }
            res += wordList.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
        // as.add("AP");
        // as.add("COMP");
        // as.add("SCI");
        // as.add("ROCKS");
        // as.add("GREEN");
        // as.add("EGGS");
        // as.add("AND");
        // as.add("HAM");
        as.add("BEACH");
        as.add("BALL");

        System.out.println(StringFormatter.format(as, 20));

    }
}
