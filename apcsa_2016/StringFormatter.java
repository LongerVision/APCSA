package apcsa_2016;

import java.util.ArrayList;

public class StringFormatter {
    public static int totalLetters(ArrayList<String> wordList) {
        int len = 0;
        for (String word : wordList)
            len += word.length();

        return len;
    }

    public static int basicGapWidth(ArrayList<String> wordList,
            int formattedLen) {
        int nbOfSpaces = formattedLen - StringFormatter.totalLetters(wordList);

        return nbOfSpaces / (wordList.size() - 1);
    }

    public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen) {
        int nbOfSpaces = formattedLen - StringFormatter.totalLetters(wordList);

        return nbOfSpaces % (wordList.size() - 1);
    }

    public static String format(ArrayList<String> wordList, int formattedLen) {
        String res = wordList.get(0);
        int basicNbOfSpaces = StringFormatter.basicGapWidth(wordList, formattedLen);
        int leftoverNbOfSpaces = StringFormatter.leftoverSpaces(wordList, formattedLen);
        for (int i = 1; i < wordList.size(); i++) {
            for (int k = 0; k < basicNbOfSpaces; k++)
                res += "/";
            if (leftoverNbOfSpaces > 0) {
                res += "/";
                leftoverNbOfSpaces--;
            }
            res += wordList.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
        // as.add("AP");
        // as.add("COMP");
        // as.add("SCI");
        // as.add("ROCKS");
        // as.add("GREEN");
        // as.add("EGGS");
        // as.add("AND");
        // as.add("HAM");
        as.add("BEACH");
        as.add("BALL");

        System.out.println(StringFormatter.format(as, 20));

    }
}
