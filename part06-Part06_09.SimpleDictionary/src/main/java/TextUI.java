import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String commandTyped = scanner.nextLine();
            if(commandTyped.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if(commandTyped.equals("add")) {
                System.out.print("Word: ");
                String wordTyped = scanner.nextLine();
                System.out.print("Translation: ");
                String transTyped = scanner.nextLine();
                dictionary.add(wordTyped, transTyped);
                continue;
            }
            if(commandTyped.equals("search")) {
                System.out.print("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                if(dictionary.translate(wordToTranslate) == null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                    continue;
                }
                System.out.println("Translation: " + dictionary.translate(wordToTranslate));
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
