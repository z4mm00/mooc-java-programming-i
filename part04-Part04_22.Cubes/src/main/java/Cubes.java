
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cubeResult = 0;
        int inputNum = 0;

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            inputNum = Integer.valueOf(input);
            cubeResult = inputNum * inputNum * inputNum;
            System.out.print(cubeResult);
            System.out.println("");
        }
    }
}
