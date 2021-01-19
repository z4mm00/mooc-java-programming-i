
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numSum = 0;
        int numCount = 0;
        double numAverage = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                numCount = numCount + 1;
                numSum = numSum + number;
            }
            if (number == 0) {
                break;
            }
        }
        numAverage = numSum / numCount;
        System.out.println("Average of the numbers: " + numAverage);
    }
}
