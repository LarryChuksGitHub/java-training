package chapter4;

import java.util.Scanner;

public class FindLetter {
    public static void main(String args []){
        // initialize the known
        Scanner scanner = new Scanner(System.in);
        char letterA = 'A';
        char lettera = 'a';
        String text;

        // get the unknown
        System.out.println("Enter a text: ");
        text = scanner.next();
        Boolean letterFound = false;
        int position = 0;
        int i;

        // search for the Letter in the String
        for ( i = 0; i < text.length(); i++){
            if (text.charAt(i) == letterA || text.charAt(i) == lettera){
                position = i + 1;
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("The letter: " + text.charAt(i) + " is at " + position +" position in the text");
        }

        else {
            System.out.println("The letter is not in the text");
        }

        // print output

    }
}
