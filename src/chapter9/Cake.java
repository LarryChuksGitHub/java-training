package chapter9;

public class Cake {
    protected String flavour;
    protected double price;

    public Cake(){

    }
    public Cake(String flavour, double price){
        this.flavour = flavour;
        this.price = price;

    }
    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
