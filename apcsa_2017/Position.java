package apcsa_2017;

public class Position {
    /** Constructs a Position object with row r and column c. */
    private int r;
    private int c;

    public Position(int r, int c) {
        /* implementation not shown */
        this.r = r;
        this.c = c;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

    public void printPosition() {
        System.out.print("(" + this.r + "," + this.c + ")");
    }

    public static Position findPosition(int num, int[][] intArr) {
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[0].length; c++) {
                if (intArr[r][c] == num)
                    return new Position(r, c);
            }
        }

        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] res = new Position[intArr.length][intArr[0].length];
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[0].length; c++) {
                Position p = Position.findPosition(intArr[r][c] + 1, intArr);
                res[r][c] = p;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 15, 5, 9, 10 },
                { 12, 16, 11, 6 },
                { 14, 8, 13, 7 }
        };
        // Position res = Position.findPosition(8, arr);
        // res.printPosition();
        // res = Position.findPosition(17, arr);
        // if (res != null)
        // res.printPosition();
        // else
        // System.out.println("The result is null.");
        Position[][] res = Position.getSuccessorArray(arr);
        for (int r = 0; r < res.length; r++) {
            for (int c = 0; c < res[0].length; c++) {
                if (res[r][c] != null) {
                    res[r][c].printPosition();
                    System.out.print(" ");
                } else {
                    System.out.print("null ");
                }
            }
            System.out.println();
        }
    }
}
