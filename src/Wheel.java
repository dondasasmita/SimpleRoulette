public class Wheel {

    private int [] pockets = new int [37];
    private int currentPocket;

    Wheel(){

        for (int i = 0 ; i < this.pockets.length ; i ++) {
            this.pockets[i] = i;
        }
    }

    public void spin() {

        int random = (int) (Math.random() * this.pockets.length);

        System.out.println("Spinning the wheel...");

        //create spinning effect
        for (int i = 0 ; i <= 10 ; i ++) {
            System.out.print("=");
            try {
                Thread.sleep(100); // try and catch has to be used to handle Interrupted Exception
            }
            catch (java.lang.InterruptedException ioe){
                System.out.println("An error has occurred. Restart program or contact the developer");
            }
        }

        this.currentPocket = random;
    }

    public int getCurrentPocket() {
        return currentPocket;
    }
}
