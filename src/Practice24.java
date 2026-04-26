import java.util.Scanner;

/*
Palindrome Number Checker

Write a Java program that checks whether a number is a palindrome number.

A palindrome number reads the same from left to right and from right to left.
Examples: 1, 4, 8, 99, 101, 363, 4004, 9889
*/
public class Practice24 {
    static boolean isPalindrome(int number) {
        int temp = number;
        int reversedNumber = 0;
        int lastDigit;

        while (temp != 0) {
            lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }

        return number == reversedNumber;
    }

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid number! It must be 0 or greater.");
            return;
        }

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
