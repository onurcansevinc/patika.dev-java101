import java.util.Scanner;

/*
Minimum and Maximum Number Finder

Write a Java program that finds and prints the largest and smallest numbers
among N integers entered from the keyboard.
*/
public class Homework04 {
    public static void main(String[] args) {
        int count;
        int number;
        int minNumber;
        int maxNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");
        count = input.nextInt();

        if (count <= 0) {
            System.out.println("Invalid count! It must be greater than 0.");
            return;
        }

        System.out.print("Enter number 1: ");
        number = input.nextInt();
        minNumber = number;
        maxNumber = number;

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            if (number < minNumber) {
                minNumber = number;
            }

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Largest number: " + maxNumber);
        System.out.println("Smallest number: " + minNumber);
    }
}
