package apcsa_2023;

public class BoxOfCandy {
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    public BoxOfCandy() {
        // box = new Candy[4][3];
        // for (int r = 0; r < box.length; r++) {
        // for (int c = 0; c < box[0].length; c++) {
        // box[r][c] = null;
        // }
        // }

        // box[0][1] = new Candy("lime");
        // box[1][1] = new Candy("orange");
        // box[2][2] = new Candy("cherry");
        // box[3][1] = new Candy("lemon");
        // box[3][2] = new Candy("grape");

        box = new Candy[3][5];
        for (int r = 0; r < box.length; r++) {
            for (int c = 0; c < box[0].length; c++) {
                box[r][c] = null;
            }
        }
        box[0][0] = new Candy("lime");
        box[0][1] = new Candy("lime");
        box[0][3] = new Candy("lemon");
        box[1][0] = new Candy("orange");
        box[1][3] = new Candy("lime");
        box[1][4] = new Candy("lime");
        box[2][0] = new Candy("cherry");
        box[2][2] = new Candy("lemon");
        box[2][4] = new Candy("orange");
    }

    public Candy[][] getBox() {
        return box;
    }

    /**
     * * Moves one piece of candy in column col, if necessary and possible, so that
     * the box * element in row 0 of column col contains a piece of candy, as
     * described in part (a).
     * Returns false if there is no piece of candy in column col and returns true
     * otherwise.
     * Precondition: col is a valid column index in box.
     */
    public boolean moveCandyToFirstRow(int col) {
        /* to be implemented in part (a) */
        if (box[0][col] != null)
            return true;

        for (int r = 1; r < box.length; r++) {
            if (box[r][col] != null) {
                box[0][col] = box[r][col];
                box[r][col] = null;
                return true;
            }
        }

        return false;
    }

    /**
     * * Removes from box and returns a piece of candy with flavor specified by the
     * parameter, or
     * returns null if no such piece is found, as described in part (b)
     */
    public Candy removeNextByFlavor(String flavor) {
        /* to be implemented in part (b) */
        for (int r = box.length - 1; r >= 0; r--) {
            for (int c = 0; c < box[0].length; c++) {
                if (box[r][c] != null) {
                    if (box[r][c].getFlavor().equals(flavor)) {
                        Candy res = box[r][c];
                        box[r][c] = null;
                        return res;
                    }
                }
            }
        }

        return null;

    } // There may be instance variables, constructors, and methods that are not
      // shown.

    public static void main(String[] args) {
        BoxOfCandy boc = new BoxOfCandy();
        // System.out.println(boc.moveCandyToFirstRow(0));
        // System.out.println(boc.moveCandyToFirstRow(1));
        // System.out.println(boc.moveCandyToFirstRow(2));
        // if (boc.getBox()[0][2] != null)
        // System.out.println(boc.getBox()[0][2].getFlavor());
        // if (boc.getBox()[2][2] != null)
        // System.out.println(boc.getBox()[2][2].getFlavor());
        // else
        // System.out.println("2-2 is empty.");
        Candy cd = boc.removeNextByFlavor("cherry");
        System.out.println(cd.getFlavor());
        if (boc.getBox()[2][0] == null)
            System.out.println("Good");

        cd = boc.removeNextByFlavor("lime");
        System.out.println(cd.getFlavor());
        if (boc.getBox()[1][3] == null)
            System.out.println("Good");
    }
}
