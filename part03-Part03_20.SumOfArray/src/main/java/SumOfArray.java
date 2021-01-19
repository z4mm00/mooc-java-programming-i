
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 5, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int index = 0;
        int sumElements = 0;
        while (index < array.length) {
           sumElements += array[index];
           index++;
        }
        return sumElements;
    }
}
