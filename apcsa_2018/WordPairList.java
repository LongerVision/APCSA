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

package apcsa_2018;

import java.util.ArrayList;

public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        /* to be implemented in part (a) */
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches() {
        /* to be implemented in part (b) */
        int counter = 0;
        for (WordPair wp : allPairs) {
            if (wp.getFirst().equals(wp.getSecond()))
                counter++;
        }
        return counter;
    }

    public void printAllPairs() {
        for (WordPair wp : allPairs)
            System.out.println(wp.getFirst() + "-" + wp.getSecond());
    }

    public static void main(String[] args) {
        String[] wordNums = { "one", "two", "three" };
        WordPairList exampleOne = new WordPairList(wordNums);
        exampleOne.printAllPairs();

        String[] phrase = { "the", "more", "the", "merrier" };
        WordPairList exampleTwo = new WordPairList(phrase);
        exampleTwo.printAllPairs();

        String[] moreWords = { "the", "red", "fox", "the", "red" };
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches());
    }
}
