
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
            numbers.add(luku);
        }
        int listCount = numbers.size() - 1;
        for (int i = 0; i <= listCount; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
