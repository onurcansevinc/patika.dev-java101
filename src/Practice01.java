//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
* Grade Average Calculator Program
Write a Java program that takes the exam scores for Math, Physics, Chemistry, History, and Music from the user, calculates their average, and prints it to the screen.

Assignment
In the same program, use conditional expressions so that if the user's average is greater than 60, the screen displays "Passed"; otherwise, it displays "Failed".

Note: Use the ternary operator.
*
* */

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mathExamResult, physicsExamResult, chemistryExamResult, historyExamResult, musicExamResult;

        System.out.println("Please enter your Math exam result:");
        mathExamResult = input.nextInt();
        if (mathExamResult < 0 || mathExamResult > 100) {
            System.out.println("Invalid grade! It must be between 0 and 100.");
            return;
        }

        System.out.println("Please enter your Physics exam result:");
        physicsExamResult = input.nextInt();
        if (physicsExamResult < 0 || physicsExamResult > 100) {
            System.out.println("Invalid grade! It must be between 0 and 100.");
            return;
        }

        System.out.println("Please enter your Chemistry exam result:");
        chemistryExamResult = input.nextInt();
        if (chemistryExamResult < 0 || chemistryExamResult > 100) {
            System.out.println("Invalid grade! It must be between 0 and 100.");
            return;
        }

        System.out.println("Please enter your History exam result:");
        historyExamResult = input.nextInt();
        if (historyExamResult < 0 || historyExamResult > 100) {
            System.out.println("Invalid grade! It must be between 0 and 100.");
            return;
        }

        System.out.println("Please enter your Music exam result:");
        musicExamResult = input.nextInt();
        if (musicExamResult < 0 || musicExamResult > 100) {
            System.out.println("Invalid grade! It must be between 0 and 100.");
            return;
        }

        int averageResult = (mathExamResult + physicsExamResult + chemistryExamResult + historyExamResult + musicExamResult) / 5;
        System.out.println(averageResult >= 60 ? "Passed" : "Failed");
    }
}
