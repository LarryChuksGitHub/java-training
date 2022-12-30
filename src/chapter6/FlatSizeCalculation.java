package chapter6;

public class FlatSizeCalculation {
    public static void main(String args []){


        // calculate the size of room1
        Rectangle room1 = new Rectangle();
        room1.setWidth(2);
        room1.setLength(2); ;
        double room1Area = room1.calculateArea();

        //calculate the size of room2
        Rectangle room2 = new Rectangle(3,3);
        double romm2Area = room2.calculateArea();
        // get the total size of the flat
        double total = room1Area + romm2Area;
        System.out.println("The Size of the flat is: " + total);

    }
}
