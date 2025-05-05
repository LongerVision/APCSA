package apcsa_2016;

public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message) {
        /* to be implemented in part (a) */
        int n = message.indexOf(":");
        this.machineId = message.substring(0, n);
        this.description = message.substring(n + 1);
    }

    public void setDescription(String s) {
        this.description = s;
    }

    /**
     * Returns true if the description in this log message properly contains
     * keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword) {
        /* to be implemented in part (b) */
        int len = keyword.length();
        for (int i = 0; i < description.length() - len + 1; i++) {
            String sub = description.substring(i, i + len);
            if (sub.equals(keyword)) {
                if (i == 0 || description.substring(i - 1, i).equals(" ")) {
                    if (i == description.length() - len || description.substring(i + len, i + len + 1).equals(" "))
                        return true;
                }
            }
        }

        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        LogMessage lm = new LogMessage("CLIENT3:security alert – repeated login failures ");
        // System.out.println(lm.getMachineId());
        // System.out.println(lm.getDescription());
        lm.setDescription("disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on /dev/disk disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on disk DSK1");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("DISK");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on disk3");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("error on /dev/disk");
        System.out.println(lm.containsWord("disk"));
        lm.setDescription("diskette");
        System.out.println(lm.containsWord("disk"));
    }
}
