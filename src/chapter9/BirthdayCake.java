package chapter9;

public class BirthdayCake extends Cake{
    private int candle;

    public BirthdayCake(int candle){
        super("Chokolate",2.0);
        this.candle = candle;
    }

    public int getCandle() {
        return candle;
    }

    public void setCandle(int candle) {
        this.candle = candle;
    }
}
