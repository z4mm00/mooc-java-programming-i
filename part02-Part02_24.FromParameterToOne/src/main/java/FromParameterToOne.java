

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne (7);
    }

    public static void printFromNumberToOne (int number) {
        int count = number;
        while (count <= number && count != 0) {
            System.out.println(count);
            count--;
        }
    }

}
