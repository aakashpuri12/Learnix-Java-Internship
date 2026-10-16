package week_1_java_basics;


public class Student {
    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculatePercentage() {
        return calculateTotal() / (double) marks.length;
    }

    public boolean isPassed() {
        for (int mark : marks) {
            if (mark < 35) {
                return false;
            }
        }

        return true;
    }

    public String calculateGrade() {
        if (!isPassed()) {
            return "F";
        }

        double percentage = calculatePercentage();

        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";

        return "E";
    }
}
