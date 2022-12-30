package chapter9;

public class TasteTester extends Cake{
    public static void main(String args []){
        Cake cake = new Cake("Chocolate", 3.0);
        BirthdayCake birthdayCake = new BirthdayCake(1);
        WeddingCake weddingCake = new WeddingCake(6);

        cake.setPrice(2);
        System.out.println("Cake Flavor: "+ cake.flavour + " and price is: " + cake.getPrice());
        System.out.println("Cake Candle: "+ birthdayCake.getCandle());
        System.out.println("Cake Tier: "+ weddingCake.getTier());
    }
}
