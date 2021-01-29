
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
//The program asks the user for a file-name(string), and then prints the contents of the selected file
// with a name matching the string provided. You may assume that the user provides a file name that the
// program can find.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(input))) {
            while(reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
