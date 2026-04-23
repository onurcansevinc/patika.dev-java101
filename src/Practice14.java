import java.util.Scanner;

/*
Java Loops Practice

Write a Java program that finds the average of the numbers between 0 and the entered number that are divisible by both 3 and 4.
*/
public class Practice14 {
    public static void main(String[] args) {
        int number;
        double sum = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid number! It must be 0 or greater.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 12 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There are no numbers divisible by both 3 and 4 in this range.");
            return;
        }

        double average = sum / count;
        System.out.printf("Average: %.2f%n", average);
    }
}
