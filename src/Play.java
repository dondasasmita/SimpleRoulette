import java.util.Scanner;

public class Play {

    //the main controller requests users to continue or stop the game.

    public static boolean finished;
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //new game is created
        Dealer game1 = new Dealer();

        while (!finished) {
            System.out.println("Place Your Bet!\n");
            System.out.print("Press 1 to spin or 2 to finish the game : ");
            int choice = userInput.nextInt();
            if (choice == 1) {
                game1.createWheel();
                game1.spinWheel();
            } else finished = true;

        }
    }
}
