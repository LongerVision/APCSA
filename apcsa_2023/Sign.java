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
 * Create Date: 2025-04-30 *
 *******************************************************************************/

package apcsa_2023;

public class Sign {
    private String text;
    private int width;

    public Sign(String t, int w) {
        this.text = t;
        this.width = w;
    }

    public int numberOfLines() {
        if (this.text.length() % this.width == 0)
            return this.text.length() / this.width;
        return this.text.length() / this.width + 1;
    }

    public String getLines() {
        if (text.isEmpty())
            return null;

        int nl = this.numberOfLines();
        if (nl == 1)
            return this.text;

        String res = "";
        for (int i = 0; i < nl - 1; i++) {
            res += this.text.substring(i * this.width, (i + 1) * this.width) + ";";
        }

        res += this.text.substring((nl - 1) * this.width);

        return res;
    }

    public static void main(String[] args) {
        String str;
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines();
        System.out.println(x);
        str = sign1.getLines();
        System.out.println(str);
        str = sign1.getLines();
        System.out.println(str);
        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines();
        System.out.println(x);
        str = sign2.getLines();
        System.out.println(str);
        Sign sign3 = new Sign("ABCDEF", 6);
        x = sign3.numberOfLines();
        System.out.println(x);
        str = sign3.getLines();
        System.out.println(str);
        Sign sign4 = new Sign("", 4);
        x = sign4.numberOfLines();
        System.out.println(x);
        str = sign4.getLines();
        System.out.println(str);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        x = sign5.numberOfLines();
        System.out.println(x);
        str = sign5.getLines();
        System.out.println(str);
    }
}
