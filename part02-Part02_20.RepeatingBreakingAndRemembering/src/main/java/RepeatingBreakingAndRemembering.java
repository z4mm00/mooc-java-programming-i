
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sumNums = 0;
        int numCount = 0;
        double numAverage = 0;
        int evenCount = 0;
        int oddcount = 0;
        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            if (number >= 0) {
                sumNums += number;
                numCount++;
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddcount++;
                }

            }
        }
        numAverage = (sumNums * 1.0) / numCount;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumNums);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " + numAverage);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddcount);
    }
}
