
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList <Integer> numList = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            numList.add(input);
        }
        int sumNumbers = 0;
        double average = 0;
        for (int number : numList) {
            sumNumbers += number;
        }
        average = (sumNumbers * 1.0) / numList.size();
        System.out.println("Average: " +average);
    }
}
