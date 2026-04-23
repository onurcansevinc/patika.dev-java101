import java.util.Scanner;

/*
Java Loops Practice

Write a Java program that keeps accepting input from the user until an odd number is entered.
Among the entered values, calculate and print the sum of the numbers that are even and multiples of 4.
*/
public class Practice15 {
    public static void main(String[] args) {
        int number;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Sum: " + sum);
    }
}
