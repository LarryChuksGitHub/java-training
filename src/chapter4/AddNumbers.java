package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args []){
        // initialise the known
        boolean again;

        // get the unkown
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        do {
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            // sum of the 2 numbers
            int sum = number1 + number2;

            System.out.println("The total is: " + sum);

            // give users the possibility to repeat the actions of they want
            System.out.println("Do you want to do another sum? ");
            again = scanner.nextBoolean();

        } while (again);

    }
}
