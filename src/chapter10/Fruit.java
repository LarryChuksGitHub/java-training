package chapter10;

public class Fruit {
    protected double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    protected String makeJuice(){
        String message = "Juice is made";
        return message;
    }
}
