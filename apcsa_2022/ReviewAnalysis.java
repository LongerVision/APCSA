package apcsa_2022;

import java.util.ArrayList;

public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;

    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis() {
        /* implementation not shown */
        allReviews = new Review[5];
        allReviews[0] = new Review(4, "Good Thx");
        allReviews[1] = new Review(3, "OK site");
        allReviews[2] = new Review(5, "Great");
        allReviews[3] = new Review(2, "Poor Bad.");
        allReviews[4] = new Review(3, "");
    }

    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() {
        /* to be implemented in part (a) */
        int sum = 0;
        for (Review r : allReviews) {
            sum += r.getRating();
        }

        return (double) (sum) / allReviews.length;
    }

    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() {
        /* to be implemented in part (b) */
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < allReviews.length; i++) {
            String comment = allReviews[i].getComment();
            if (comment.contains("!")) { // indexOf
                String str = i + "-" + comment;
                if (!comment.endsWith(".") && !comment.endsWith("!"))
                    str += ".";
                res.add(str);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ReviewAnalysis ra = new ReviewAnalysis();
        // System.out.println(ra.getAverageRating());

        ArrayList<String> as = ra.collectComments();

        for (String s : as)
            System.out.println(s);
    }
}