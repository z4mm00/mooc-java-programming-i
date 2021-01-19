
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        int giftValue = Integer.valueOf(scan.nextLine());
        if(giftValue < 5000){
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            double tax8 = (100 + (giftValue - 5000) * 0.08); // 8% Tax Rate
            System.out.println("Tax: " + tax8);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            double tax10 = (1700 + (giftValue - 25000) * 0.10); // 10% Tax Rate
            System.out.println("Tax: " + tax10);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            double tax12 = (4700 + (giftValue - 55000) * 0.12); // 12% Tax Rate
            System.out.println("Tax: " + tax12);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            double tax15 = (22100 + (giftValue - 200000) * 0.15); // 15% Tax Rate
            System.out.println("Tax: " + tax15);
        } else if (giftValue >= 1000000){
            double tax17 = (142100 + (giftValue - 1000000) * 0.17); // 17% Tax Rate
            System.out.println("Tax: " + tax17);
        }
    }
}
