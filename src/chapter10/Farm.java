package chapter10;

public class Farm {

    public static void main(String args []){
        Animal pig = new Pig();
        pig.makeSound();
        Animal duck = new Duck();
        duck.makeSound();
        System.out.print("The duck eats ");
        duck.eat();
    }
}
