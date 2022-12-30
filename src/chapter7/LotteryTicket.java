package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    // intialize whta we know
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public  static void main(String args []){
        // get what we dont know
        int [] ticket = getTicketnumber();
        Arrays.sort(ticket);
        // print the six lottery number
        printTicket(ticket);


    }
    public static int [] getTicketnumber(){

        int [] ticket = new int [LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket [i] = randomNumber;
        }
        return  ticket;
    }

    /**
     *
     * @param ticket with arrays of number to search through
     * @param valueToSearchFor  number to searcg for
     * @return true if number found in the array else return false
     */
    public static boolean search( int []ticket, int valueToSearchFor){
        for (int value : ticket) {
            if (value == valueToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int [] ticket, int valueToSearchFor){
        Arrays.sort(ticket);
        int index = Arrays.binarySearch(ticket,valueToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int [] ticket){
        System.out.println("Your Ticket is: ");
        for (int i = 0; i < LENGTH; i++){
            System.out.print(ticket [i] + " | ");
        }
    }


}
