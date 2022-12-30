package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorRedo {
    // Initialise what we know
    Scanner scanner = new Scanner(System.in);

    public static void main(String args []){

        PhoneBillCalculatorRedo phoneBillCalculatorRedo = new PhoneBillCalculatorRedo();
        // get what we dont know
        PhoneBill phoneBill = phoneBillCalculatorRedo.getPhoneBillInfo();

        // make calculation
        double bill = phoneBillCalculatorRedo.calculateBill(phoneBill);

        //Print bill
        phoneBillCalculatorRedo.printBill(bill);

    }

    public PhoneBill getPhoneBillInfo(){
        System.out.println("Enter your Phone bill ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter your Phone base cost: ");
        double baseCost = scanner.nextDouble();
        System.out.println("Enter your alloted minutes: ");
        int allottedMinute = scanner.nextInt();
        System.out.println("Enter your the minutes you used: ");
        int usedMinute = scanner.nextInt();
       return new PhoneBill(id,baseCost,allottedMinute,usedMinute);
    }

    public double calculateBill(PhoneBill phoneBill){
       return phoneBill.grossCharge();

    }
    public void printBill(double bill){
        System.out.println("Your bill is " + bill );
    }
}
