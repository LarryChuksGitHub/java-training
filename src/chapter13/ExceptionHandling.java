package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args []){
        //creatFile();
        //inputNumber();
        //creatFileRethrow();
        divideException(7,0);
    }
    public static void creatFile(){
        File file = new File("resource/nonexistenceFile.txt");
        try {
            file.createNewFile();
        }catch (IOException ioException){
            System.out.println("This is io exception");
            //System.out.println("This is io exception" + ioException.getStackTrace());
           ioException.printStackTrace();
        }

    }
    public static void inputNumber(){

        File file = new File("resource/nonexistenceFile.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                double number = fileReader.nextDouble();
                System.out.println("This is the number: " + number);
            }
        }catch (FileNotFoundException | InputMismatchException exception){
            exception.printStackTrace();
        }finally {
            fileReader.close();
        }
    }

    public static void creatFileRethrow() throws IOException{
        File file = new File("resource/nonexistenceFile.txt");
            file.createNewFile();
    }
    public static void calculateSalary(double rate, double hours){
        if (hours > 40){
            throw new IllegalArgumentException("No overtime");
        }

    }

    public static void divideException(int numerator,int denominator){
        double result = 0;
        if (denominator == 0){
            System.out.println("You cannot dive with zero");
        }
           try {
               result = numerator / denominator;
           }catch (Exception exception){
               exception.getMessage();
           } finally {
               System.out.println("Division is fun and the result is: " + result);
           }
        }


}
