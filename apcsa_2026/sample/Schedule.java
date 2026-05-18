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

public class Schedule {
    private Appointment[][] sched;

    public Schedule() {
        sched = new Appointment[6][5];
        sched[0][0] = new Appointment("free", 100);
        sched[0][1] = new Appointment("free", 100);
        sched[0][2] = new Appointment("free", 100);
        sched[0][3] = new Appointment("busy", 206);
        sched[0][4] = new Appointment("busy", 204);
        sched[1][0] = new Appointment("free", 100);
        sched[1][1] = new Appointment("free", 100);
        sched[1][2] = new Appointment("busy", 304);
        sched[1][3] = new Appointment("busy", 206);
        sched[1][4] = new Appointment("busy", 202);
        sched[2][0] = new Appointment("hold", 201);
        sched[2][1] = new Appointment("busy", 105);
        sched[2][2] = new Appointment("busy", 205);
        sched[2][3] = new Appointment("free", 100);
        sched[2][4] = new Appointment("busy", 205);
        sched[3][0] = new Appointment("busy", 204);
        sched[3][1] = new Appointment("free", 100);
        sched[3][2] = new Appointment("busy", 310);
        sched[3][3] = new Appointment("hold", 110);
        sched[3][4] = new Appointment("free", 100);
        sched[4][0] = new Appointment("busy", 204);
        sched[4][1] = new Appointment("hold", 201);
        sched[4][2] = new Appointment("hold", 310);
        sched[4][3] = new Appointment("busy", 105);
        sched[4][4] = new Appointment("free", 100);
        sched[5][0] = new Appointment("busy", 105);
        sched[5][1] = new Appointment("busy", 208);
        sched[5][2] = new Appointment("hold", 310);
        sched[5][3] = new Appointment("busy", 105);
        sched[5][4] = new Appointment("free", 100);
    }

    public void printSchedule() {
        for (int r = 0; r < sched.length; r++) {
            for (int c = 0; c < sched[0].length; c++) {
                System.out.print(sched[r][c].getStatus() + "-" + sched[r][c].getRoomNumber() + " ");
            }
            System.out.println();
        }
    }

    /**
     * * Returns the index of a column containing the fewest * occurrences of the
     * status indicated by the parameter * target * Preconditions: sched is not null
     * and no elements * of sched are null. * sched has at least one row and at *
     * least one column.
     */
    // equals()
    public int columnWithFewest(String target) {
        /* to be implemented */
        int[] freq = new int[this.sched[0].length];
        for (int c = 0; c < freq.length; c++) {
            int occur = 0;
            for (int r = 0; r < this.sched.length; r++) {
                if (this.sched[r][c].getStatus().equals(target)) {
                    occur++;
                }
            }
            freq[c] = occur;
        }

        int minCol = 0;
        int freqMin = freq[0];
        for (int c = 1; c < freq.length; c++) {
            if (freqMin > freq[c]) {
                minCol = c;
                freqMin = freq[c];
            }
        }

        return minCol;
    }
    /*
     * There may be instance variables, constructors, and methods
     * that are not shown.
     */

    public static void main(String[] args) {
        Schedule s = new Schedule();
        s.printSchedule();

        System.out.println(s.columnWithFewest("busy"));
        System.out.println(s.columnWithFewest("free"));
        System.out.println(s.columnWithFewest("hold"));
    }
}