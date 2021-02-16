import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.jokes = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                jokes.addJoke(newJoke);
            }
            if (command.equals("2")) {
                System.out.println("Drawing the jokes:");
                System.out.println(jokes.drawJoke());
            }

            if (command.equals("3")) {
                System.out.println("Printing the jokes:");
                jokes.printJokes();
            }
        }
    }




}
