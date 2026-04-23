import java.util.Scanner;

/*
Power Calculator

Write a Java program that calculates a number raised to a power using a for loop.
*/
public class Practice18 {
    public static void main(String[] args) {
        int base;
        int exponent;
        int result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        base = input.nextInt();

        System.out.print("Enter the exponent value: ");
        exponent = input.nextInt();

        if (exponent < 0) {
            System.out.println("Invalid exponent! It must be 0 or greater.");
            return;
        }

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}
