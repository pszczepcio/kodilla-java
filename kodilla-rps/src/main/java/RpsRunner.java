import com.kodilla.rps.*;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        GameOn gameOn = new GameOn();
        boolean end = false;
        boolean start = false;
        Scanner scanner = new Scanner(System.in);
        String choice;

        while(!end){
            if(!start){
                gameOn.playGame();
            }
            System.out.println("\nIf you want to end game press \" X \" or if you want play again press \" N \"");
            choice = scanner.next();
            end = NextOrFinishGame.finishGame(choice);
            start = NextOrFinishGame.nextGame(choice);
        }
    }
}
