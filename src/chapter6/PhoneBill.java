package chapter6;

public class PhoneBill {
    // intialise what we know
    private int id;
    private double baseCost = 0.10;
    private  int allottedMinutes;
    private int minuteUsed;
    private double tax = 0.15;
    private double overageMinuteCost = 0.25;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    public int getMinuteUsed(){
        return minuteUsed;
    }
    public void setMinuteUsed(int minuteUsed){
        this.minuteUsed = minuteUsed;
    }
    public PhoneBill(){
        id = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minuteUsed = 0;
    }

    public PhoneBill(int id){
        this.id = id;
    }

    public  PhoneBill(int id, double baseCost, int allottedMinutes, int minuteUsed){
        this.id = id;
        setBaseCost(baseCost);
        this.allottedMinutes = allottedMinutes;
        this.minuteUsed = minuteUsed;
    }

    public int extraMinuteUsed(){
        int overageMinute = 0;
        if(minuteUsed > allottedMinutes){
            overageMinute = minuteUsed - allottedMinutes;
        }
        return overageMinute;
    }

    public double netCharge(double cost){
        cost = 0;
        if(minuteUsed <= allottedMinutes){
            cost = baseCost * minuteUsed;
            //System.out.println("Your net charge is: " + cost);
            return cost;
        } else {
            cost = (overageMinuteCost * extraMinuteUsed()) + (baseCost * minuteUsed);
            //System.out.println("Your net charge is: " + cost);
            return cost;
        }

    }
    public double grossCharge(){
        double gross = 0;
        //double netTax = netCharge() * tax;
        System.out.println("Your net charge is: " + netCharge(gross));
        return gross =  (netCharge(gross) * tax) + netCharge(gross) ;
    }
}
