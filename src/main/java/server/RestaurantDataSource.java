package server;

import java.util.Map;

/**
 * Created by 708 on 10/27/2017.
 */
public interface RestaurantDataSource {

    /**
     *
     * @return A map of name to its restaurant information
     */
    Map<String, Restaurant> getAllRestaurants();

}
