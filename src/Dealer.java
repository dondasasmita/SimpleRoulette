public class Dealer extends Table {

    public void spinWheel () {

        //spin the wheel and pick a random number
        int random = (int) (Math.random() * wheel.length);
        System.out.println("Spinning the wheel...");

        //create an effect of spinning wheel, it delays the number to be shown to user.
        for (int i = 0 ; i <= 10 ; i ++) {
            System.out.print("=");
            try {
                Thread.sleep(200); // try and catch has to be used to handle Interrupted Exception
            }
            catch (java.lang.InterruptedException ioe){
                System.out.println("An error has occurred. Restart program or contact the developer");
            }
        }
        // print out the number and upon showing the number the statement below will determine if it is even or odd
        if (wheel[random] % 2 == 0) {
            System.out.println("\nThe number is : " + wheel[random] + " - " + even + "\n");
        } else
            System.out.println( "\n The number is : " + wheel[random] + " - " + odd + "\n");
    }
}
