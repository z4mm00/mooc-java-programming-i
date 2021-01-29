
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                namesList.add(reader.nextLine());
            }
        }catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }

        if (namesList.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
