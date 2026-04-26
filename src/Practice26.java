/*
Student Grade System

Write a Java program that models courses, teachers, and students.
Each course includes both an exam grade and an oral grade.
The oral grade affects the course average with a course-specific percentage.
*/
public class Practice26 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher teacher2 = new Teacher("Fatma Ayse", "90550000001", "PHY");
        Teacher teacher3 = new Teacher("Ali Veli", "90550000002", "CHM");

        Course math1 = new Course("Math", "MAT101", "MAT", 0.10);
        Course physics1 = new Course("Physics", "PHY101", "PHY", 0.20);
        Course chemistry1 = new Course("Chemistry", "CHM101", "CHM", 0.15);
        math1.addTeacher(teacher1);
        physics1.addTeacher(teacher2);
        chemistry1.addTeacher(teacher3);

        Student student1 = new Student("Inek Saban", 4, "140144015", math1, physics1, chemistry1);
        student1.addBulkExamNote(50, 20, 40);
        student1.addBulkOralNote(80, 90, 70);
        student1.isPass();

        Course math2 = new Course("Math", "MAT101", "MAT", 0.10);
        Course physics2 = new Course("Physics", "PHY101", "PHY", 0.20);
        Course chemistry2 = new Course("Chemistry", "CHM101", "CHM", 0.15);
        math2.addTeacher(teacher1);
        physics2.addTeacher(teacher2);
        chemistry2.addTeacher(teacher3);

        Student student2 = new Student("Guduk Necmi", 4, "2211133", math2, physics2, chemistry2);
        student2.addBulkExamNote(100, 50, 40);
        student2.addBulkOralNote(90, 60, 75);
        student2.isPass();

        Course math3 = new Course("Math", "MAT101", "MAT", 0.10);
        Course physics3 = new Course("Physics", "PHY101", "PHY", 0.20);
        Course chemistry3 = new Course("Chemistry", "CHM101", "CHM", 0.15);
        math3.addTeacher(teacher1);
        physics3.addTeacher(teacher2);
        chemistry3.addTeacher(teacher3);

        Student student3 = new Student("Hayta Ismail", 4, "221121312", math3, physics3, chemistry3);
        student3.addBulkExamNote(50, 20, 40);
        student3.addBulkOralNote(50, 20, 40);
        student3.isPass();
    }
}

class Student {
    String name;
    String stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int math, int physics, int chemistry) {
        if (isValidGrade(math)) {
            this.math.examNote = math;
        }

        if (isValidGrade(physics)) {
            this.physics.examNote = physics;
        }

        if (isValidGrade(chemistry)) {
            this.chemistry.examNote = chemistry;
        }
    }

    public void addBulkOralNote(int math, int physics, int chemistry) {
        if (isValidGrade(math)) {
            this.math.oralNote = math;
        }

        if (isValidGrade(physics)) {
            this.physics.oralNote = physics;
        }

        if (isValidGrade(chemistry)) {
            this.chemistry.oralNote = chemistry;
        }
    }

    private boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    private boolean hasAllGrades() {
        return this.math.hasGrades() && this.physics.hasGrades() && this.chemistry.hasGrades();
    }

    public void isPass() {
        if (!hasAllGrades()) {
            System.out.println("Grades are not fully entered.");
            return;
        }

        this.isPass = isCheckPass();
        printNote();
        System.out.printf("Average: %.2f%n", this.average);

        if (this.isPass) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
    }

    public void calcAverage() {
        this.average = (this.math.getCourseAverage() + this.physics.getCourseAverage() + this.chemistry.getCourseAverage()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average >= 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.printf("Math -> Exam: %d, Oral: %d, Course Average: %.2f%n",
                this.math.examNote, this.math.oralNote, this.math.getCourseAverage());
        System.out.printf("Physics -> Exam: %d, Oral: %d, Course Average: %.2f%n",
                this.physics.examNote, this.physics.oralNote, this.physics.getCourseAverage());
        System.out.printf("Chemistry -> Exam: %d, Oral: %d, Course Average: %.2f%n",
                this.chemistry.examNote, this.chemistry.oralNote, this.chemistry.getCourseAverage());
    }
}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralNote;
    double oralWeight;

    public Course(String name, String code, String prefix, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = -1;
        this.oralNote = -1;
        this.oralWeight = oralWeight;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Teacher assigned successfully.");
        } else {
            System.out.println(teacher.name + " cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (this.courseTeacher != null) {
            System.out.println(this.name + " teacher: " + this.courseTeacher.name);
        } else {
            System.out.println("No teacher has been assigned to " + this.name + ".");
        }
    }

    public boolean hasGrades() {
        return this.examNote >= 0 && this.oralNote >= 0;
    }

    public double getCourseAverage() {
        double examWeight = 1.0 - this.oralWeight;
        return (this.examNote * examWeight) + (this.oralNote * this.oralWeight);
    }
}

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}
