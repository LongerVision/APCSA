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

import java.util.ArrayList;

public class SparseArray {
    /** The number of rows and columns in the sparse array. */
    private int numRows;
    private int numCols;
    /**
     * The list of entries representing the non-zero elements of the sparse array.
     * Entries are stored in the
     * list in no particular order. Each non-zero element is represented by exactly
     * one entry in the list.
     */
    private ArrayList<SparseArrayEntry> entries;

    /** Constructs an empty SparseArray. */
    public SparseArray() {
        entries = new ArrayList<>();
    }

    /** Returns the number of rows in the sparse array. */
    public int getNumRows() {
        return numRows;
    }

    /** Returns the number of columns in the sparse array. */
    public int getNumCols() {
        return numCols;
    }

    /**
     * Returns the value of the element at row index row and column index col in the
     * sparse array.
     * Precondition: 0  row < getNumRows()
     * 0  col < getNumCols()
     */
    public int getValueAt(int row, int col) {
        /* to be implemented in part (a) */
        for (SparseArrayEntry sae : entries) {
            if (sae.getRow() == row && sae.getCol() == col)
                return sae.getValue();
        }

        return 0;
    }

    public void addEntry(SparseArrayEntry sae) {
        entries.add(sae);
    }

    public void setRows(int r) {
        this.numRows = r;
    }

    public void setCols(int c) {
        this.numCols = c;
    }

    /**
     * Removes the column col from the sparse array.
     * Precondition: 0  col < getNumCols()
     */
    public void removeColumn(int col) {
        /* to be implemented in part (b) */
        for (int i = entries.size() - 1; i >= 0; i--) {
            SparseArrayEntry sae = entries.get(i);
            int c = sae.getCol();
            if (c == col)
                entries.remove(i);
            else if (c > col) {
                entries.add(new SparseArrayEntry(sae.getRow(), c - 1, sae.getValue()));
                entries.remove(i);
            }
        }

        this.numCols--;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
    public void printEntries() {
        for (SparseArrayEntry sae : entries)
            System.out.println(sae.getRow() + "-" + sae.getCol() + "-" + sae.getValue());
    }

    public static void main(String[] args) {
        SparseArray sparse = new SparseArray();
        sparse.setRows(6);
        sparse.setCols(5);
        sparse.addEntry(new SparseArrayEntry(1, 4, 4));
        sparse.addEntry(new SparseArrayEntry(2, 0, 1));
        sparse.addEntry(new SparseArrayEntry(3, 1, -9));
        sparse.addEntry(new SparseArrayEntry(1, 1, 5));
        // System.out.println(sparse.getValueAt(3, 1));
        // System.out.println(sparse.getValueAt(3, 3));
        sparse.removeColumn(1);

        System.out.println(sparse.getNumCols());
        sparse.printEntries();
    }
}
