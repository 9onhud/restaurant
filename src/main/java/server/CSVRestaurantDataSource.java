package server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by 708 on 10/27/2017.
 */
public class CSVRestaurantDataSource implements RestaurantDataSource {

    private String filename;

    public CSVRestaurantDataSource(String filename) {
        this.filename = filename;
    }


    public Map<String, Restaurant> getAllRestaurants() {
        Map<String, Restaurant>  restaurants = new Hashtable<String, Restaurant>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));

            for (String line = in.readLine(); line != null; line = in.readLine()) {
                String[] data = line.split(",");
                // data[0] = name, data[1] = address
                restaurants.put(data[0], new Restaurant(data[0], data[1]));
            }
        } catch(FileNotFoundException e) {
            System.err.println("Restaurant data file name is incorrect");
            System.exit(1);
        } catch(IOException e) {
            System.err.println("Problems reading restaurant data file");
            System.exit(1);
        }
        return restaurants;
    }
}
