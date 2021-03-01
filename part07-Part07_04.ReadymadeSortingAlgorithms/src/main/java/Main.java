import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arrayStrings = {"sam", "Kiki", "Maki", "Pita", "Jey", "Pau"};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(7);
        integers.add(2);
        integers.add(10);
        integers.add(-3);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("cat");
        strings.add("zombie");
        strings.add("yellow");
        strings.add("bear");

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println(Arrays.toString(arrayStrings));
        sort(arrayStrings);
        System.out.println(Arrays.toString(arrayStrings));
        System.out.println("");
        System.out.println(integers);
        sortIntegers(integers);
        System.out.println(integers);
        System.out.println("");
        System.out.println(strings);
        sortStrings(strings);
        System.out.println(strings);
    }

    public static void sort (int[] array) {
        Arrays.sort(array);
    }

    public static void sort (String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers (ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings (ArrayList<String> strings) {
        Collections.sort(strings);
    }


}
