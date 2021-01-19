
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberGiven = Integer.valueOf(scanner.nextLine());
        if(numberGiven < 0){
            System.out.println(numberGiven * -1);
        } else {
            System.out.println(numberGiven);
        }
    }
}
