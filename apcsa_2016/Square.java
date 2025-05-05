package apcsa_2016;

public class Square {
    private boolean isBlack;
    private int num;

    /**
     * Constructs one square of a crossword puzzle grid.
     * Postcondition:
     * - The square is black if and only if isBlack is true.
     * - The square has number num.
     */
    public Square(boolean isBlack, int num) {
        /* implementation not shown */
        this.isBlack = isBlack;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
}