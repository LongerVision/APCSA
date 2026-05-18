public class CourseRecord {
    private String studentID;
    private int absences;

    public CourseRecord(String id, int a) {
        this.studentID = id;
        this.absences = a;
    }

    /*** Returns a unique ID for the student associated with this* CourseRecord */
    public String getStudentID() {
        /* implementation not shown */
        return studentID;
    }

    /***
     * Returns a nonnegative integer representing the number of times the* student
     * associated with this CourseRecord has been absent in the* course
     */
    public int getAbsences() {
        /* implementation not shown */
        return absences;
    }
    /*
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */
}
