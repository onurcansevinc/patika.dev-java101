import java.util.Scanner;

/*
Combination Calculator

Write a Java program that calculates the combination C(n, r).

Combination Formula
C(n, r) = n! / (r! * (n-r)!)
*/
public class Practice17 {
    public static void main(String[] args) {
        int n;
        int r;
        long nFactorial = 1;
        long rFactorial = 1;
        long differenceFactorial = 1;
        long combination;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = input.nextInt();

        System.out.print("Enter r: ");
        r = input.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid values! n and r must be non-negative, and r must not be greater than n.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            differenceFactorial *= i;
        }

        combination = nFactorial / (rFactorial * differenceFactorial);

        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}
