import java.util.Scanner;

public class Game {

    private Dealer dealer;
    private Player player;
    private boolean isOver;

    public void init() {

        this.player = new Player();
        this.player.init();

        System.out.println("Welcome to The Roulette Game, " + this.player.getName() );

        Table table = new Table();
        this.dealer = new Dealer(table);

    }

    public void play(){

        while (!this.isOver && this.player.getTotalMoney() > 0) {

            Scanner userInput = new Scanner(System.in);

            System.out.print("Press 1 to play or 2 to quit : ");

            int choice = userInput.nextInt();

            if (choice != 1) {
                this.isOver = true;
                continue;
            }

            System.out.println("Place Your Bet!");

            System.out.print("Enter pocket : ");
            int betPocket = userInput.nextInt();

            if (betPocket > 36 || betPocket < 0) {
                System.out.println("Error , enter number 0 - 36 ");
                continue;
            }

            System.out.print("Enter bet amount :");
            int betAmount = userInput.nextInt();

            if (betAmount > this.player.getTotalMoney()) {
                System.out.println("Sorry, you do not have enough money!");
                continue;
            }

            this.player.placeBet((double)betAmount);

            this.dealer.spinWheel();

            if (betPocket == this.dealer.getParkedPocket()) {

                System.out.println("You win!");
                this.player.receiveWinning();

            } else {

                this.player.deductMoney();

                double playerBalance = this.player.getTotalMoney();

                System.out.println("Remaining money : " + playerBalance);

                if (playerBalance < 1) {
                    System.out.println("You lose!");
                    continue;
                }

                System.out.println("Try again!");


            }

        }

    }

}
