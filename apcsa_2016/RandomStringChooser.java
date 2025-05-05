package apcsa_2016;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> as;

    public RandomStringChooser(String[] arr) {
        as = new ArrayList<>();
        for (String s : arr)
            as.add(s);
    }

    public String getNext() {
        if (!as.isEmpty()) {
            // Math.random() [0.0,1,0)=>[0, as.size())
            int n = (int) (Math.random() * as.size());
            String res = as.get(n);
            as.remove(n);
            return res;
        }
        return "NONE";
    }

    public static void main(String[] args) {
        String[] wordArray = { "wheels", "on", "the", "bus" };
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }
    }
}
