
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {      //Adding some delay of 10 milisecs to actually see the timing printed properly
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
