import java.util.Scanner;

/*
Chinese Zodiac Calculator

Write a Java program that takes the user's birth year and calculates the Chinese zodiac sign.

How the Chinese zodiac is calculated:
The sign is determined by the remainder when the birth year is divided by 12.

Birth Year % 12 = 0 -> Monkey
Birth Year % 12 = 1 -> Rooster
Birth Year % 12 = 2 -> Dog
Birth Year % 12 = 3 -> Pig
Birth Year % 12 = 4 -> Rat
Birth Year % 12 = 5 -> Ox
Birth Year % 12 = 6 -> Tiger
Birth Year % 12 = 7 -> Rabbit
Birth Year % 12 = 8 -> Dragon
Birth Year % 12 = 9 -> Snake
Birth Year % 12 = 10 -> Horse
Birth Year % 12 = 11 -> Goat
*/
public class Homework02 {
    public static void main(String[] args) {
        int birthYear;
        int remainder;
        String zodiacSign;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = input.nextInt();

        if (birthYear <= 0) {
            System.out.println("Invalid year! It must be greater than 0.");
            return;
        }

        remainder = birthYear % 12;

        switch (remainder) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            default:
                zodiacSign = "Goat";
                break;
        }

        System.out.println("Your Chinese zodiac sign is: " + zodiacSign);
    }
}
