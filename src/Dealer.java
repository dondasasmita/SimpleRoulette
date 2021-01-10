public class Dealer {

    private Table table;

    /**
     * Variable to store where the ball is currently parked after a spin
     */
    private int parkedPocket;

    Dealer(Table table) {
        this.table = table;
    }

    public void spinWheel () {

        this.table.getWheel().spin();

        this.parkedPocket = this.table.getWheel().getCurrentPocket();

        // print out the number and upon showing the number the statement below will determine if it is even or odd
        if (this.parkedPocket % 2 == 0) {
            System.out.println("\nThe number is : " + this.parkedPocket + " - " + this.table.EVEN + "\n");
        } else {
            System.out.println( "\n The number is : " + this.parkedPocket + " - " + this.table.ODD + "\n");
        }

    }

    public int getParkedPocket() {
        return parkedPocket;
    }
}
