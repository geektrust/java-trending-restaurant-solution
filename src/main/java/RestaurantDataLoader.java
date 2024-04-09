import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RestaurantDataLoader {
    public static List<Restaurant> loadRestaurants(String filename) {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            JSONObject j = new JSONObject();
            Object o = new JSONParser().parse(new FileReader(filename));
            for (Object key : (JSONArray) o) {
                j = (JSONObject) key;
                String name = (String)j.get("name");
                double averageRating = Double.parseDouble((String)j.get("averageRating"));
                int totalReviews = Integer.parseInt((String)j.get("totalReviews"));
                int numberOfReviewsInLast30Days = Integer.parseInt((String)j.get("numberOfReviewsInLast30Days"));

                Restaurant r = new Restaurant(name, averageRating, totalReviews, numberOfReviewsInLast30Days);
                restaurants.add(r);
            }
            
            return restaurants;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
