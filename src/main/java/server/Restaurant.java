package server;

import java.util.List;
import java.util.Vector;

/**
 * Created by 708 on 10/27/2017.
 */
public class Restaurant {

    private String name;
    private String address;
    private List<String> members;

    /**
     * Create a restaurant with given name and address.
     * @param name Name of the restaurant
     * @param address Address of the restaurant
     */
    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        members = new Vector<String>();
    }

    public String getName() { return name; }
    public String getAddress() { return address; }

    /**
     * Register the given customer as a member
     * @param customer The name of the customer who wants to apply for member
     */
    public void addMember(String customer) {
        members.add(customer);
    }

    /**
     * Check whether the customer is a member of this restaurant
     * @param customer The name of the customer to be checked
     * @return true if the customer is a member; false otherwise.
     */
    public boolean isMember(String customer) {
        return members.contains(customer);
    }
}
