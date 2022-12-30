package chapter3;

import java.util.Scanner;

/*
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message
For those who don't they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String args []){

        // Initialise the known
        int quota = 10;

        // get the unknown
        System.out.println("Enter the number of sale the employee made: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        // make decision and display result and output
        if(sales >= quota)
            System.out.println("Congrats, you made the expected number of sales");
        else{
            int missedSales = quota - sales;
            System.out.println("Oh you did not meet the quota, you are " + missedSales + " sales behind");
        }
    }

}
