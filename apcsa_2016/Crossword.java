package apcsa_2016;

public class Crossword {
    /**
     * Each element is a Square object with a color (black or white) and a number.
     * puzzle[r][c] represents the square in row r, column c.
     * There is at least one row in the puzzle.
     */
    private Square[][] puzzle;

    /**
     * Constructs a crossword puzzle grid.
     * Precondition: There is at least one row in blackSquares.
     * Postcondition:
     * - The crossword puzzle grid has the same dimensions as blackSquares.
     * - The Square object at row r, column c in the crossword puzzle grid is black
     * if and only if blackSquares[r][c] is true.
     * - The squares in the puzzle are labeled according to the crossword labeling
     * rule.
     */
    public Crossword(boolean[][] blackSquares) {
        /* to be implemented in part (b) */
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int value = 1;
        for (int r = 0; r < blackSquares.length; r++) {
            for (int c = 0; c < blackSquares[0].length; c++) {
                if (toBeLabeled(r, c, blackSquares))
                    puzzle[r][c] = new Square(false, value++);
                else
                    puzzle[r][c] = new Square(true, 0);
            }
        }
    }

    /**
     * Returns true if the square at row r, column c should be labeled with a
     * positive number;
     * false otherwise.
     * The square at row r, column c is black if and only if blackSquares[r][c] is
     * true.
     * Precondition: r and c are valid indexes in blackSquares.
     */
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        /* to be implemented in part (a) */
        if (blackSquares[r][c])
            return false;

        if (r - 1 < 0 || c - 1 < 0)
            return true;

        return blackSquares[r - 1][c] || blackSquares[r][c - 1];
    }

    public void printPuzzle() {
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                System.out.print(puzzle[r][c].getNum() + " ");
            }
            System.out.println();
        }
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        boolean[][] bs = {
                { true, false, false, true, true, true, false, false, false },
                { false, false, false, false, true, false, false, false, false },
                { false, false, false, false, false, false, true, true, true },
                { false, false, true, false, false, false, true, false, false },
                { true, true, true, false, false, false, false, false, false },
                { false, false, false, false, true, false, false, false, false },
                { false, false, false, true, true, true, false, false, true }
        };

        Crossword cw = new Crossword(bs);
        cw.printPuzzle();
    }
}
