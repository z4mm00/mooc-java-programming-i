import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int programLength = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(programName, programLength));
        }
        System.out.print("Program's maximum duration? ");
        int maxLength = Integer.valueOf(scanner.nextLine());

        for(TelevisionProgram program : programs) {
            if(program.getDuration() <= maxLength) {
                System.out.println(program);
            }
        }
    }
}
