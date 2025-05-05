import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    public WordChecker(String[] wl) {
        wordList = new ArrayList<>();
        for (String w : wl)
            wordList.add(w);
    }

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        /* to be implemented in part (a) */
        for (int i = 0; i < wordList.size() - 1; i++) {
            if (wordList.get(i + 1).indexOf(wordList.get(i)) < 0)
                return false;
        }
        return true;
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) {
        /* to be implemented in part (b) */
        ArrayList<String> res = new ArrayList<>();
        int len = target.length();
        for (String w : this.wordList) {
            if (w.indexOf(target) == 0) {
                res.add(w.substring(len));
            }
        }

        return res;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        String[] ss = { "catch", "bobcat", "catchacat", "cat", "at" };
        WordChecker wc = new WordChecker(ss);
        // System.out.println(wc.isWordChain());
        System.out.println(wc.createList("cat"));
        System.out.println(wc.createList("catch"));
        System.out.println(wc.createList("dog"));
    }
}