import java.util.Scanner;

/*
Recursive Power Calculation

Write a Java program that calculates exponentiation by using a recursive method.
*/
public class Homework10 {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base;
        int exponent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        base = input.nextInt();

        System.out.print("Enter the exponent value: ");
        exponent = input.nextInt();

        if (exponent < 0) {
            System.out.println("Invalid exponent! It must be 0 or greater.");
            return;
        }

        System.out.println("Result: " + power(base, exponent));
    }
}
