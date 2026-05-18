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

public class Bottle {
    private double capacity;
    private double remaining;

    public Bottle(double c) {
        this.capacity = c;
        this.remaining = c;
    }

    public double updateAmount(double c) {
        if ((remaining - c) / capacity < 0.25)
            remaining = capacity;
        else
            remaining -= c;
        return remaining;
    }

    public void printRemaining() {
        System.out.println(this.remaining);
    }

    public static void main(String[] args) {
        double amt;
        Bottle water = new Bottle(1000.0);

        amt = water.updateAmount(400.0);
        water.printRemaining();

        amt = water.updateAmount(100.0);
        water.printRemaining();

        amt = water.updateAmount(300.0);
        water.printRemaining();

        Bottle shampoo = new Bottle(40.0);

        amt = shampoo.updateAmount(30.0);
        shampoo.printRemaining();

        amt = shampoo.updateAmount(1.0);
        shampoo.printRemaining();
    }
}
