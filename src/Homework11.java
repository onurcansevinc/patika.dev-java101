import java.util.Scanner;

/*
Recursive Number Pattern

Write a Java program that uses a recursive method to apply this rule:
- Subtract 5 from the entered number until the value becomes 0 or negative.
- Then add 5 until the original number is reached again.
- Print every value during both phases.
*/
public class Homework11 {
    static void printPattern(int currentNumber, int originalNumber, boolean decreasing) {
        System.out.print(currentNumber + " ");

        if (decreasing) {
            if (currentNumber <= 0) {
                printPattern(currentNumber + 5, originalNumber, false);
            } else {
                printPattern(currentNumber - 5, originalNumber, true);
            }
        } else if (currentNumber < originalNumber) {
            printPattern(currentNumber + 5, originalNumber, false);
        }
    }

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        number = input.nextInt();

        printPattern(number, number, true);
    }
}
