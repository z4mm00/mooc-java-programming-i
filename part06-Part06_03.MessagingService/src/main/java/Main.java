import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService whatsApp = new MessagingService();
        Message conversation;
        Scanner scanner = new Scanner(System.in);

        System.out.println("<Message Service>");
        while(true) {
            System.out.println("Enter your name: (Empty to stop)");
            String name = scanner.nextLine();
            if(name.equals("")) {
                break;
            }
            System.out.println("Enter your message:");
            String message = scanner.nextLine();

            conversation = new Message(name, message);
            whatsApp.add(conversation);
        }
        System.out.println("");
        System.out.println("Sent Messages:");
        for(Message message : whatsApp.getMessages()) {
            System.out.println(message);
        }

    }
}
