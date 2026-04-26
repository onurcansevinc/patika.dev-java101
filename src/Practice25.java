import java.util.Scanner;

/*
Recursive Fibonacci Series

Write a Java program that prints the Fibonacci series by using a recursive method.
*/
public class Practice25 {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int elementCount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        elementCount = input.nextInt();

        if (elementCount <= 0) {
            System.out.println("Invalid count! It must be greater than 0.");
            return;
        }

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < elementCount; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
