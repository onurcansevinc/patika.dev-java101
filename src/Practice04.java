/*
Taximeter Program

Write a Java program that prints the taximeter fare based on the traveled distance in kilometers.

The taximeter costs 2.20 TL per kilometer.
The minimum payment is 20 TL. If the fare is below 20 TL, the customer still pays 20 TL.
The opening fare is 10 TL.
*/

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        double startPrice = 10;
        double minPrice = 20;
        double pricePerKm = 2.20;
        double distanceInKm;
        double totalPrice;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance in kilometers: ");

        distanceInKm = input.nextDouble();
        if (distanceInKm < 0) {
            System.out.println("Invalid distance! It must be 0 or greater.");
            return;
        }

        totalPrice = startPrice + (distanceInKm * pricePerKm);
        System.out.println("Your payment is: " + (Math.max(totalPrice, minPrice)));
    }
}
