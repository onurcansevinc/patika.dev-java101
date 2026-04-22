/*
* VAT Amount Calculator Program

Write a Java program that takes a money amount from the user, calculates the price with VAT and the VAT amount, and prints them to the screen.

(Note: Use 18% as the VAT rate.)

Price without VAT = 10;

Price with VAT = 11.8;

VAT amount = 1.8;

Assignment
If the entered amount is between 0 and 1000 TL, use 18% as the VAT rate. If the amount is greater than 1000 TL, use 8% as the VAT rate.
* */

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        double amount, vatRate = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount: ");

        amount = input.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount! It must be 0 or greater.");
            return;
        }

        if (amount > 1000) {
            vatRate = 0.08;
        }

        double vatAmount = amount * vatRate;
        double amountWithVat = amount + vatAmount;

        System.out.println("VAT rate: " + vatRate);
        System.out.println("VAT amount: " + vatAmount);
        System.out.println("Amount with VAT: " + amountWithVat);

    }
}
