package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    static Scanner scanner = new Scanner(System.in);
    // intialise the known
    static int [] week;
    public static void main(String args []){
        // get the unknown
           int dayNumber = getDayNumber();
           //get the textual values of the day
        getTextualValue(dayNumber);

        //Print the textual Day of the week

        //
    }

    public static int getDayNumber(){
        int dayNumber = 0;
        System.out.println("Enter the day number of the week: ");
        dayNumber = scanner.nextInt();
        return dayNumber;

    }
    public static void getTextualValue(int dayNumber){
        String [] week = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
/*
        for (int i = 0; i < week.length; i++){
            if (dayNumber == 1){
                System.out.println("The day of the week is: " + week[0]);
                break;
            } else if (dayNumber == 2){
                System.out.println("The day of the week is: " + week[1]);
                break;
            }

        }

        */
        switch (dayNumber){
            case 1:
                System.out.println("The day of the week is: " + week[0]);
                break;
            case 2:
                System.out.println("The day of the week is: " + week[1]);
                break;
            case 3:
                System.out.println("The day of the week is: " + week[2]);
                break;
            case 4:
                System.out.println("The day of the week is: " + week[3]);
                break;
            case 5:
                System.out.println("The day of the week is: " + week[4]);
                break;
            case 6:
                System.out.println("The day of the week is: " + week[5]);
                break;
            case 7:
                System.out.println("The day of the week is: " + week[6]);
                break;
            default:
                System.out.println("Invalid day or number");
                break;

        }

    }


}
