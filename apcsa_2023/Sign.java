package apcsa_2023;

public class Sign {
    private String text;
    private int width;

    public Sign(String t, int w) {
        this.text = t;
        this.width = w;
    }

    public int numberOfLines() {
        if (this.text.length() % this.width == 0)
            return this.text.length() / this.width;
        return this.text.length() / this.width + 1;
    }

    public String getLines() {
        if (text.isEmpty())
            return null;

        int nl = this.numberOfLines();
        if (nl == 1)
            return this.text;

        String res = "";
        for (int i = 0; i < nl - 1; i++) {
            res += this.text.substring(i * this.width, (i + 1) * this.width) + ";";
        }

        res += this.text.substring((nl - 1) * this.width);

        return res;
    }

    public static void main(String[] args) {
        String str;
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines();
        System.out.println(x);
        str = sign1.getLines();
        System.out.println(str);
        str = sign1.getLines();
        System.out.println(str);
        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines();
        System.out.println(x);
        str = sign2.getLines();
        System.out.println(str);
        Sign sign3 = new Sign("ABCDEF", 6);
        x = sign3.numberOfLines();
        System.out.println(x);
        str = sign3.getLines();
        System.out.println(str);
        Sign sign4 = new Sign("", 4);
        x = sign4.numberOfLines();
        System.out.println(x);
        str = sign4.getLines();
        System.out.println(str);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        x = sign5.numberOfLines();
        System.out.println(x);
        str = sign5.getLines();
        System.out.println(str);
    }
}
