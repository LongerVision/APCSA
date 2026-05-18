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
 * Create Date: 2026-05-15 *
 *******************************************************************************/

public class MessageBuilder {
    private String message; // To be initialized in part (a)
    private int numWords; // To be initialized in part (a)

    private static int IDX;

    /**
     * * Builds a message starting with the word specified by the *
     * // parameter and counts the number of words in the message, * as described in
     * // part (a) * Precondition: startingWord is a single word with no spaces.
     */
    public MessageBuilder(String startingWord) {
        /*
         * to be implemented in part (a)
         * //
         */
        MessageBuilder.IDX = 0;
        if (startingWord == null) {
            this.message = null;
            this.numWords = 0;
        } else {
            this.message = startingWord;
            this.numWords = 1;
            String s = getNextWord(startingWord);
            while (s != null) {
                this.message += " " + s;
                this.numWords++;
                s = getNextWord(s);
            }
        }
    }

    /**
     * * Returns a word to follow the word specified by the * parameter or
     * // null if there are no remaining words. * Precondition: s is a single word
     * with no spaces.
     * Postcondition: Returns an individual word with no spaces.
     */

    public String getNextWord(String s) {
        /* implementation not shown */
        if (MessageBuilder.IDX == 0 && s.equals("the")) {
            MessageBuilder.IDX++;
            return "book";
        } else if (MessageBuilder.IDX == 1 && s.equals("book")) {
            MessageBuilder.IDX++;
            return "on";
        } else if (MessageBuilder.IDX == 2 && s.equals("on")) {
            MessageBuilder.IDX++;
            return "the";
        } else if (MessageBuilder.IDX == 3 && s.equals("the")) {
            MessageBuilder.IDX++;
            return "table";
        } else if (MessageBuilder.IDX == 4 && s.equals("table")) {
            MessageBuilder.IDX++;
            return null;
        }
        // if (s.equals("good"))
        // return "morning";
        // else if (s.equals("morning"))
        // return "sunshine";
        // else if (s.equals("sunshine"))
        // return null;
        return null;
    }

    /**
     * *
     * // Returns an abbreviation for the instance variable message, * as described
     * in
     * // part (b) * Preconditions: Each word in message is separated by a * single
     * // space. * message contains two or more words. * Postcondition: message is
     * // unchanged.
     */
    public String getAbbreviation() {
        /* to be implemented in part (b) */
        String[] strs = this.message.split(" ");
        String res = "";
        for (String s : strs)
            res += s.substring(0, 1);
        return res;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public void setMessage(String m) {
        this.message = m;
    }

    public static void main(String[] args) {
        MessageBuilder mb = new MessageBuilder("the");
        System.out.println(mb.message);
        System.out.println(mb.numWords);

        mb.setMessage("as soon as possible");
        System.out.println(mb.getAbbreviation());
    }
}