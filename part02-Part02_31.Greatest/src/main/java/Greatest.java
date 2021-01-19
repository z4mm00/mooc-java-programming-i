
public class Greatest {

    public static void main(String[] args) {
        //int result = greatest(2, 7, 3);
        int result = greatest(7,7,7);
        System.out.println("Greatest: " + result);
    }

    public static int greatest(int number1, int number2, int number3) {
        int maxNum = 0;
        if (number1 < number2) {
            if (number2 < number3) {
                maxNum = number3;
            } else {
                maxNum = number2;
            }
        } else if (number1 > number2) {
            if (number1 > number3) {
                maxNum = number1;
            } else {
                maxNum = number3;
            }
        } else if (number1 == number2 && number2 == number3) {
            maxNum = number1;
        }
        return maxNum;
    }
}
