
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtName = 0;
        String longestName = "";
        int yearSum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] elements = input.split(",");
            if (lenghtName < elements[0].length()) {
                lenghtName = elements[0].length();
                longestName = elements[0];
            }
            yearSum += Integer.valueOf(elements[1]);
            count++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * yearSum) / count);
    }
}
