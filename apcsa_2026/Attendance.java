
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

import java.util.ArrayList;

public class Attendance {
    /* The students enrolled in a history course */
    private ArrayList<CourseRecord> historyList;
    /* The students enrolled in a math course */
    private ArrayList<CourseRecord> mathList;

    public Attendance() {
        historyList = new ArrayList<>();
        mathList = new ArrayList<>();
    }

    /***
     * Returns the number of students who are enrolled in both* the history course
     * and the math course but have more* absences in the history course than the
     * math course* Preconditions:* No student ID appears multiple times in
     * historyList.* No student ID appears multiple times in mathList.* historyList
     * and mathList do not contain any null elements.* Postcondition:* historyList
     * and mathList are unchanged.
     */
    public int moreHistoryThanMathAbsences() {
        /* to be implemented */
        int res = 0;

        String hid = "";
        int ha = 0;
        String mid = "";
        int ma = 0;
        for (CourseRecord hcr : historyList) {
            hid = hcr.getStudentID();
            ha = hcr.getAbsences();
            for (CourseRecord mcr : mathList) {
                mid = mcr.getStudentID();
                ma = mcr.getAbsences();
                if (hid.equals(mid) && ha > ma)
                    res++;
            }
        }
        return res;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public static void main(String[] args) {
        Attendance a = new Attendance();
        a.historyList.add(new CourseRecord("rc29", 1));
        a.historyList.add(new CourseRecord("br98", 1));
        a.historyList.add(new CourseRecord("dr03", 2));
        a.historyList.add(new CourseRecord("ot32", 2));
        a.historyList.add(new CourseRecord("sq98", 3));
        a.historyList.add(new CourseRecord("ry00", 1));

        a.mathList.add(new CourseRecord("fr27", 2));
        a.mathList.add(new CourseRecord("sq98", 1));
        a.mathList.add(new CourseRecord("dr03", 2));
        a.mathList.add(new CourseRecord("dk12", 1));
        a.mathList.add(new CourseRecord("ot32", 1));
        a.mathList.add(new CourseRecord("js33", 0));
        a.mathList.add(new CourseRecord("ry00", 3));

        System.out.println(a.moreHistoryThanMathAbsences());
    }
}
