import java.util.Scanner;

/*
Leap Year Calculator

Write a Java program that determines whether the entered year is a leap year.

What is a leap year?

A leap year has 366 days instead of 365. The extra day is added to February.

How is a leap year calculated?

As a general rule, leap years are divisible by 4.
Among years divisible by 100, only those also divisible by 400 are leap years.

For example, 1200, 1600, and 2000 are leap years, but 1700, 1800, and 1900 are not.

Scenario

Enter a year: 2020
2020 is a leap year!

Enter a year: 2021
2021 is not a leap year!
*/
public class Homework03 {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = input.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year! It must be greater than 0.");
            return;
        }

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.printf("%d is a leap year.%n", year);
            } else {
                System.out.printf("%d is not a leap year.%n", year);
            }
        } else if (year % 4 == 0) {
            System.out.printf("%d is a leap year.%n", year);
        } else {
            System.out.printf("%d is not a leap year.%n", year);
        }
    }
}
