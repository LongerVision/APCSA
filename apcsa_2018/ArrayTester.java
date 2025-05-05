package apcsa_2018;

public class ArrayTester {
    /**
     * Returns an array containing the elements of column c of arr2D in the same
     * order as
     * they appear in arr2D.
     * Precondition: c is a valid column index in arr2D.
     * Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {
        /* to be implemented in part (a) */
        int[] res = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++)
            res[r] = arr2D[r][c];
        return res;
    }

    /**
     * Returns true if and only if every value in arr1 appears in arr2.
     * Precondition: arr1 and arr2 have the same length.
     * Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        /* implementation not shown */
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }

        return true;
    }

    /**
     * Returns true if arr contains any duplicate values;
     * false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        /* implementation not shown */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    /**
     * Returns true if square is a Latin square as described in part (b);
     * false otherwise.
     * Precondition: square has an equal number of rows and columns.
     * square has at least one row.
     */
    public static boolean isLatin(int[][] square) {
        /* to be implemented in part (b) */
        if (ArrayTester.containsDuplicates(square[0]))
            return false;

        for (int r = 1; r < square.length; r++) {
            if (!ArrayTester.hasAllValues(square[0], square[r]))
                return false;
        }

        for (int c = 0; c < square[0].length; c++) {
            int[] col = ArrayTester.getColumn(square, c);
            if (!ArrayTester.hasAllValues(square[0], col))
                return false;
        }

        return true;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // int[][] arr2D = { { 0, 1, 2 },
        // { 3, 4, 5 },
        // { 6, 7, 8 },
        // { 9, 5, 3 } };
        // int[] result = ArrayTester.getColumn(arr2D, 1);
        // ArrayTester.printArray(result);
        // int[][] arr2D = {
        // { 1, 2, 3 },
        // { 2, 3, 1 },
        // { 3, 1, 2 }
        // };
        // int[][] arr2D = {
        // { 10, 30, 20, 0 },
        // { 0, 20, 30, 10 },
        // { 30, 0, 10, 20 },
        // { 20, 10, 0, 30 }
        // };
        int[][] arr2D = {
                { 1, 2 },
                { 1, 2 }
        };
        System.out.println(ArrayTester.isLatin(arr2D));
    }
}
