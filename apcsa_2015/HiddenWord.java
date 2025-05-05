package apcsa_2015;

public class HiddenWord {
    private String word;

    public HiddenWord(String str) {
        this.word = str;
    }

    public String getHint(String guess) {
        String res = "";
        int len = guess.length();
        for (int i = 0; i < len; i++) {
            String s = guess.substring(i, i + 1);
            int idx = word.indexOf(s);
            if (i == idx)
                res += s;
            else if (idx >= 0)
                res += "+";
            else
                res += "*";
        }

        return res;
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}
