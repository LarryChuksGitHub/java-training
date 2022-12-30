package chapter4;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args []){
        // intiliase the known
        int payRate = 15;
        int maxHourAllowed = 40;
        int minHourAllowed = 1;

        // get the unkown
        System.out.println("Enter hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hourWorked = scanner.nextInt();

        // recieve on only valid housr
        while (hourWorked > maxHourAllowed || hourWorked < minHourAllowed){
            System.out.println("Error. Invalid hour please entered hour that is not more than " + maxHourAllowed + " or not less than " + minHourAllowed);
            hourWorked = scanner.nextInt();
        }
        // make calculation
        double pay = payRate * hourWorked;
        // display output
        System.out.println("Employee pay is: " + pay);

    }
}
