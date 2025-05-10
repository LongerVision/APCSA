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
 * Create Date: 2025-05-09 *
 *******************************************************************************/

public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getSignature() {
        if (firstName.isEmpty())
            return lastName;
        else
            return firstName.substring(0, 1) + "-" + lastName;
    }

    // text: "abcde"
    // sig: "cde"
    public String addSignature(String text) {
        String sig = this.getSignature();
        int lenText = text.length();
        int lenSig = sig.length();
        if (lenSig > lenText)
            return text + sig;

        if (!text.contains(sig))
            return text + sig;

        if (text.substring(lenText - lenSig).equals(sig))
            return text;
        else // guaranteed at the beginning
            return text.substring(lenSig) + sig;
    }

    public static void main(String[] args) {
        SignedText st1 = new SignedText("", "Wong");
        String temp = st1.getSignature();
        System.out.println(temp);
        SignedText st2 = new SignedText("henri", "dubois");
        temp = st2.getSignature();
        System.out.println(temp);
        SignedText st3 = new SignedText("GRACE", "LOPEZ");
        temp = st3.getSignature();
        System.out.println(temp);
        SignedText st4 = new SignedText("", "FOX");
        String text = "Dear";
        temp = st4.addSignature(text);
        System.out.println(temp);
        text = "Best wishesFOX";
        temp = st4.addSignature(text);
        System.out.println(temp);
    }
}
