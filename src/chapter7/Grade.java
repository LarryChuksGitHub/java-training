package chapter7;

import java.util.Scanner;

public class Grade {
    // Initialize what we know
    static Scanner scanner = new Scanner(System.in);
    static int numberOfGrade;

    public static void main(String args []){
        // get the number of grades
        numberOfGrade = getNumberOfGrade();
        //get the grades
        int [] grades = getGrades();
        // calculate the average
        calculateAverageGrade(grades);
        // print the highest grade
        int lowest = getLowestGrade(grades);
        System.out.println("The lowest grade is: " + lowest);
        // print the lowest grade
        int highest =  getHighestGrade(grades);
        System.out.println("The highest grade is: " + highest);
    }
    public static int getNumberOfGrade(){
        System.out.println("Enter number of grades: ");
        int number = scanner.nextInt();
        return number;
    }
    public static int [] getGrades(){
        int [] grades = new int[numberOfGrade];
        for (int i = 0; i < numberOfGrade; i++){
            System.out.println("Enter your grade: ");
            grades[i] = scanner.nextInt();
        }
        return grades;
    }
    public static void calculateAverageGrade(int [] grades){
        int sum = 0;
        for (int i = 0; i < numberOfGrade; i++){
            sum = sum + grades [i];
        }
        int average = sum / numberOfGrade;
        System.out.println("The average grade is: " + String.format("%2.f", average));
    }

    public static int getLowestGrade(int [] grades){
        int lowestGrade = grades [0];
        for (int i = 0; i < numberOfGrade; i++){
            if ( grades [i] < lowestGrade){
                lowestGrade = grades [i];
            }
        }
        return lowestGrade;
    }
    public static int getHighestGrade(int [] grades){
        int highestGrade = grades [0];
        for (int i = 0; i < numberOfGrade; i++){
            if ( grades [i] > highestGrade){
                highestGrade = grades [i];
            }
        }
        return highestGrade;
    }
}
