import java.util.Scanner;

/*
GCD and LCM Calculator

Write a Java program that calculates the GCD and LCM of two numbers by using while loops.

Formula
LCM = (n1 * n2) / GCD
*/
public class Practice23 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int smallerNumber;
        int divisor = 1;
        int gcd = 1;
        int lcm;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        if (firstNumber <= 0 || secondNumber <= 0) {
            System.out.println("Invalid numbers! Both values must be greater than 0.");
            return;
        }

        smallerNumber = firstNumber < secondNumber ? firstNumber : secondNumber;

        while (divisor <= smallerNumber) {
            if (firstNumber % divisor == 0 && secondNumber % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }

        lcm = (firstNumber * secondNumber) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
