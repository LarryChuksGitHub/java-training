package chapter3;

import java.util.Scanner;

public class GameChange {

    public static void main(String args []){
        // initialise what what we know
        int oneDollar = 1;

        //get what we dont know
        System.out.println("Enter the how much pennie you have: ");
        Scanner scanner = new Scanner(System.in);
        double penny = scanner.nextDouble();
        penny = penny/100;

        System.out.println("Enter the how much nickels you have: ");
        double nickel = scanner.nextDouble();
        nickel = nickel/20;

        System.out.println("Enter the how much dimes you have: ");
        double dime = scanner.nextDouble();
        dime = dime/10;

        System.out.println("Enter the how much quarter you have: ");
        double quarter = scanner.nextDouble();
        quarter = quarter/4;


        // count the values of all the quantities entered
        double valueEntered = penny + nickel + dime + quarter;

        // make decision for win or not win
        if(valueEntered == oneDollar){
            System.out.println("Congrats! you have won");
        }else if(valueEntered < oneDollar) {
            double behind = oneDollar - valueEntered;
            System.out.println("you are: " + behind + " dollar behind");
        }else {
            double ahead = valueEntered - oneDollar;
            System.out.println("you are: " + ahead + " dollar ahead");
        }

    }
}
