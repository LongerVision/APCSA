package apcsa_2017;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        this.digitList = new ArrayList<>();
        while (num / 10 > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }

        digitList.add(0, num % 10);
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < this.digitList.size(); i++) {
            if (this.digitList.get(i - 1) >= this.digitList.get(i))
                return false;
        }

        return true;
    }

    public void printDigitList() {
        for (Integer i : digitList)
            System.out.print(i + ",");
        System.out.println();
    }

    public static void main(String[] args) {
        // Digits d1 = new Digits(15704);
        // d1.printDigitList();
        // Digits d2 = new Digits(0);
        // d2.printDigitList();
        System.out.println(new Digits(7).isStrictlyIncreasing());
        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(1536).isStrictlyIncreasing());
        System.out.println(new Digits(65310).isStrictlyIncreasing());
    }
}
