public class Table {

    public int [] wheel = new int [37]; // array as the wheel
    public String even = "EVEN"; // this will be called when even numbers are picked in the spinWheel method
    public String odd = "ODD"; // this will be called when odd numbers are picked in the spinWheel method

    //roulette wheel, has 37 "boxes" numbered 0 to 36.
    // This method populates the wheel with numbers 0 - 36 using for loop.

    public void createWheel() {

        for (int i = 0 ; i < wheel.length ; i ++) {
            wheel [i] = i;
        }
    }

}
