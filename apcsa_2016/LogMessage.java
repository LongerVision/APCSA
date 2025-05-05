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

public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message) {
        /* to be implemented in part (a) */
        int n = message.indexOf(":");
        this.machineId = message.substring(0, n);
        this.description = message.substring(n + 1);
    }

    public void setDescription(String s) {
        this.description = s;
    }

    /**
     * Returns true if the description in this log message properly contains
     * keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword) {
        /* to be implemented in part (b) */
        int len = keyword.length();
        for (int i = 0; i < description.length() - len + 1; i++) {
            String sub = description.substring(i, i + len);
            if (sub.equals(keyword)) {
                if (i == 0 || description.substring(i - 1, i).equals(" ")) {
                    if (i == description.length() - len || description.substring(i + len, i + len + 1).equals(" "))
                        return true;
                }
            }
        }

        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        LogMessage lm = new LogMessage("CLIENT3:security alert – repeated login failures ");
        // System.out.println(lm.getMachineId());
        // System.out.println(lm.getDescription());
        lm.setDescription("disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on /dev/disk disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on disk DSK1");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("DISK");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on disk3");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on /dev/disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("diskette");
        System.out.println(lm.containsWord("disk"));
    }
}
