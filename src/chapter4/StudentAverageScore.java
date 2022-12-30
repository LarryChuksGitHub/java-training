package chapter4;

import java.util.Scanner;

public class StudentAverageScore {

    public static void main (String args []){

        // initialize the known
        int numberOfStudents = 24;
        int numberOfTest = 4;
        int total;

        // get the unknown
        System.out.println("Enter the student score for the test: ");
        Scanner scanner = new Scanner(System.in);

        // loop through the students
        for (int i = 0; i < numberOfStudents; i++){
            total = 0;
            for (int j = 0; j < numberOfTest; j++){
                int score = scanner.nextInt();
                total = total + score;
                System.out.println("The total score of test number: " + (j+1) + " is " + total);
            }
            int average = total / numberOfTest;
            System.out.println("The average score of student number: " + (i+1) + " is " + average);

        }


    }
}
