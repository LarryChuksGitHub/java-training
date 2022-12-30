package chapter10;

public class Market {
    public static void main(String args []){
        Fruit fruit = new Fruit();

        Fruit banana = new Banana(2.1);
        Fruit apple = new Apple(3);

        if (apple instanceof  Apple){
            ((Apple) apple).removeSeed();
            System.out.println(((Apple) apple).removeSeed());

        }if (banana instanceof Banana){
            ((Banana) banana).peel();
            System.out.println(((Banana) banana).peel());
        }

        System.out.println(banana.makeJuice() + " with "+ banana.getCalories() + " Please drink");
        System.out.println(apple.makeJuice() + " with " + apple.getCalories() +  " Please drink");

    }
}
