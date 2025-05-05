package apcsa_2019;

import java.util.ArrayList;

public class StepTracker {
    private int minSteps;
    private ArrayList<Integer> dailySteps;

    public StepTracker(int ms) {
        this.minSteps = ms;
        this.dailySteps = new ArrayList<>();
    }

    public int activeDays() {
        int counter = 0;
        for (Integer steps : this.dailySteps) {
            if (steps >= minSteps)
                counter++;
        }

        return counter;
    }

    public double averageSteps() {
        if (this.dailySteps.size() == 0)
            return 0.0;

        double avg = 0.0;
        for (Integer steps : this.dailySteps) {
            avg += steps;
        }

        return avg / this.dailySteps.size();
    }

    public void addDailySteps(int s) {
        this.dailySteps.add(s);
    }

    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
