package chapter3;

/*
To qualify for a loan, a person must make at least 30,000
and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args []){

        // initialise the known
        int requiredSalary = 30000;
        int requiredYears = 2;

        // get the unknown
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years at you current job: ");
        double years = scanner.nextDouble();

        // make a decision und print output
        if(salary >= requiredSalary){
            if(years >= requiredYears){
                System.out.println("Congrat, you are qualified for the loan");
            }
            else {
                System.out.println("Sorry, you did not meet the required " + requiredYears + "year at your current job");
            }

        } else {
        System.out.println("Sorry, you did not meet the required " + requiredSalary + " for the loan");
        }
    }

    }

