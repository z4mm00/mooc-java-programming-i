
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String varString = scan.nextLine();
        System.out.println("Give an integer: ");
        int varInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double varDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean varBoolean = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + varString);
        System.out.println("You gave the integer " + varInteger);
        System.out.println("You gave the double " + varDouble);
        System.out.println("You gave the boolean " + varBoolean);
    }
}
