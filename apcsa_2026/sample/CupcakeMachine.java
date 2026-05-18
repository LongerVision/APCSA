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

public class CupcakeMachine {
    private int nbOfCupcakesAvailable;
    private double priceOfEachCupcake;
    private int orderNumber;

    public CupcakeMachine(int totalNumber, double unitPrice) {
        nbOfCupcakesAvailable = totalNumber;
        priceOfEachCupcake = unitPrice;
        orderNumber = 1;
    }

    public String takeOrder(int units) {
        if (nbOfCupcakesAvailable >= units) {
            String res = "Order number " + orderNumber + ", cost $";
            res += priceOfEachCupcake * units;
            orderNumber++;
            nbOfCupcakesAvailable -= units;
            return res;
        } else
            return "Order cannot be filled";
    }

    public static void main(String[] args) {
        String info;
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        info = c1.takeOrder(2);
        System.out.println(info);
        info = c1.takeOrder(3);
        System.out.println(info);
        info = c1.takeOrder(10);
        System.out.println(info);
        info = c1.takeOrder(1);
        System.out.println(info);

        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        info = c2.takeOrder(10);
        System.out.println(info);
    }
}
