
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(3);
        System.out.println("The sum of numbers: ");
        System.out.println(sum(list));
    }

    public static int sum(ArrayList <Integer> numbers) {
        int numberSum = 0;
        for (int number: numbers) {
            numberSum += number;
        }
        return  numberSum;
    }
}
