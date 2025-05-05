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

public class Phrase {
    private String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p) {
        currentPhrase = p;
    }

    /**
     * Returns the index of the nth occurrence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n) {
        /* implementation not shown */
        return 0;
    }

    /**
     * Modifies the current phrase by replacing the nth occurrence of str with repl.
     * If the nth occurrence does not exist, the current phrase is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl) {
        /* to be implemented in part (a) */
        int counter = 0;
        int len = str.length();
        for (int i = 0; i < this.currentPhrase.length() - len + 1; i++) {
            String sub = currentPhrase.substring(i, i + len);
            if (sub.equals(str))
                counter++;
            if (counter == n) {
                currentPhrase = currentPhrase.substring(0, i) + repl + currentPhrase.substring(i + len);
                break;
            }
        }
    }

    /**
     * Returns the index of the last occurrence of str in the current phrase;
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str) {
        /* to be implemented in part (b) */
        return currentPhrase.lastIndexOf(str);
    }

    /** Returns a string containing the current phrase. */
    // Chapter5~6, Object. equals(), toString(), hashCode();
    public String toString() {
        return currentPhrase;
    }

    public static void main(String[] args) {
        Phrase phrase1 = new Phrase("A cat ate late.");
        System.out.println(phrase1.findLastOccurrence("at"));
        System.out.println(phrase1.findLastOccurrence("cat"));
        System.out.println(phrase1.findLastOccurrence("bat"));
        // Phrase phrase1 = new Phrase("A cat ate late.");
        // phrase1.replaceNthOccurrence("at", 1, "rane");
        // System.out.println(phrase1);

        // Phrase phrase2 = new Phrase("A cat ate late.");
        // phrase2.replaceNthOccurrence("at", 6, "xx");
        // System.out.println(phrase2);

        // Phrase phrase3 = new Phrase("A cat ate late.");
        // phrase3.replaceNthOccurrence("bat", 2, "xx");
        // System.out.println(phrase3);

        // Phrase phrase4 = new Phrase("aaaa");
        // phrase4.replaceNthOccurrence("aa", 1, "xx");
        // System.out.println(phrase4);

        // Phrase phrase5 = new Phrase("aaaa");
        // phrase5.replaceNthOccurrence("aa", 2, "bbb");
        // System.out.println(phrase5);
    }
}
