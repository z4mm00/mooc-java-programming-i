import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private BirdRegistry registry;

    public UserInterface (Scanner scanner, BirdRegistry newDataBase) {
        this.scan = scanner;
        this.registry = newDataBase;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                registry.add(new Bird(name, latinName));
            }
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                if (!registry.observation(birdName)) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                registry.getBirdsDatabase();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                Bird oneBird = registry.getOneBird(birdName);
                System.out.println(oneBird);
            }
        }
    }
}
