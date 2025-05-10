package apcsa_2025;

public class DogWalker {
    /** The maximum number of dogs this walker can walk simultaneously per hour */
    private int maxDogs;

    /** The dog-walking company this dog walker is associated with */
    private DogWalkCompany company;

    public DogWalker(int md) {
        this.maxDogs = md;
        this.company = new DogWalkCompany();
    }

    /*** Assigns max to maxDogs and comp to company* Precondition: max > 0 */
    public DogWalker(int max, DogWalkCompany comp) {
        /* implementation not shown */
    }

    /***
     * Takes at least one dog for a walk during the time specified by* hour, as
     * described in part (a)* Preconditions: 0 <= hour <= 23* maxDogs > 0
     */
    public int walkDogs(int hour) {
        /* to be implemented in part (a) */
        int dogsToBeWalked = this.company.numAvailableDogs(hour);
        int dogsWalked = dogsToBeWalked <= this.maxDogs ? dogsToBeWalked : this.maxDogs;

        this.company.updateDogs(hour, dogsWalked);

        return dogsWalked;
    }

    /***
     * Performs an entire dog-walking shift and returns the amount* earned, in
     * dollars, as described in part (b)* Preconditions: 0 <= startHour <= endHour
     * <= 23* maxDogs > 0
     */
    public int dogWalkShift(int startHour, int endHour) {
        /* to be implemented in part (b) */
        int earned = 0;
        int wd = 0;
        for (int i = startHour; i <= endHour; i++) {
            wd = this.walkDogs(i);
            if (wd == this.maxDogs || (9 <= i && i <= 17))
                earned += 5 * wd + 3;
            else
                earned += 5 * wd;
        }

        return earned;
    }

    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public static void main(String[] args) {
        DogWalker dw = new DogWalker(3);
        System.out.println(dw.dogWalkShift(7, 10));
    }
}
