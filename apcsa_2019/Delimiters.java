package apcsa_2019;

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> res = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                res.add(token);
            }
        }

        return res;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int nbOfOpenDel = 0;
        int nbOfCloseDel = 0;
        for (String s : delimiters) {
            if (s.equals(this.openDel))
                nbOfOpenDel++;
            else if (s.equals(this.closeDel))
                nbOfCloseDel++;

            if (nbOfCloseDel > nbOfOpenDel)
                return false;
        }

        return nbOfOpenDel == nbOfCloseDel;
    }

    public static void main(String[] args) {
        // String[] ss = {
        // "(", "x + y", ")", " * 5"
        // };
        // String[] ss = {
        // "<q>", "yy", "</q>", "zz", "</q>"
        // };
        String[] ss = {
                "<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"
        };
        // String[] ss = {
        // "<sup>", "</sup>", "</sup>", "<sup>"
        // };
        // String[] ss = {
        // "<sup>", "<sup>", "</sup>"
        // };
        Delimiters d = new Delimiters("<sup>", "</sup>");
        ArrayList<String> as = d.getDelimitersList(ss);
        System.out.println(d.isBalanced(as));
        // System.out.println(as.size());
        // for (String s : as)
        // System.out.println(s);
    }
}
