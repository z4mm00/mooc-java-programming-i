
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0; //Variable to store the oldest Age
        String oldestName = ""; // Variable to store the oldest Name
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {   // Halt the program when entering an empty string.
                break;
            }
            String[] parts = input.split(",");   // Splitting the String input by coma
            int givenAge = Integer.valueOf(parts[1]); // Extracting the second input like age: sebastian,8
            if (oldestAge <= givenAge) {
                oldestAge = givenAge; // Assigning the bigger value to oldestAge variable
                oldestName = parts[0]; // Also assigning the name of the oldest (Bigger number)
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
