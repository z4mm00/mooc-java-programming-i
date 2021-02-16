import java.util.Scanner;

public class UserInterface {

    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.toDoList = list;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            }
            if(command.equals("add")) {
                System.out.print("To add: ");
                String newTask = scanner.nextLine();
                toDoList.add(newTask);
            }
            if(command.equals("list")) {
                toDoList.print();
            }
            if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int itemToRemove = Integer.valueOf(scanner.nextLine());
                toDoList.remove(itemToRemove);
            }
        }
    }

}

