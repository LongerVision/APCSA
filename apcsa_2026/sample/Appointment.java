public class Appointment {
    private String status;
    private int roomNumber;

    public Appointment(String s, int r) {
        this.status = s;
        this.roomNumber = r;
    }

    /** * Returns the status of the appointment ("free", "busy", etc.) */
    public String getStatus() {
        /* implementation not shown */
        return status;
    }

    /** * Returns the room number of the appointment location */
    public int getRoomNumber() {
        /* implementation not shown */
        return roomNumber;
    }

    /*
     * There may be instance variables, constructors, and methods
     * that are not shown.
     */
}