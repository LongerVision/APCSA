package apcsa_2021;

public class SingleTable {
    private int seats;
    private double viewquality;
    private int height;

    public SingleTable(int s, double v, int h) {
        this.seats = s;
        this.viewquality = v;
        this.height = h;
    }

    /**
     * Returns the number of seats at this table. The value is always greater than
     * or equal to 4.
     */
    public int getNumSeats() {
        /* implementation not shown */
        return this.seats;
    }

    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        /* implementation not shown */
        return this.height;
    }

    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        /* implementation not shown */
        return this.viewquality;
    }

    /** Sets the quality of the view from this table to value. */
    public void setViewQuality(double value) {
        /* implementation not shown */
        this.viewquality = value;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
