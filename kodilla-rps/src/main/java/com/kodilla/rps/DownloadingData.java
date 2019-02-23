package com.kodilla.rps;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DownloadingData {
    private Player player;
    private Scanner sc = new Scanner(System.in);
    private Scanner scanner = new Scanner(System.in);
    private String name = null;
    private int roundsNumber;
    private boolean correctData = false;

    public Player downLoadingData(){
        questionsAboutName();
        name = sc.next();
        while(!correctData) {
            questionsAboutRound();
            try{
                roundsNumber = scanner.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("You choice a letter not number!");
                return null;
            }
            if (getRoundsNumber() > 0 ) {
                player = new Player(name, getRoundsNumber());
                correctData = true;
                System.out.println();
                System.out.println("Player: " + player.getPlayerName());
                System.out.println("Number of rounds: " + player.getNumberOfRounds());
                System.out.println();
            }else{
                System.out.println("Number of rounds must be higher than 0.");
            }
        }
        HelpGame.printGameSupport();
        return player;
    }

    public void questionsAboutName(){
        System.out.println("Please insert your name: ");
    }

    public void questionsAboutRound(){
        System.out.println("Please insert numbers of round to win: ");
    }

    public Player getPlayer() {
        return player;
    }

    public int getRoundsNumber() {
        return roundsNumber;
    }
}
