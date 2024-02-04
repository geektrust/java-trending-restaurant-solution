import java.util.List;

public class TrendingRestaurantCalculator {
    public static Restaurant identifyTrendingRestaurant(List<Restaurant> restaurants) {
        if (restaurants == null || restaurants.isEmpty()) {
            return null;
        }

        double maxReviewsLast30Days = restaurants.stream()
                .mapToInt(Restaurant::getNumberOfReviewsInLast30Days)
                .max()
                .orElse(1); // Avoid division by zero

        for (Restaurant restaurant : restaurants) {
            double normalizedReviewCount = (double) restaurant.getNumberOfReviewsInLast30Days() / maxReviewsLast30Days;
            double score = 0.7 * restaurant.getAverageRating() + 0.3 * normalizedReviewCount;
            restaurant.setScore(score);
        }

        return restaurants.stream()
                .max((restaurant1, restaurant2) -> Double.compare(restaurant1.getScore(), restaurant2.getScore()))
                .orElse(null);
    }
}
