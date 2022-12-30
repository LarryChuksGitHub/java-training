package chapter13;

import java.security.PublicKey;
import java.util.Random;

public class Coin {
    public static final String HEAD = "HEAD" ;
    private String side;
    public static final String TAIL = "TAIL" ;
    public   final int headNumber = 2;
    public   final int tailNumber = 1;

    public int getHeadNumber() {
        return headNumber;
    }

    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }

    public String getHEAD() {
        return HEAD ;
    }

    public String getTAIL() {
        return TAIL;
    }

    public String flip(){
        if (new Random().nextBoolean()){
            setSide(HEAD);
        } else {
            setSide(TAIL);
        }
        /*
        int randomSideNumber;
        String side = "";
        Random random = new Random();
        randomSideNumber = random.nextInt(headNumber) + tailNumber;
        System.out.println("The random side is: " + randomSideNumber);
        if (randomSideNumber == headNumber){
            side = HEAD;
        }else {
            side = TAIL;
        }*/
        return side;
    }

}
