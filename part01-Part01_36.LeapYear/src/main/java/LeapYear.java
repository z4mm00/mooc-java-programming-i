
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int yearToEvaluate = Integer.valueOf(scan.nextLine());
        if(yearToEvaluate % 4 == 0 && yearToEvaluate % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (yearToEvaluate % 100 == 0 && yearToEvaluate % 400 == 0){
            System.out.println("The year is a leap year");
        } else {
            System.out.println("Te year is not a leap year");
        }
    }
}
