import java.util.Scanner;

/*
Harmonic Series Calculator

Write a Java program that calculates the harmonic series of the entered number.
*/
public class Practice20 {
    public static void main(String[] args) {
        int number;
        double harmonicSum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number! It must be greater than 0.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println("Harmonic series sum: " + harmonicSum);
    }
}
