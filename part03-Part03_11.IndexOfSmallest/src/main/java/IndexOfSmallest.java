
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList <Integer> numberList = new ArrayList<>();
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 9999) {
                break;
            }
            numberList.add(userInput);
        }
        int smallNumber = numberList.get((numberList.size() - 1)); // Getting the last number on the list
        String smallIndex = ""; // Variable to store the Index of the smallest number
        ArrayList <Integer> smallList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {  // Loop to identify the smallest number
            int numberCheck = numberList.get(i);
            if (numberCheck < smallNumber) {
                smallNumber = numberCheck;
            }
        }
        for (int i = 0; i < numberList.size(); i++) {
            int numberCheck = numberList.get(i);
            if (numberCheck == smallNumber) {
                smallIndex += i + " ";
            }
        }

        System.out.println("");
        System.out.println("Smallest number: " + smallNumber);
        System.out.println("Found at index: " + smallIndex);
    }
}
