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

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> res = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                res.add(token);
            }
        }

        return res;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int nbOfOpenDel = 0;
        int nbOfCloseDel = 0;
        for (String s : delimiters) {
            if (s.equals(this.openDel))
                nbOfOpenDel++;
            else if (s.equals(this.closeDel))
                nbOfCloseDel++;

            if (nbOfCloseDel > nbOfOpenDel)
                return false;
        }

        return nbOfOpenDel == nbOfCloseDel;
    }

    public static void main(String[] args) {
        // String[] ss = {
        // "(", "x + y", ")", " * 5"
        // };
        // String[] ss = {
        // "<q>", "yy", "</q>", "zz", "</q>"
        // };
        String[] ss = {
                "<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"
        };
        // String[] ss = {
        // "<sup>", "</sup>", "</sup>", "<sup>"
        // };
        // String[] ss = {
        // "<sup>", "<sup>", "</sup>"
        // };
        Delimiters d = new Delimiters("<sup>", "</sup>");
        ArrayList<String> as = d.getDelimitersList(ss);
        System.out.println(d.isBalanced(as));
        // System.out.println(as.size());
        // for (String s : as)
        // System.out.println(s);
    }
}
