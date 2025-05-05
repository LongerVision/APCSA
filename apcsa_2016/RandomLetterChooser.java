package apcsa_2016;

public class RandomLetterChooser extends RandomStringChooser {
    /**
     * Constructs a random letter chooser using the given string str.
     * Precondition: str contains only letters.
     */
    public RandomLetterChooser(String str) {
        /* to be implemented in part (b) */
        super(getSingleLetters(str));
    }

    /**
     * Returns an array of single-letter strings.
     * Each of these strings consists of a single letter from str. Element k
     * of the returned array contains the single letter at position k of str.
     * For example, getSingleLetters("cat") returns the
     * array { "c", "a", "t" }.
     */
    public static String[] getSingleLetters(String str) {
        /* implementation not shown */
        int len = str.length();
        String[] res = new String[len];
        for (int i = 0; i < len; i++)
            res[i] = str.substring(i, i + 1);

        return res;
    }

    public static void main(String[] args) {
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
    }
}