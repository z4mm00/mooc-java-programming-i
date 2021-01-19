
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                return;
            }
            String[] words = input.split(" "); // Array of the split words
            for (int i = 0; i < words.length; i++) {
                if (words[i].contains("av")) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
