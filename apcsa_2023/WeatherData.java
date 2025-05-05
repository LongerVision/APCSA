package apcsa_2023;

import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    public WeatherData(double[] dArr) {
        temperatures = new ArrayList<>();
        for (double d : dArr)
            temperatures.add(d);
    }

    /**
     * * Cleans the data by removing from temperatures all values that are less than
     * lower and all values that are greater than upper, as described in part (a)
     */
    public void cleanData(double lower, double upper) {
        /* to be implemented in part (a) */
        for (int i = temperatures.size() - 1; i >= 0; i--) {
            double t = temperatures.get(i);
            if (t < lower || t > upper)
                temperatures.remove(i);
        }
    }

    /**
     * * Returns the length of the longest heat wave found in temperatures, as
     * described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on
     * threshold.
     */
    public int longestHeatWave(double threshold) {
        /* to be implemented in part (b) */
        return 0;
    }

    public void printValidData() {
        for (Double t : temperatures)
            System.out.print(t + " ");
        System.out.println();
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        double[] dArr = { 99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5 };
        WeatherData wd = new WeatherData(dArr);
        wd.cleanData(85.0, 120.0);
    }
}