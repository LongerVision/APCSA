public class Feeder {
    /**
     * The amount of food, in grams, currently in the bird feeder; initialized in
     * the constructor and
     * always greater than or equal to zero
     */
    private int currentFood;

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
     * as described in part (a)
     * Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds) {
        /* to be implemented in part (a) */
        // Math.random(): [0.0, 1.0)
        // [0.0, 0.95), [0.95, 1.0)
        if (Math.random() >= 0.95) // abnormal
            this.currentFood = 0;
        else { // normal
               // Math.random(): [0.0, 1.0)*41=>(int)[0.0, 41.0)=>[0,40]+10=>[10, 50]
            int foodEachBird = (int) (Math.random() * 41) + 10;
            this.currentFood -= foodEachBird * numBirds;
            if (this.currentFood < 0)
                this.currentFood = 0;
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the feeder in
     * this simulation,
     * as described in part (b)
     * Preconditions: numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) {
        /* to be implemented in part (b) */
        int days = 0;
        while (days <= numDays && this.currentFood > 0) {
            days++;
            simulateOneDay(numBirds);
        }
        if (days > numDays)
            days = numDays;
        return days;
    }
    // There may be instance variables, constructors, or methods that are not shown.
}