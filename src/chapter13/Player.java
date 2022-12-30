package chapter13;

import java.util.Scanner;

public class Player {
    private String name;
    private String guess;
    Coin coin = new Coin();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public void chooseSide() {
        System.out.println("Choose side");
        Scanner scanner = new Scanner(System.in);
        String side = scanner.next();
        if (side == "HEAD" ){
            System.out.println("The player chose: "+ side);
        }else if (side == "TAIL"){
            System.out.println("The player chose: "+ side);
        } else {
        }
    }

}
