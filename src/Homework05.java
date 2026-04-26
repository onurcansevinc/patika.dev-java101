import java.util.Scanner;

/*
Perfect Number Checker

Write a Java program that checks whether the entered number is a perfect number.

A perfect number is a number that is equal to the sum of its positive divisors excluding itself.
*/
public class Homework05 {
    public static void main(String[] args) {
        int number;
        int divisorSum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number! It must be greater than 0.");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        if (divisorSum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
