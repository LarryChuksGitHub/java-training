package chapter9;

public class WeddingCake extends Cake{
    private int tier;

    public WeddingCake(int tier){
        this.tier = tier;

    }
    public int getTier() {
        return tier;
    }


    public void setTier(int tier) {
        this.tier = tier;
    }
}
