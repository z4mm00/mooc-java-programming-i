
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 5, 8, 6, 900, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        while (index < array.length - 1) {
            System.out.print(array[index] + ", ");
            index++;
        }
        System.out.println(array[array.length - 1]);
    }
}
