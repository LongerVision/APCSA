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
 * Create Date: 2025-05-05 *
 *******************************************************************************/

package apcsa_2015;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;

        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] res = new int[arr2D.length];
        for (int i = 0; i < res.length; i++)
            res[i] = DiverseArray.arraySum(arr2D[i]);

        return res;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] rs = DiverseArray.rowSums(arr2D);
        for (int i = 0; i < rs.length - 1; i++) {
            for (int j = i + 1; j < rs.length; j++) {
                if (rs[i] == rs[j])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 2, 7, 3 };
        // System.out.println(DiverseArray.arraySum(arr));
        // int[][] mat1 = {
        // { 1, 3, 2, 7, 3 },
        // { 10, 10, 4, 6, 2 },
        // { 5, 3, 5, 9, 6 },
        // { 7, 6, 4, 2, 1 }
        // };
        int[][] mat2 = {
                { 1, 1, 5, 3, 4 },
                { 12, 7, 6, 1, 9 },
                { 8, 11, 10, 2, 5 },
                { 3, 2, 3, 0, 6 }
        };

        // int[] res = DiverseArray.rowSums(mat1);
        // for (int i : res)
        // System.out.print(i + " ");
        // System.out.println();
        // System.out.println(DiverseArray.isDiverse(mat1));
        System.out.println(DiverseArray.isDiverse(mat2));
    }
}
