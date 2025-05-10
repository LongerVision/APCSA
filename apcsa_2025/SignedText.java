package apcsa_2025;

public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getSignature() {
        if (firstName.isEmpty())
            return lastName;
        else
            return firstName.substring(0, 1) + "-" + lastName;
    }

    // text: "abcde"
    // sig: "cde"
    public String addSignature(String text) {
        String sig = this.getSignature();
        int lenText = text.length();
        int lenSig = sig.length();
        if (lenSig > lenText)
            return text + sig;

        if (!text.contains(sig))
            return text + sig;

        if (text.substring(lenText - lenSig).equals(sig))
            return text;
        else // guaranteed at the beginning
            return text.substring(lenSig) + sig;
    }

    public static void main(String[] args) {
        SignedText st1 = new SignedText("", "Wong");
        String temp = st1.getSignature();
        System.out.println(temp);
        SignedText st2 = new SignedText("henri", "dubois");
        temp = st2.getSignature();
        System.out.println(temp);
        SignedText st3 = new SignedText("GRACE", "LOPEZ");
        temp = st3.getSignature();
        System.out.println(temp);
        SignedText st4 = new SignedText("", "FOX");
        String text = "Dear";
        temp = st4.addSignature(text);
        System.out.println(temp);
        text = "Best wishesFOX";
        temp = st4.addSignature(text);
        System.out.println(temp);
    }
}
