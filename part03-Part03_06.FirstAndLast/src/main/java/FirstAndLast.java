
import java.util.Scanner;
import java.util.ArrayList;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println(list.get(0));
        int lastElement = list.size() - 1;
        System.out.println(list.get(lastElement));
    }

}