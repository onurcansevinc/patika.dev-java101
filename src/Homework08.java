import java.util.Scanner;

/*
Fibonacci Series Calculator

Write a Java program that takes the number of elements from the user
and prints the Fibonacci series.
*/
public class Homework08 {
    public static void main(String[] args) {
        int elementCount;
        int firstNumber = 0;
        int secondNumber = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        elementCount = input.nextInt();

        if (elementCount <= 0) {
            System.out.println("Invalid count! It must be greater than 0.");
            return;
        }

        System.out.print("Fibonacci series: ");

        for (int i = 0; i < elementCount; i++) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
