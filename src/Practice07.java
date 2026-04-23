import java.util.Scanner;

/*
Greengrocer Cash Register Program

Write a Java program that calculates and prints the total cost of products purchased from a greengrocer based on their weights in kilograms.

Products and Prices per Kilogram

Pear: 2.14 TL
Apple: 3.67 TL
Tomato: 1.11 TL
Banana: 0.95 TL
Eggplant: 5.00 TL
*/
public class Practice07 {
    public static void main(String[] args) {
        double pearPricePerKg = 2.14;
        double applePricePerKg = 3.67;
        double tomatoPricePerKg = 1.11;
        double bananaPricePerKg = 0.95;
        double eggplantPricePerKg = 5.00;

        double pearKg;
        double appleKg;
        double tomatoKg;
        double bananaKg;
        double eggplantKg;
        double totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kilograms of pears? ");
        pearKg = input.nextDouble();
        if (pearKg < 0) {
            System.out.println("Invalid weight! It must be 0 or greater.");
            return;
        }

        System.out.println("How many kilograms of apples? ");
        appleKg = input.nextDouble();
        if (appleKg < 0) {
            System.out.println("Invalid weight! It must be 0 or greater.");
            return;
        }

        System.out.println("How many kilograms of tomatoes? ");
        tomatoKg = input.nextDouble();
        if (tomatoKg < 0) {
            System.out.println("Invalid weight! It must be 0 or greater.");
            return;
        }

        System.out.println("How many kilograms of bananas? ");
        bananaKg = input.nextDouble();
        if (bananaKg < 0) {
            System.out.println("Invalid weight! It must be 0 or greater.");
            return;
        }

        System.out.println("How many kilograms of eggplants? ");
        eggplantKg = input.nextDouble();
        if (eggplantKg < 0) {
            System.out.println("Invalid weight! It must be 0 or greater.");
            return;
        }

        totalPrice = (pearKg * pearPricePerKg)
                + (appleKg * applePricePerKg)
                + (tomatoKg * tomatoPricePerKg)
                + (bananaKg * bananaPricePerKg)
                + (eggplantKg * eggplantPricePerKg);

        System.out.println("Total price: " + totalPrice + " TL");
    }
}
