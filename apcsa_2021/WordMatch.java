package apcsa_2021;

public class WordMatch {
    /** The secret string. */
    private String secret;

    /**
     * Constructs a WordMatch object with the given secret string of lowercase
     * letters.
     */
    public WordMatch(String word) {
        /* implementation not shown */
        this.secret = word;
    }

    /**
     * Returns a score for guess, as described in part (a).
     * Precondition: 0 < guess.length() <= secret.length()
     */
    // mississippi

    public int scoreGuess(String guess) {
        /* to be implemented in part (a) */
        int count = 0;
        int len = guess.length();
        for (int i = 0; i < secret.length() - len + 1; i++) {
            String sub = secret.substring(i, i + len);
            if (sub.equals(guess))
                count++;
        }
        return count * len * len;
    }

    /**
     * Returns the better of two guesses, as determined by scoreGuess and the rules
     * for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     * guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2) {
        /* to be implemented in part (b) */
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2)
            return guess1;
        else if (score2 > score1)
            return guess2;
        else {
            // equals(), compareTo();
            if (guess1.compareTo(guess2) > 0)
                return guess1;
            else
                return guess2;
        }
    }

    public static void main(String[] args) {
        // WordMatch game = new WordMatch("mississippi");
        // System.out.println(game.scoreGuess("i"));
        // System.out.println(game.scoreGuess("iss"));
        // System.out.println(game.scoreGuess("issipp"));
        // System.out.println(game.scoreGuess("mississippi"));

        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
    }
}
