import java.util.Scanner;

public class Player {

    private String name;
    private double totalMoney;
    private double bet;

    public void init() {
        System.out.print("Enter your name : ");

        Scanner userInput = new Scanner(System.in);
        this.name = userInput.nextLine();

        System.out.print("Enter amount of money : ");
        this.totalMoney = userInput.nextInt();

    }

    public String getName() {
        return name;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void placeBet(double bet) {
        this.bet = bet;
    }

    public void receiveWinning() {
        this.totalMoney += (this.bet * 35);
    }

    public void deductMoney() {
        this.totalMoney -= this.bet;
    }
}
