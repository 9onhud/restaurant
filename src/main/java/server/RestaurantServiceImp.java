package server;

import common.RestaurantService;

import java.util.Map;

/**
 * Created by 708 on 10/27/2017.
 */
public class RestaurantServiceImp implements RestaurantService {


    Map<String, Restaurant> restaurants;
    RestaurantDataSource source;

    public RestaurantServiceImp(RestaurantDataSource source) {
        this.source = source;
        this.restaurants = source.getAllRestaurants();
    }



    public String getAddress(String name) {
        return restaurants.get(name).getAddress();
    }


    public void applyMember(String name, String customer) {
        restaurants.get(name).addMember(customer);
    }


    public boolean isMember(String name, String customer) {
        return restaurants.get(name).isMember(customer);
    }

}
