public class Dealer {

    private Table table;

    Dealer(Table table) {
        this.table = table;
    }

    public void spinWheel () {

        this.table.spin();

        // print out the number and upon showing the number the statement below will determine if it is even or odd
        if (this.table.getPocket() % 2 == 0) {
            System.out.println("\nThe number is : " + this.table.getPocket() + " - " + this.table.EVEN + "\n");
        } else {
            System.out.println( "\n The number is : " + this.table.getPocket() + " - " + this.table.ODD + "\n");
        }

    }

    public Table getTable() {
        return table;
    }

}
