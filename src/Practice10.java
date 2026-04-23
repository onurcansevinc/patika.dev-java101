import java.util.Scanner;

/*
Subjects: Math, Physics, Turkish, Chemistry, Music

Passing Grade: 55

Assignment
If the entered grades are not between 0 and 100, do not include them in the average.
*/
public class Practice10 {
    public static void main(String[] args) {
        double mathGrade;
        double physicsGrade;
        double turkishGrade;
        double chemistryGrade;
        double musicGrade;
        double total = 0;
        int validGradeCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Math grade: ");
        mathGrade = input.nextDouble();
        if (0 <= mathGrade && mathGrade <= 100) {
            total += mathGrade;
            validGradeCount++;
        }

        System.out.print("Enter the Physics grade: ");
        physicsGrade = input.nextDouble();
        if (0 <= physicsGrade && physicsGrade <= 100) {
            total += physicsGrade;
            validGradeCount++;
        }

        System.out.print("Enter the Turkish grade: ");
        turkishGrade = input.nextDouble();
        if (0 <= turkishGrade && turkishGrade <= 100) {
            total += turkishGrade;
            validGradeCount++;
        }

        System.out.print("Enter the Chemistry grade: ");
        chemistryGrade = input.nextDouble();
        if (0 <= chemistryGrade && chemistryGrade <= 100) {
            total += chemistryGrade;
            validGradeCount++;
        }

        System.out.print("Enter the Music grade: ");
        musicGrade = input.nextDouble();
        if (0 <= musicGrade && musicGrade <= 100) {
            total += musicGrade;
            validGradeCount++;
        }

        if (validGradeCount == 0) {
            System.out.println("No valid grades were entered.");
            return;
        }

        double average = total / validGradeCount;

        if (average < 55) {
            System.out.println("You failed.");
        } else {
            System.out.println("Congratulations, you passed.");
        }
        System.out.printf("Your average: %.2f", average);
    }
}
