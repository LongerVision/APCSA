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
 * Create Date: 2025-05-01 *
 *******************************************************************************/

package apcsa_2021;

import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        this.memberList = new ArrayList<>();
        this.memberList.add(new MemberInfo("SMITH, JANE", 2019, false));
        this.memberList.add(new MemberInfo("FOX, STEVE", 2018, true));
        this.memberList.add(new MemberInfo("XIN, MICHAEL", 2017, false));
        this.memberList.add(new MemberInfo("GARCIA, MARIA", 2020, true));
    }

    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        /* to be implemented in part (a) */
        for (String name : names)
            memberList.add(new MemberInfo(name, gradYear, true));
    }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        /* to be implemented in part (b) */
        ArrayList<MemberInfo> res = new ArrayList<>();
        // for (MemberInfo m : memberList) {
        for (int i = memberList.size() - 1; i >= 0; i--) {
            MemberInfo m = memberList.get(i);
            if (m.getGradYear() <= year) {
                if (m.inGoodStanding())
                    res.add(m);
                memberList.remove(i);
            }
        }

        return res;
    }

    public void printMemberList() {
        for (MemberInfo m : this.memberList)
            System.out.println(m.getName() + "-" + m.getGradYear() + "-" + m.inGoodStanding());
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        ClubMembers cm = new ClubMembers();
        ArrayList<MemberInfo> res = cm.removeMembers(2018);
        System.out.println(res.size());
        cm.printMemberList();
        MemberInfo m = res.get(0);
        System.out.println(m.getName() + "-" + m.getGradYear() + "-" + m.inGoodStanding());
    }
}
