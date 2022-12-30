package chapter5;

import java.util.Scanner;

public class PhoneBillCalaculator {
    // intitialse the known
    static double extraMinuteCharge = 0.25;
    static double extraMinuteTax = 0.15;
    static int planMinute;
    static double usedMinute;


    public static int getPlanMinute(){
        System.out.println("Enter your plan Minutes");
         planMinute = scanner.nextInt();
        return planMinute;
    }

    public static double getExtraMinutes(){
        System.out.println("Enter your extra Minutes");
        usedMinute = scanner.nextInt();
        return usedMinute;
    }

    public static boolean isOverThePlan(int planMinute, double usedMinute){
        if (usedMinute > planMinute){
            return true;
        } else {
            return false;
        }

    }

    public static double getUserNetcharge(boolean isChargable){
        double charge = 0;
        if (isChargable == true){
            double extraMinute = usedMinute - planMinute;
           // System.out.println("Your extra minutes is: " + extraMinute);
            charge = extraMinute * extraMinuteCharge;
            System.out.println("Your net charge is: " + charge);
            return  charge;
        }else {
            System.out.println("No Charge for you");
           return charge;
        }
    }

    public static double getUserChargeWithTax(double net){
        double grossCharge = 0;
         //net = getUserNetcharge();
        if (usedMinute > planMinute){
            double taxNet  = extraMinuteTax * net;
            grossCharge = taxNet + net;
            System.out.println("Your gross charge is: " + grossCharge);
        }
        return grossCharge;
    }

    public static void printBill(double gross){

        getUserChargeWithTax(gross);

    }


    static Scanner scanner = new Scanner(System.in);
    public static void main(String args []){

        // initialize the known

        // get the unknown





        // get the unknown
        int planMinute = getPlanMinute();
        double extraMinute = getExtraMinutes();
        // is user over his plan
        boolean isChargable = isOverThePlan(planMinute,extraMinute);
       double userCharge = getUserNetcharge(isChargable);
        // then charge him 15% tax
         double bill = getUserChargeWithTax(userCharge);
        //print the itemized bill


    }

}
