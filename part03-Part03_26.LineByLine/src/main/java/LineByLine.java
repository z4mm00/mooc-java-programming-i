
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String typedString = scanner.nextLine();
            if (typedString.equals("")) {
                return;
            }
            String[] words = typedString.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }
    }
}
