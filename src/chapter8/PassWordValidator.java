package chapter8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordValidator {
    // Intialize what we know
    static String password;
    static Scanner scanner = new Scanner(System.in);
    static String username = "larrychuks";
    static String oldPassword = "Test1357+";
    static int requiredPasswordLength = 8;

    public static void main( String args []){

        password = getThePassword();

        validatePassword(password);

    }
    public static String getThePassword(){
        String password = new String();
        System.out.println("Enter your password for validation: ");
        password = scanner.next();
        return password;
    }

    /*
    public static void validatePassword(String password){
        var modifiedPassword = new StringBuilder(password);
        if (modifiedPassword.length() >= requiredPasswordLength){
            for (int i = 0; i < modifiedPassword.length(); i++){
                if (Character.isUpperCase(modifiedPassword.charAt(i))){
                    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                    Matcher matcher = pattern.matcher(modifiedPassword);
                    boolean isPasswordContainsSpecialCharacter = matcher.find();
                    if (isPasswordContainsSpecialCharacter){
                        if (!modifiedPassword.equals(username)){
                            if (!modifiedPassword.equals(oldPassword)){
                                i++;
                                System.out.println("Your password is valid");
                                break;
                            }else {
                                System.out.println("Your password and old password must not be the same");
                                //getThePassword();
                                password = getThePassword();
                                validatePassword(password);
                            }
                        } else {
                            System.out.println("Your password and username must not be the same");
                            password = getThePassword();
                            validatePassword(password);
                        }
                    } else {
                        System.out.println("Your password does not contain special character");
                        password = getThePassword();
                        validatePassword(password);
                    }
                }
                else {
                    System.out.println("Your password does not contain upper case");
                    password = getThePassword();
                    validatePassword(password);
                }
            }
        }
        else {
            System.out.println("Your password is too short please enter a password not less than: " + requiredPasswordLength);
             password = getThePassword();
             validatePassword(password);

        }
    }

    */
    public static void validatePassword( String password){
        //var modifiedPassword = new StringBuilder(password);
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(password);
        boolean isPasswordContainsSpecialCharacter = matcher.find();
        for (int i = 0; i < password.length(); i++){
            if (password.length() < requiredPasswordLength){
                printPasswordRules();
               // validatePassword(password);
                break;

            } else if (password.equals(password.toUpperCase())){
                printPasswordRules();
               // password = getThePassword();
               // validatePassword(password);
                break;
            }
            else if (!isPasswordContainsSpecialCharacter){
                printPasswordRules();
               // password = getThePassword();
              //  validatePassword(password);
                break;


            } else if (username.equals(password)){
                printPasswordRules();
                //password = getThePassword();
               // validatePassword(password);
                break;
            } else if (password.equals(oldPassword)){
                printPasswordRules();
               // password = getThePassword();
               // validatePassword(password);
                break;
            }else {
                //i++;
                System.out.println("Your password is valid");
                break;
            }

        }

    }
    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }
}
