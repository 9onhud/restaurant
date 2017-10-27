package common;

/**
 * Created by 708 on 10/27/2017.
 */
public interface RestaurantService {

    /**
     * Returns an address of the given restaurant's name.
     * @param name The name of the restaurant
     * @return Address of the restaurant
     */
    String getAddress(String name);

    /**
     * Register the given customer's name to the restaurant member list.
     * @param name The name of the restaurant
     * @param customer The name of the customer who wants to be a member
     */
    void applyMember(String name, String customer);

    /**
     * Check whether the customer is a member of the given restaurant.
     * @param name The name of the restaurant
     * @param customer The name of the customer to be checked
     * @return true if the customer is a member; false otherwise.
     */
    boolean isMember(String name, String customer);

}
