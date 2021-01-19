
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numSum = 0;
        int numCount = 0;
        double numAverage = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                numCount = numCount + 1;
                numSum = numSum + number;
            }
            if (number < 0) {
                continue;
            }
            if (number == 0) {
                break;
            }
        }
        if (numCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            numAverage = numSum / numCount;
            System.out.println(numAverage);
        }

    }
}
