package chapter13;

import java.util.Scanner;

public class CoinTossGame {
    Coin coin = new Coin();
    Scanner scanner = new Scanner(System.in);
    public static void main(String args []){
        CoinTossGame coinTossGame = new CoinTossGame();
        Player player1 = new Player(coinTossGame.askPlayerName());
        player1.setGuess(coinTossGame.askPlayerToGuess());


        Player player2 = new Player(coinTossGame.askPlayerName());
        if (player1.getGuess().equalsIgnoreCase(Coin.HEAD)){
            player2.setGuess(Coin.TAIL);
        }else {
            player2.setGuess(Coin.HEAD);
        }

        System.out.println("Flipping the coin...");
        coinTossGame.coin.flip();
        System.out.println("The coin landed on: " + coinTossGame.coin.getSide());

        determineWinner(player1, player2, coinTossGame.coin);

      /*
        Player mary = new Player("Mary");
        john.chooseSide();
        String generatedSide = coinTossGame.coin.flip(coinTossGame.coin);
        if (john.getGuess() == generatedSide){
            System.out.println("Player " + john.getName() + " has won, he chose side: " + john.getGuess());
        }else {
            System.out.println("Player " + mary.getName() + " has won, she chose side: " + mary.getGuess() );
        }
        */

    }

    private String askPlayerName(){
        System.out.println("Enter the player's name:");
        return scanner.next();
       // return scanner.nextLine();
    }

    private String askPlayerToGuess(){
       // String prompt = String.format("%s or %s?", coin.getHEAD(), coin.getTAIL());
        //System.out.println(prompt);
        System.out.println("Choose: " + coin.getHEAD() + " or " + coin.getTAIL());
        //String guess = scanner.nextLine();
        String guess = scanner.next();

        while (!guess.equalsIgnoreCase(Coin.HEAD) && !guess.equalsIgnoreCase(Coin.TAIL)){
            errorMessage();
            guess = scanner.next();
            //guess = scanner.nextLine();
        }
        return guess;

    }
    public String errorMessage(){
        String message = "Invalid input Please input letter HEAD or TAIL";
        System.out.println(message);
        return message;
    }

    public static void determineWinner(Player player1, Player player2, Coin coin){
        String winner;
        if (coin.getSide().equalsIgnoreCase(player1.getGuess())){
            winner = player1.getName();
        }else {
            winner = player2.getName();
        }
        System.out.println("the is winner is: " + winner);
    }

}
