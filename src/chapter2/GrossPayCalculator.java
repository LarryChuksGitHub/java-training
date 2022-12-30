package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main( String arg []){

       // 1. Get the number of Hours
        System.out.println("Enter the hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

       // 2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate: ");
        double payRate = scanner.nextDouble();
        scanner.close();

       // 3. Multiply hours and pay rate
        double grossPay = hours * payRate;

       // 4. Display results
        System.out.println("The gross pay is: " + "$" + grossPay);

    }
}
