package chapter5;

import java.util.Scanner;

public class InstanceCreditCheck {

    // initialize what you know
    static int salaryRequired = 25000;
    static int creditScoreRequired = 700;
    static Scanner scanner = new Scanner(System.in);
    // get what we dont know
    public static double getSalary(){
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getSCore(){
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        return score;
    }

    //check if the user meets up the condition
    public static boolean isRequirementMet(int score, double salary){
        if (salary >= salaryRequired && score >= creditScoreRequired){
            return true;
        } else {
            return false;
        }

    }
    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrat! you are qualified: ");
        }else {
            System.out.println("Sorry you are not qualified: ");
        }
    }

    //notify user

    public static void main(String args []){
        double salary = getSalary();
        int score = getSCore();
       boolean isQualified = isRequirementMet(score,salary);
       notifyUser(isQualified);

    }
}
