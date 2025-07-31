package assignment;

import java.util.*;

public class Q12 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Arjun", 85, 92, 78));
        students.add(new Student("Bhavana", 76, 65, 80));
        students.add(new Student("Chitra", 88, 90, 84));
        students.add(new Student("Dinesh", 60, 75, 70));
        students.add(new Student("Esha", 90, 88, 95));
        students.add(new Student("Farhan", 55, 60, 50));
        students.add(new Student("Geeta", 70, 72, 68));
        students.add(new Student("Harsha", 81, 79, 83));

        System.out.println("\n1. Sorted by Roll Number:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNo))
                .forEach(s -> System.out.println(s.getRollNo() + " - " + s.getStudName()));

        System.out.println("\n2. Student with Highest Percentage:");
        Student topper = students.stream()
                .max(Comparator.comparingDouble(Student::getPercentage)).get();
        System.out.println(topper.getRollNo() + " - " + topper.getStudName());

        System.out.println("\n3. Student with Highest Marks in Maths:");
        Student bestInMaths = students.stream()
                .max(Comparator.comparingInt(Student::getMarksInMaths)).get();
        System.out.println(bestInMaths.getRollNo() + " - " + bestInMaths.getStudName());

        System.out.println("\n4. Sorted by (Maths + Science) Total:");
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> {
                    int total = s.getMarksInMaths() + s.getMarksInScience();
                    System.out.println(s.getRollNo() + " - " + s.getStudName() + " (Maths+Science: " + total + ")");
                });

        System.out.println("\n5. Full Rank List (Descending by %):");
        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getPercentage(), s1.getPercentage()))
                .forEach(s -> System.out.printf("Roll: %d - %s | Total: %d | %%: %.2f\n",
                        s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage()));
    }
}

// Not public — allowed to be in the same file
class Student {
    private static int nextRollNo = 1;

    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student(String studName, int eng, int maths, int science) {
        this.rollNo = nextRollNo++;
        this.studName = studName;
        this.marksInEng = eng;
        this.marksInMaths = maths;
        this.marksInScience = science;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}


