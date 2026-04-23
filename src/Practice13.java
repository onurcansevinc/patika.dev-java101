import java.util.Scanner;

/*
Aries: March 21 - April 20
Taurus: April 21 - May 21
Gemini: May 22 - June 22
Cancer: June 23 - July 22
Leo: July 23 - August 22
Virgo: August 23 - September 22
Libra: September 23 - October 22
Scorpio: October 23 - November 21
Sagittarius: November 22 - December 21
Capricorn: December 22 - January 21
Aquarius: January 22 - February 19
Pisces: February 20 - March 20

Assignment
Create the same example without using switch-case.
*/
public class Practice13 {
    public static void main(String[] args) {
        int month;
        int day;
        int maxDay;
        String zodiacSign;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day: ");
        day = input.nextInt();

        System.out.print("Enter the month: ");
        month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! It must be between 1 and 12.");
            return;
        }

        if (month == 2) {
            maxDay = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            maxDay = 31;
        }

        if (day < 1 || day > maxDay) {
            System.out.println("Invalid day for the given month.");
            return;
        }

        if (month == 1) {
            zodiacSign = day < 22 ? "Capricorn" : "Aquarius";
        } else if (month == 2) {
            zodiacSign = day < 20 ? "Aquarius" : "Pisces";
        } else if (month == 3) {
            zodiacSign = day < 21 ? "Pisces" : "Aries";
        } else if (month == 4) {
            zodiacSign = day < 21 ? "Aries" : "Taurus";
        } else if (month == 5) {
            zodiacSign = day < 22 ? "Taurus" : "Gemini";
        } else if (month == 6) {
            zodiacSign = day < 23 ? "Gemini" : "Cancer";
        } else if (month == 7) {
            zodiacSign = day < 23 ? "Cancer" : "Leo";
        } else if (month == 8) {
            zodiacSign = day < 23 ? "Leo" : "Virgo";
        } else if (month == 9) {
            zodiacSign = day < 23 ? "Virgo" : "Libra";
        } else if (month == 10) {
            zodiacSign = day < 23 ? "Libra" : "Scorpio";
        } else if (month == 11) {
            zodiacSign = day < 22 ? "Scorpio" : "Sagittarius";
        } else {
            zodiacSign = day < 22 ? "Sagittarius" : "Capricorn";
        }

        System.out.println("Your zodiac sign is: " + zodiacSign);
    }
}
