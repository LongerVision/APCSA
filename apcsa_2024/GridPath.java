public class GridPath {
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public GridPath(int[][] arr) {
        this.grid = arr;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        /* to be implemented in part (a) */
        if (row + 1 >= grid.length) {
            return new Location(row, col + 1);
        } else if (col + 1 >= grid[0].length) {
            return new Location(row + 1, col);
        } else {
            if (grid[row + 1][col] < grid[row][col + 1])
                return new Location(row + 1, col);
            else
                return new Location(row, col + 1);
        }
    }

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        /* to be implemented in part (b) */
        int sum = 0;
        while (row != grid.length - 1 || col != grid[0].length - 1) {
            sum += grid[row][col];
            Location l = getNextLoc(row, col);
            row = l.getRow();
            col = l.getCol();
        }

        sum += grid[grid.length - 1][grid[0].length - 1];

        return sum;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        // int[][] arr = {
        // { 12, 3, 4, 13, 5 },
        // { 11, 21, 2, 14, 16 },
        // { 7, 8, 9, 15, 0 },
        // { 10, 17, 20, 19, 1 },
        // { 18, 22, 30, 25, 6 }
        // };
        // GridPath gp = new GridPath(arr);
        // Location l = gp.getNextLoc(0, 0);
        // System.out.println(l.getRow() + "-" + l.getCol());
        // l = gp.getNextLoc(1, 3);
        // System.out.println(l.getRow() + "-" + l.getCol());
        // l = gp.getNextLoc(2, 4);
        // System.out.println(l.getRow() + "-" + l.getCol());
        // l = gp.getNextLoc(4, 3);
        // System.out.println(l.getRow() + "-" + l.getCol());

        int[][] arr = {
                { 12, 30, 40, 25, 5 },
                { 11, 3, 22, 15, 43 },
                { 7, 2, 9, 4, 0 },
                { 8, 33, 18, 6, 1 }
        };
        GridPath gp = new GridPath(arr);
        System.out.println(gp.sumPath(1, 1));

    }
}