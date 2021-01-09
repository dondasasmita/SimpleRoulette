import java.util.Scanner;

public class RouletteApp {

    public static void main(String[] args) {

        boolean finished = false;

        Scanner userInput = new Scanner(System.in);

        //new game is created
        Dealer dealer = new Dealer();

        while (!finished) {

            System.out.println("Place Your Bet!\n");

            System.out.print("Press 1 to spin or 2 to finish the game : ");

            int choice = userInput.nextInt();

            if (choice == 1) {
                dealer.spinWheel();
            } else {
                finished = true;
            }

        }
    }
}
