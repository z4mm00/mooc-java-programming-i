
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSum = 0;
        int numCount = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                numSum = numSum + number;
                numCount = numCount + 1;
            }
            if (number ==0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + numCount);
        System.out.println("Sum of the numbers: " + numSum);
    }
}
