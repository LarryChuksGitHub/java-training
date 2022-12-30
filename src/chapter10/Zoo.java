package chapter10;

public class Zoo {

    public static void main(String args[]){
        Animal rocky = new Dog();
        rocky.makeSound();
        feedAnimal(rocky);


        rocky = new Cat();
       // ((Cat)rocky).scratch();
        //Cat jerry = new Cat();
        rocky.makeSound();
        feedAnimal(rocky);
        //((Cat)rocky).scratch();



    }
    public static void feedAnimal(Animal animal){
        if (animal instanceof Dog){
            System.out.println("this is your dog food");
        } else if (animal instanceof Cat)
        System.out.println("this is your cat food");

    }
}
