public class Table {

    private Wheel wheel;
    public final String EVEN = "EVEN";
    public final String ODD = "ODD";

    Table() {
        this.wheel = new Wheel();
    }

    public Wheel getWheel() {
        return wheel;
    }
}
