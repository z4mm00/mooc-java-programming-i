import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
//        System.out.println("Smallest number is: " + smallest(array));
//        System.out.println("Index of Smallest is: " + indexOfSmallest(array));
//        System.out.println("Index of Smallest from index is: " + indexOfSmallestFrom(array, 2));
//
//        System.out.println(Arrays.toString(array));
//
//        swap(array, 1, 0);
//        System.out.println(Arrays.toString(array));
//
//        swap(array, 0, 3);
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("");
        sort(array);
    }

    public static int smallest (int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest (int[] array) {
        int smallest = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom (int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexSmallestFrom = 0;
        for(int i = startIndex + 1; i < table.length; i++) { // Get the smallest element from the given Index
            if (smallest > table[i]) {
                smallest = table[i];
            }
        }
        for (int i = 0; i < table.length; i++) {  // Search the identified smallest element in the main array
            if(smallest == table[i]) {
                indexSmallestFrom = i;
            }
        }
        return  indexSmallestFrom;
    }

    public static void swap (int[] array, int index1, int index2) {
        int element1 = array[index1];
        int element2 = array[index2];
        for (int i = 0; i < array.length; i++) { // Finding the desired index and swap elements
            if (i == index1) {
                array[i] = element2;
            }
            if (i == index2) {
                array[i] = element1;
            }
        }
    }

    public static void sort (int[] array) {
        int smallIndex = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            smallIndex = indexOfSmallestFrom(array,i);
            swap(array,i,smallIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
