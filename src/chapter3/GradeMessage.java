package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        // get User grade
        System.out.println("Enter your grade ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        // use switch to decide grade
        String message;
        switch (grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You have to try harder next time";
                break;
            case "F":
                message = "You failed";
                break;
            default:
                message = "Error. Invalide grade";
        }

        System.out.println(message);

    }
}
