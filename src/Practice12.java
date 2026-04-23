import java.util.Scanner;

/*
Assignment
Write a program that sorts 3 entered numbers from smallest to largest.
*/
public class Practice12 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        double temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        System.out.print("Enter the third number: ");
        thirdNumber = input.nextDouble();

        if (firstNumber > secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        if (firstNumber > thirdNumber) {
            temp = firstNumber;
            firstNumber = thirdNumber;
            thirdNumber = temp;
        }

        if (secondNumber > thirdNumber) {
            temp = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp;
        }

        System.out.println("Numbers in ascending order: " + firstNumber + " <= " + secondNumber + " <= " + thirdNumber);
    }
}
