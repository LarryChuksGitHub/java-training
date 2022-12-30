package chapter10;

public class Apple extends Fruit{

    public Apple( double calories){
        super();
        this.calories = calories;
    }
    @Override
    public String makeJuice(){
        String message;
      return message =  "Apple Juice is made";
    }

    public String removeSeed(){
        String message = "The seeds of Apple are removed";
        return message;
    }
}
