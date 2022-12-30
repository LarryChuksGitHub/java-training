package chapter10;

public class Banana extends Fruit{

    public Banana( double calories){
        super();
        this.calories = calories;
    }
    @Override
    public String makeJuice(){
        String message;
        return message = "Banana Juice is made";
    }

    public String peel(){
        String message = "The banana shell is peeled";
        return message;
    }
}
