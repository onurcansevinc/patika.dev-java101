import java.util.Scanner;

/*
Airplane Ticket Price Calculator

Write a Java program that calculates the airplane ticket price according to the distance, age, and trip type.

Rules
- Price per kilometer: 0.10 TL
- The distance and age must be positive numbers.
- The trip type must be 1 or 2.
- If the user enters invalid data, print "Invalid input!"
- If the person is younger than 12, apply a 50% discount.
- If the person is between 12 and 24, apply a 10% discount.
- If the person is older than 65, apply a 30% discount.
- If the trip type is round trip, apply a 20% discount and multiply the result by 2.
*/
public class Homework01 {
    public static void main(String[] args) {
        double distanceInKm;
        double basePrice;
        double ageDiscountRate = 0;
        double discountedPrice;
        double totalPrice;
        int age;
        int tripType;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        distanceInKm = input.nextDouble();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip): ");
        tripType = input.nextInt();

        if (distanceInKm <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Invalid input!");
            return;
        }

        basePrice = distanceInKm * 0.10;

        if (age < 12) {
            ageDiscountRate = 0.50;
        } else if (age <= 24) {
            ageDiscountRate = 0.10;
        } else if (age > 65) {
            ageDiscountRate = 0.30;
        }

        discountedPrice = basePrice - (basePrice * ageDiscountRate);

        if (tripType == 2) {
            discountedPrice = discountedPrice * 0.80;
            totalPrice = discountedPrice * 2;
        } else {
            totalPrice = discountedPrice;
        }

        System.out.printf("Total price: %.2f TL%n", totalPrice);
    }
}
