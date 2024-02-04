
public class Restaurant {
    private String name;
    private double averageRating;
    private int totalReviews;
    private int numberOfReviewsInLast30Days;
    private double score; // This field will be used to store the calculated score for trending calculation

    // Constructor
    public Restaurant(String name, double averageRating, int totalReviews, int numberOfReviewsInLast30Days) {
        this.name = name;
        this.averageRating = averageRating;
        this.totalReviews = totalReviews;
        this.numberOfReviewsInLast30Days = numberOfReviewsInLast30Days;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public int getNumberOfReviewsInLast30Days() {
        return numberOfReviewsInLast30Days;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
