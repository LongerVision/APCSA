package apcsa_2015;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;

        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] res = new int[arr2D.length];
        for (int i = 0; i < res.length; i++)
            res[i] = DiverseArray.arraySum(arr2D[i]);

        return res;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] rs = DiverseArray.rowSums(arr2D);
        for (int i = 0; i < rs.length - 1; i++) {
            for (int j = i + 1; j < rs.length; j++) {
                if (rs[i] == rs[j])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 2, 7, 3 };
        // System.out.println(DiverseArray.arraySum(arr));
        // int[][] mat1 = {
        // { 1, 3, 2, 7, 3 },
        // { 10, 10, 4, 6, 2 },
        // { 5, 3, 5, 9, 6 },
        // { 7, 6, 4, 2, 1 }
        // };
        int[][] mat2 = {
                { 1, 1, 5, 3, 4 },
                { 12, 7, 6, 1, 9 },
                { 8, 11, 10, 2, 5 },
                { 3, 2, 3, 0, 6 }
        };

        // int[] res = DiverseArray.rowSums(mat1);
        // for (int i : res)
        // System.out.print(i + " ");
        // System.out.println();
        // System.out.println(DiverseArray.isDiverse(mat1));
        System.out.println(DiverseArray.isDiverse(mat2));
    }
}
