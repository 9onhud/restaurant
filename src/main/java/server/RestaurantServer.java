package server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 708 on 10/27/2017.
 */
public class RestaurantServer {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("server.xml");

        System.out.println("Server has start");
    }
}
