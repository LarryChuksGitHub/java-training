package chapter2;

import java.util.Scanner;

public class CoffeeCupCounter {

    public static void main(String arg []){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day adjective: ");
        String cold = scanner.next();

        System.out.println("Enter the season of the  year: ");
        String yearSeason = scanner.next();

        System.out.println("Enter the number of cups: ");
        int numberOfCups = scanner.nextInt();

        System.out.println("On a " + cold + " " + yearSeason + " day, I drink a minimum of " + numberOfCups + " cups of coffee");
    }
}
