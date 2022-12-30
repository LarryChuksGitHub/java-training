package chapter4;

import java.util.Random;

public class RollDieGame {
    public static void main(String args []){
        // initialise what we know
        int winSpace = 20;
        int dieRollNumber = 5;
        int rollResult;
        int userSpace = 0;

        //get what is unknown
            // Generate a random number 1-6 for the die roll
        Random random = new Random();
        // Use For loop to advance the user on the space
        while (userSpace < winSpace){
            for (int j = 0; j < dieRollNumber; j++){
                //rollResult = 0;
                    rollResult = random.nextInt(6) + 1;
                   // if(rollResult !=0) break;
                   // if(rollResult !=0);
                    System.out.println("The " + (j+1) + " Roll " + " yield the the result: " + rollResult);
                    userSpace = userSpace + rollResult;
                    int spaceAhead = winSpace - userSpace;

                    if (winSpace == userSpace){
                        System.out.println(" Congrats! You have won the space : " + userSpace);
                        break;
                    }else if(userSpace > winSpace){
                       int spaceExceeded = userSpace - winSpace;
                        System.out.println(" you are: " + spaceExceeded + " above the win space " + winSpace);
                        break;
                    }else {
                        System.out.println(" You are in space: " + userSpace +" Space ahead is: " + spaceAhead);
                    }

                //System.out.println("The die number ist: " + rollResult);

            }

        }
            //Use for loop to advance the user on the die rolls

        // Tell user his space and how many space they have to win // Win Space is 20
        // If get win pace before the 5 roll end the game

        //If the space is greater or less than win space (20) they have lost
    }
}
