package apcsa_2018;

public class FrogSimulation {
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    private int[] hds;
    private static int idx = 0;

    /**
     * Constructs a FrogSimulation where dist is the distance, in inches, from the
     * starting
     * position to the goal, and numHops is the maximum number of hops allowed to
     * reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops, int[] hds) {
        goalDistance = dist;
        maxHops = numHops;
        this.hds = hds;
    }

    /**
     * Returns an integer representing the distance, in inches, to be moved when the
     * frog hops.
     */
    private int hopDistance() {
        /* implementation not shown */
        // return 0;
        return hds[FrogSimulation.idx];
    }

    /**
     * Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the
     * simulation;
     * false otherwise.
     */
    public boolean simulate() {
        /* to be implemented in part (a) */
        int distance = 0;
        for (int i = 0; i < maxHops; i++) {
            FrogSimulation.idx = i;
            distance += hopDistance();
            if (distance >= goalDistance)
                return true;
            if (distance < 0)
                return false;
        }

        return false;
    }

    /**
     * Runs num simulations and returns the proportion of simulations in which the
     * frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b) */
        int trueTimes = 0;
        for (int i = 0; i < num; i++) {
            if (simulate())
                trueTimes++;
        }

        return (double) trueTimes / num;
    }

    public static void main(String[] args) {
        int[] dists = { 5, 4, 2, 4, 3 };
        FrogSimulation sim = new FrogSimulation(24, 5, dists);
        System.out.println(sim.simulate());
        // System.out.println((double) 100 / (double) 400);
    }
}
