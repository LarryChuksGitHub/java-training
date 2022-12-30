package chapter3;
/*
All Salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args []){

        //declare and initialise the known
        int salary = 1000;
        int quota = 10;
        int bonus = 250;

        // find the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee sales: ");
        int sales = scanner.nextInt();

        // make the calculation and decision
        if(sales > quota){
            salary = salary + bonus;
        }else {
            salary = salary;
            //System.out.println("Next time make more sales to get bigger salary");
        }
        System.out.println("The employee salary is: " + salary);
        // display the result

    }
}
