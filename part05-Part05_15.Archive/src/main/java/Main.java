
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifierTyped = scanner.nextLine();
            if(identifierTyped.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nameTyped = scanner.nextLine();
            if(nameTyped.equals("")) {
                break;
            }
            Archive newArchive = new Archive(identifierTyped,nameTyped);
            if (!archives.contains(newArchive)) {  //Condition to check if the Archive List does not contain the new entered Archive object.
                archives.add(newArchive);
            } else {
                for(Archive archive : archives) {
                    if(!newArchive.getIdentifier().equals(archive.getIdentifier())){
                        archives.add(newArchive);
                    }
                }
            }
        }
        System.out.println("==Items==");
        for(Archive archive : archives) {
            System.out.println(archive);
        }

    }
}
