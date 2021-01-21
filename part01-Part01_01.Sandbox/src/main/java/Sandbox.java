import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = "Hello world!";
            System.out.println("Your string is: " + text);
            System.out.println("What index to print? 9999 to quit");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                return;
            }
            char character = text.charAt(input);
            System.out.println(character);
        }
    }
}
