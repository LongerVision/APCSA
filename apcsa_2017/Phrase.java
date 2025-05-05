package apcsa_2017;

public class Phrase {
    private String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p) {
        currentPhrase = p;
    }

    /**
     * Returns the index of the nth occurrence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n) {
        /* implementation not shown */
        return 0;
    }

    /**
     * Modifies the current phrase by replacing the nth occurrence of str with repl.
     * If the nth occurrence does not exist, the current phrase is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl) {
        /* to be implemented in part (a) */
        int counter = 0;
        int len = str.length();
        for (int i = 0; i < this.currentPhrase.length() - len + 1; i++) {
            String sub = currentPhrase.substring(i, i + len);
            if (sub.equals(str))
                counter++;
            if (counter == n) {
                currentPhrase = currentPhrase.substring(0, i) + repl + currentPhrase.substring(i + len);
                break;
            }
        }
    }

    /**
     * Returns the index of the last occurrence of str in the current phrase;
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str) {
        /* to be implemented in part (b) */
        return currentPhrase.lastIndexOf(str);
    }

    /** Returns a string containing the current phrase. */
    // Chapter5~6, Object. equals(), toString(), hashCode();
    public String toString() {
        return currentPhrase;
    }

    public static void main(String[] args) {
        Phrase phrase1 = new Phrase("A cat ate late.");
        System.out.println(phrase1.findLastOccurrence("at"));
        System.out.println(phrase1.findLastOccurrence("cat"));
        System.out.println(phrase1.findLastOccurrence("bat"));
        // Phrase phrase1 = new Phrase("A cat ate late.");
        // phrase1.replaceNthOccurrence("at", 1, "rane");
        // System.out.println(phrase1);

        // Phrase phrase2 = new Phrase("A cat ate late.");
        // phrase2.replaceNthOccurrence("at", 6, "xx");
        // System.out.println(phrase2);

        // Phrase phrase3 = new Phrase("A cat ate late.");
        // phrase3.replaceNthOccurrence("bat", 2, "xx");
        // System.out.println(phrase3);

        // Phrase phrase4 = new Phrase("aaaa");
        // phrase4.replaceNthOccurrence("aa", 1, "xx");
        // System.out.println(phrase4);

        // Phrase phrase5 = new Phrase("aaaa");
        // phrase5.replaceNthOccurrence("aa", 2, "bbb");
        // System.out.println(phrase5);
    }
}
