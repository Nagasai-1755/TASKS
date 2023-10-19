package com.first;

import java.util.Scanner;

class Student {
    private int[] marks = new int[6];
    private double cgpa;

    public void setMarks(int[] marks) {
        // Ensure marks are between 0 and 100
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 0 && marks[i] <= 100) {
                this.marks[i] = marks[i];
            } else {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return;
            }
        }
    }

    public void calculateCGPA() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averageMarks = (double) totalMarks / marks.length;
        cgpa = (averageMarks / 100) * 10;
    }

    public double getCGPA() {
        return cgpa;
    }
}

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter marks out of 100 for 6 subjects:");
        int[] marks = new int[6];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        student.setMarks(marks);
        student.calculateCGPA();

        System.out.println("\nCGPA: " + student.getCGPA());

        scanner.close();
    }
}