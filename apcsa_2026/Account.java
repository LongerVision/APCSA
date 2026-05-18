public class Account {
    private String username; // To be initialized in part (a)/*** Creates a username based on the parameter
                             // requestedName. If the* username is unavailable, appends successive integers,
                             // beginning* with 1, to requestedName until an available username is found,* as
                             // described in part (a).*

    public Account(String requestedName) {
        /*
         * to be
         * // implemented in part (a)
         */
        if (Account.isAvailable(requestedName))
            this.username = requestedName;
        else {
            int n = 1;
            while (true) {
                if (Account.isAvailable(requestedName + n)) {
                    this.username = requestedName + n;
                    break;
                } else
                    n++;
            }
        }
    }

    /***
     * Returns true if the parameter str is an
     * // available username;* returns false otherwise.
     */
    public static boolean isAvailable(String str) {
        /* implementation not shown */
        if (str.equals("PSmith"))
            return true;
        if (str.equals("Luis-Cruz3"))
            return true;
        if (str.equals("SammyB3"))
            return true;
        if (str.equals("Amy-Marie-Lin"))
            return true;

        return false;
    }

    /***
     * Returns a
     * // shortened version of username with each hyphen ("-")* and the character
     * // before it removed, as described in part (b)* Preconditions: username does
     * not
     * // start or end with a hyphen.* username does not contain consecutive
     * hyphens.*
     * // username.length() >= 2* Postcondition: username is unchanged.
     */
    public String getShortenedName() {
        /* to be implemented in part (b) */
        String res = "";
        int idx = this.username.indexOf("-");
        if (idx < 0)
            return this.username;

        String tmp = this.username;
        while (idx > 0) {
            res += tmp.substring(0, idx - 1);
            tmp = tmp.substring(idx + 1);
            idx = tmp.indexOf("-");
        }
        res += tmp;

        return res;
    }

    /*
     * There may be
     * // instance variables, constructors, and methods that are not shown.
     */

    public void printUsername() {
        System.out.println(this.username);
    }

    public static void main(String[] args) {
        Account a = new Account("Amy-Marie-Lin");
        a.printUsername();
        String res = a.getShortenedName();
        System.out.println(res);
    }
}