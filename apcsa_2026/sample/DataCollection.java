
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataCollection {
    // int, double, boolean: 3/8 primitive data types
    // String (class)
    // Wrapper class
    // Customized class
    // ArrayList<MyClass>
    private ArrayList<Apple> aa;

    public DataCollection() {
        this.aa = new ArrayList<>();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data.dat");
        Scanner sc = new Scanner(f);

        DataCollection dc = new DataCollection();

        while (sc.hasNext()) {
            dc.aa.add(new Apple(sc.next(), sc.nextInt(), sc.nextDouble(),
                    sc.nextBoolean()));
            // String line = sc.nextLine();
            // String[] strs = line.split(" ");
            // dc.aa.add(new Apple(strs[0], Integer.parseInt(strs[1]),
            // Double.parseDouble(strs[2]),
            // Boolean.parseBoolean(strs[3])));
        }

        System.out.println(dc.aa.size());

    }
}
