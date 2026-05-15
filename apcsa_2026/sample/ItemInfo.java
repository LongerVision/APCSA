public class ItemInfo {
    private String name;
    private double cost;
    private boolean availableOrNot;

    // Wrapper class: Integer, Double, Boolean
    // Math: all methods are static, Math.random()
    // String

    public ItemInfo(String n, double c, boolean b) {
        this.name = n;
        this.cost = c;
        this.availableOrNot = b;
    }

    /** * Returns the name of the item */
    public String getName() {
        /* implementation not shown */
        return this.name;
    }

    /**
     * * Returns a value greater than 0.0 that represents the * cost of a single
     * unit of the item, in dollars
     */
    public double getCost() {
        /* implementation not shown */
        return this.cost;
    }

    /**
     * * Returns true if the item is currently available and * returns false
     * otherwise
     */
    public boolean isAvailable() {
        /* implementation not shown */
        return this.availableOrNot;
    }
    /*
     * There may be instance variables, constructors, and
     * methods that are not shown.
     */
}
