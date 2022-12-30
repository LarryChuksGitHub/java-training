package chapter6;

import java.util.Scanner;

public class FlatSizeCalculationRedo {

    //initialize the known
    private Scanner scanner = new Scanner(System.in);

   public static void main(String args []){
        FlatSizeCalculationRedo flatSizeCalculationRedo = new FlatSizeCalculationRedo();

        // get what we dont know
        Rectangle kitchen = flatSizeCalculationRedo.getKitchenDimension();
        Rectangle bathroom = flatSizeCalculationRedo.getBathroomDimension();

        double flatTotalArea = flatSizeCalculationRedo.calculateTotalArea(kitchen,bathroom);

        System.out.println("Flat total area is: " + flatTotalArea);

        flatSizeCalculationRedo.scanner.close();
    }

    public Rectangle getKitchenDimension(){
        System.out.println("Enter the length of your kitchen: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your kitchen: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }


    public Rectangle getBathroomDimension(){
        System.out.println("Enter the length of your bathroom: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your bathroom: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle kitchen, Rectangle bathroom){
       return kitchen.calculateArea() + bathroom.calculateArea();
    }
}
