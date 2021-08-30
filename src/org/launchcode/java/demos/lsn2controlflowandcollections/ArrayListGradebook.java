package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish):");
        // Get student names
        do {
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                students.add(newStudent);
                System.out.println(("...added " + newStudent +" to the roster. anyone else? :)"));
            }
        } while(!newStudent.equals(""));

        // Get student grades
        for (String student : students) {
            System.out.println("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);

        }
        System.out.println(students);
        for (String student : students){
            System.out.println("Color for " + student + ": ");
            String color = input.next();
            colors.add(color);
        }


        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ") " +colors.get(i));
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
