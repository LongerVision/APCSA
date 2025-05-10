public class DogWalkCompany {
    /***
     * Returns the number of dogs, always greater than 0, that are available* for a
     * walk during the time specified by hour* Precondition: 0 <= hour <= 23
     */
    public int numAvailableDogs(int hour) {
        /* implementation not shown */
        switch (hour) {
            case 7:
                return 3;
            case 8:
                return 2;
            case 9:
                return 2;
            case 10:
                return 3;
            default:
                return 0;
        }
    }

    /***
     * Decreases, by numberDogsWalked, the number of dogs available for a walk*
     * during the time specified by hour* Preconditions: 0 <= hour <= 23*
     * numberDogsWalked > 0
     */
    public void updateDogs(int hour, int numberDogsWalked) {
        /* implementation not shown */
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */
}
