package week_1_java_basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        String[] subjects = {
            "English", "Maths", "Science", "Computer", "Social"
        };

        int[] marks = new int[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter 0 to 100.");
                i--;
            }
        }

        Student student = new Student(name, marks);

        System.out.println("\n===== STUDENT MARK SHEET =====");
        System.out.println("Name: " + name);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Total: " + student.calculateTotal()
                + " / " + (subjects.length * 100));

        System.out.println("Percentage: "
                + student.calculatePercentage() + "%");

        System.out.println("Result: "
                + (student.isPassed() ? "PASS" : "FAIL"));

        System.out.println("Grade: " + student.calculateGrade());

        sc.close();
    }
}
