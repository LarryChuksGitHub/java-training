package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main( String arg []){
        //initialize the known
        int quantity = 0;
        double total = 0;
        double price;
        // get the number of item
        System.out.println("Enter the number of items");
        Scanner scanner = new Scanner(System.in);
        quantity = scanner.nextInt();

        // tally the cost of the items
        for (int i = 0; i < quantity; i++){
            System.out.println("Enter the price of items");
            price = scanner.nextInt();
            total = total + price;
        }

        // print the output
        System.out.println("The total price is: " + total);
    }
}
