public class Table {

    private int [] wheel = new int [37];
    public final String EVEN = "EVEN";
    public final String ODD = "ODD";
    private int pocket;

    Table() {
        for (int i = 0 ; i < wheel.length ; i ++) {
            wheel [i] = i;
        }
    }

    public int[] getWheel() {
        return wheel;
    }

    public void spin() {

        int random = (int) (Math.random() * this.wheel.length);

        System.out.println("Spinning the wheel...");

        //create an effect of spinning
        for (int i = 0 ; i <= 10 ; i ++) {
            System.out.print("=");
            try {
                Thread.sleep(200); // try and catch has to be used to handle Interrupted Exception
            }
            catch (java.lang.InterruptedException ioe){
                System.out.println("An error has occurred. Restart program or contact the developer");
            }
        }

        this.pocket = random;
    }

    public int getPocket() {
        return pocket;
    }
}
