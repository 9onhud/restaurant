package client;

import common.RestaurantService;

import java.util.Scanner;

/**
 * Created by 708 on 10/27/2017.
 */
public class RestaurantUI {

    private RestaurantService service;

    public RestaurantUI(RestaurantService service) {
        this.service = service;
    }

    public void start() {

        System.out.println("Welcome to Restaurant Service");

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("\nPlease enter restaurant name: ");
            String name = in.nextLine();

            System.out.println("Address: "+service.getAddress(name));

            System.out.print("Do you want to apply member: ");
            String ans = in.nextLine();

            if (ans.equalsIgnoreCase("yes")) {
                System.out.print("Enter your name: ");
                String customer = in.nextLine();
                service.applyMember(name, customer);

                System.out.println("You are now member? "+service.isMember(name, customer));
            }
        }

    }

}
