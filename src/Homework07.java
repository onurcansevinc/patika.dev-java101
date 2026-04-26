/*
Prime Numbers Between 1 and 100

Write a Java program that prints the prime numbers between 1 and 100.
*/
public class Homework07 {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
