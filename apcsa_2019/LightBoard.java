package apcsa_2019;

public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                // [0.0, 1.0) => [0.0, 0.4), [0.4, 1.0)
                lights[r][c] = Math.random() < 0.4;
            }
        }
    }

    public LightBoard(boolean[][] b) {
        this.lights = b;
    }

    public boolean evaluateLight(int row, int col) {
        int counter = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col])
                counter++;
        }

        if (lights[row][col]) {
            if (counter % 2 == 0)
                return false;
        } else {
            if (counter % 3 == 0)
                return true;
        }

        return lights[row][col];
    }

    public static void main(String[] args) {
        // LightBoard sim = new LightBoard(7, 5);

        boolean[][] b = {
                { true, true, false, true, true },
                { true, false, false, true, false },
                { true, false, false, true, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, true, false, true, true },
                { false, false, false, false, false }
        };

        LightBoard sim = new LightBoard(b);
        System.out.println(sim.evaluateLight(0, 3));
        System.out.println(sim.evaluateLight(6, 0));
        System.out.println(sim.evaluateLight(4, 1));
        System.out.println(sim.evaluateLight(5, 4));
    }
}
