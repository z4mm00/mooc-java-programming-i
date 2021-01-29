
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbList = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                numbList.add(Integer.valueOf(reader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Wrong file name: " + e.getMessage());
            return;
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        for (int number : numbList) {
            if (number >= lowerBound && number <= upperBound) {
                counter++;
            }
        }
        System.out.println("Numbers: " + counter);
    }

}
