import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "restaurant_data.json"; // Update this path
        List<Restaurant> restaurants = RestaurantDataLoader.loadRestaurants(filename);

        Restaurant trendingRestaurant = TrendingRestaurantCalculator.identifyTrendingRestaurant(restaurants);
        if (trendingRestaurant != null) {
            System.out.println("The trending restaurant is: " + trendingRestaurant.getName());
        } else {
            System.out.println("Could not identify the trending restaurant.");
        }
    }
}
