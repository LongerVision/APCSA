import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemInventory {
    /** The list of all items at the store */
    private ArrayList<ItemInfo> inventory;

    public ItemInventory() {
        this.inventory = new ArrayList<>();
    }

    /**
     * * Returns the average cost of the available items * whose cost is between
     * lower and upper, inclusive * Precondition: lower <= upper * At least one
     * available element of * inventory has a cost between * lower and upper,
     * inclusive. * No elements of inventory are null.
     */
    public double averageWithinRange(double lower, double upper) {
        /* to be implemented */
        double totalCost = 0.0;
        int num = 0;
        double itemCost = 0;
        for (ItemInfo item : inventory) {
            itemCost = item.getCost();
            if (item.isAvailable() && lower <= itemCost && itemCost <= upper) {
                totalCost += itemCost;
                num++;
            }
        }
        return totalCost / (double) num;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */

    public static void main(String[] args) throws FileNotFoundException {
        ItemInventory ii = new ItemInventory();
        // ii.inventory.add(new ItemInfo("action figure", 20.0, true));
        // ii.inventory.add(new ItemInfo("hair brush", 7.99, true));
        // ii.inventory.add(new ItemInfo("frying pan", 45.0, true));
        // ii.inventory.add(new ItemInfo("dish sponge", 2.0, false));
        // ii.inventory.add(new ItemInfo("coffee mug", 10.0, true));
        // ii.inventory.add(new ItemInfo("scarf", 59.0, true));
        // ii.inventory.add(new ItemInfo("watch", 45.0, false));
        // Data Collection
        File f = new File("inventory.dat");
        Scanner sc = new Scanner(f);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] strs = line.split(",");
            ii.inventory.add(new ItemInfo(strs[0], Double.parseDouble(strs[1]), Boolean.parseBoolean(strs[2])));
        }

        System.out.println(ii.averageWithinRange(10.0, 50.0));
    }
}